package clases;
import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class clientes extends persona{
        
    private ConexionMySQL conexionDB;
    private String cliente;

    public clientes() {
    }

    public clientes(String cliente) {
        this.cliente = cliente;
    }
    
    
    public clientes(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS, String CORREO, String DIRECCION, String TELEFONO, String FECHA_NACIMIENTO) {
        super(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO);
        conexionDB = new ConexionMySQL();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean registrarCliente(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDO_P, String APELLIDO_M, String CORREO, String DIRECCION, String TELEFONO, java.sql.Date FECHA_NACIMIENTO) {
        Connection conexion = conexionDB.conectar();
        String consultaCuentas = "INSERT INTO CUENTAS (USUARIO, CONTRASENA, PERMISOS) VALUES (?, ?, ?)";
        String consultaPersonas = "INSERT INTO PERSONAS (CUENTAS_ID, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO) VALUES (LAST_INSERT_ID(),?,?,?,?,?,?,?,?)";
        String consultaClientes = "INSERT INTO clientes (PERSONAS_ID) VALUES (LAST_INSERT_ID())";

        PreparedStatement preparedStatementCuentas = null;
        PreparedStatement preparedStatementPersonas = null;
        PreparedStatement preparedStatementClientes = null;

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
                    preparedStatementClientes = conexion.prepareStatement(consultaClientes);
                    int filasAfectadasClientes = preparedStatementClientes.executeUpdate();

                    return filasAfectadasClientes > 0;
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
                if (preparedStatementClientes != null) preparedStatementClientes.close();
                conexionDB.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
}