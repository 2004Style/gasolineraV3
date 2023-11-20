package clases;

import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;

public class RegistroCombustible extends combustible{
    private ConexionMySQL conexionDB;

    private int turno_id;
    private LocalDate fecha_registro;

    public RegistroCombustible(String tipo, String nombre, int cantidad, double precio, int turno_id, LocalDate fecha_registro) {
        super(tipo, nombre, cantidad, precio);
        
        this.turno_id = turno_id;
        this.fecha_registro = fecha_registro;
        
        conexionDB = new ConexionMySQL();
    }

    public int getTurno_id() {
        return turno_id;
    }

    public void setTurno_id(int turno_id) {
        this.turno_id = turno_id;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_combustible) {
        this.fecha_registro = fecha_combustible;
    }
        
    public boolean registrarCombustible(String tipo, String nombre, int cantidad, double precio, int turno_id, Date fecha_registro) {
    Connection conexion = conexionDB.conectar();
    String consultaVerificarExistencia = "SELECT COMBUSTIBLE_ID FROM COMBUSTIBLE WHERE TIPO = ? AND NOMBRE = ?";
    String consultaCombustible = "INSERT INTO COMBUSTIBLE (TIPO, NOMBRE, CANTIDAD, PRECIO) VALUES (?, ?, ?, ?)";
    String consultaRegistroCombustible = "INSERT INTO REGISTRO_COMBUSTIBLE (COMBUSTIBLE_ID, TURNO_ID, FECHA_REGISTRO) VALUES (LAST_INSERT_ID(), ?, ?)";
    PreparedStatement preparedStatementExistencia = null;
    PreparedStatement preparedStatementCombustible = null;
    PreparedStatement preparedStatementRegistroCombustible = null;

    try {
        preparedStatementExistencia = conexion.prepareStatement(consultaVerificarExistencia);
        preparedStatementExistencia.setString(1, tipo);
        preparedStatementExistencia.setString(2, nombre);
        var resultadoExistencia = preparedStatementExistencia.executeQuery();

        if (resultadoExistencia.next()) {
            int combustibleId = resultadoExistencia.getInt("COMBUSTIBLE_ID");
            String consultaActualizarCantidad = "UPDATE COMBUSTIBLE SET CANTIDAD = CANTIDAD + ? WHERE COMBUSTIBLE_ID = ?";
            PreparedStatement preparedStatementActualizarCantidad = conexion.prepareStatement(consultaActualizarCantidad);
            preparedStatementActualizarCantidad.setInt(1, cantidad);
            preparedStatementActualizarCantidad.setInt(2, combustibleId);
            int filasAfectadasActualizarCantidad = preparedStatementActualizarCantidad.executeUpdate();

            return filasAfectadasActualizarCantidad > 0;
            
        } else {
            preparedStatementCombustible = conexion.prepareStatement(consultaCombustible);
            preparedStatementCombustible.setString(1, tipo);
            preparedStatementCombustible.setString(2, nombre);
            preparedStatementCombustible.setInt(3, cantidad);
            preparedStatementCombustible.setDouble(4, precio);
            int filasAfectadasCombustible = preparedStatementCombustible.executeUpdate();

            if (filasAfectadasCombustible > 0) {
                preparedStatementRegistroCombustible = conexion.prepareStatement(consultaRegistroCombustible);
                preparedStatementRegistroCombustible.setInt(1, turno_id);
                preparedStatementRegistroCombustible.setDate(2, fecha_registro);
                int filasAfectadasRegistroCombustible = preparedStatementRegistroCombustible.executeUpdate();

                return filasAfectadasRegistroCombustible > 0;
            } else {
                return false;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (preparedStatementExistencia != null) preparedStatementExistencia.close();
            if (preparedStatementCombustible != null) preparedStatementCombustible.close();
            if (preparedStatementRegistroCombustible != null) preparedStatementRegistroCombustible.close();
            conexionDB.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
