package clases;

import conexionbd.ConexionMySQL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class trabajadores  extends turnos{
    
    
    private ConexionMySQL conexionDB;
    
    private double sueldo;
    private String puesto;

    public trabajadores() {
        conexionDB = new ConexionMySQL();
    }

    
    public trabajadores(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS, String CORREO, String DIRECCION, String TELEFONO, String FECHA_NACIMIENTO, String NOMBRE_TURNO, String HORA_INICIO, String HORA_FIN, String puesto, double sueldo) {
        super(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, NOMBRE_TURNO, HORA_INICIO, HORA_FIN);

        this.sueldo = sueldo;
        this.puesto = puesto;
        conexionDB = new ConexionMySQL();
    }
    public String obtenerId(String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS) {
        ConexionMySQL conexionDB = new ConexionMySQL();
        String consulta = "SELECT P.PERSONAS_ID FROM PERSONAS P WHERE DNI = ? AND NOMBRE = ? AND APELLIDOS_PATERNOS = ? AND APELLIDOS_MATERNOS = ?";
    
        try (Connection connection = conexionDB.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, DNI);
            preparedStatement.setString(2, NOMBRE);
            preparedStatement.setString(3, APELLIDOS_PATERNOS);
            preparedStatement.setString(4, APELLIDOS_MATERNOS);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("PERSONAS_ID");
            } else {
                return "no se encontro ningun cliente\nregistrado";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public String obtenerDNI(String DNI) {
        ConexionMySQL conexionDB = new ConexionMySQL();
        String consulta = "SELECT P.DNI FROM PERSONAS P WHERE DNI = ?";
    
        try (Connection connection = conexionDB.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, DNI);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("DNI");
            } else {
                return "no se encontro ningun dni registrado";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }

    
    
    
    
    public boolean nuevo_Trabajador(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDO_P, String APELLIDO_M, String CORREO, String DIRECCION, String TELEFONO, Date FECHA_NACIMIENTO, String NOMBRE_TURNO, Time HORA_INICIO, Time HORA_FIN, String CARGO, Double SUELDO) {
        Connection conexion = conexionDB.conectar();
        String consultaCuentas = "INSERT INTO CUENTAS (USUARIO, CONTRASENA, PERMISOS) VALUES (?, ?, ?)";
        String consultaPersonas = "INSERT INTO PERSONAS (CUENTAS_ID, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO) VALUES (LAST_INSERT_ID(),?,?,?,?,?,?,?,?)";
        String consultaTurnos = "INSERT INTO TURNOS (NOMBRE_TURNO, HORA_INICIO, HORA_FIN) VALUES (?,?,?)";
        String consultaTrabajadores = "INSERT INTO TRABAJADORES (PERSONAS_ID, PUESTO, SUELDO, TURNO_ID) VALUES (?,?,?,LAST_INSERT_ID())";

        PreparedStatement preparedStatementCuentas = null;
        PreparedStatement preparedStatementPersonas = null;
        PreparedStatement preparedStatementTurnos = null;
        PreparedStatement preparedStatementTrabajadores = null;

        try {
            
            preparedStatementCuentas = conexion.prepareStatement(consultaCuentas);
            preparedStatementCuentas.setString(1, user);
            preparedStatementCuentas.setString(2, pasword);
            preparedStatementCuentas.setString(3, permisos);
            int filasAfectadasCuentas = preparedStatementCuentas.executeUpdate();

            if (filasAfectadasCuentas > 0) {
                preparedStatementPersonas = conexion.prepareStatement(consultaPersonas);
                preparedStatementPersonas.setString(1, DNI);
                preparedStatementPersonas.setString(2, NOMBRE);
                preparedStatementPersonas.setString(3, APELLIDO_P);
                preparedStatementPersonas.setString(4, APELLIDO_M);
                preparedStatementPersonas.setString(5, CORREO);
                preparedStatementPersonas.setString(6, DIRECCION);
                preparedStatementPersonas.setString(7, TELEFONO);
                preparedStatementPersonas.setDate(8, FECHA_NACIMIENTO);
                int filasAfectadasPersonas = preparedStatementPersonas.executeUpdate();

                if (filasAfectadasPersonas > 0) {
                    
                    preparedStatementTurnos = conexion.prepareStatement(consultaTurnos);
                    preparedStatementTurnos.setString(1, NOMBRE_TURNO);
                    preparedStatementTurnos.setTime (2, HORA_INICIO);
                    preparedStatementTurnos.setTime (3, HORA_FIN);
                    int filasAfectadasTurnos = preparedStatementTurnos.executeUpdate();
                    
                    if (filasAfectadasTurnos > 0) {
                        String idEncontrado = obtenerId(DNI, NOMBRE, APELLIDO_P, APELLIDO_M);
                        int ID = Integer.parseInt(idEncontrado);
                        preparedStatementTrabajadores = conexion.prepareStatement(consultaTrabajadores);
                        preparedStatementTrabajadores.setInt(1, ID);
                        preparedStatementTrabajadores.setString(2, CARGO);
                        preparedStatementTrabajadores.setDouble(3, SUELDO);
                        int filasAfectadasTrabajadores = preparedStatementTrabajadores.executeUpdate();
                    
                        return filasAfectadasTrabajadores > 0;
                    }else{
                        return false;
                    }
                    
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatementCuentas != null) preparedStatementCuentas.close();
                if (preparedStatementPersonas != null) preparedStatementPersonas.close();
                if (preparedStatementTurnos != null) preparedStatementTurnos.close();
                if (preparedStatementTrabajadores != null) preparedStatementTrabajadores.close();
                conexionDB.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    

}
