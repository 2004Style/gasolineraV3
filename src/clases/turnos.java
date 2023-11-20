package clases;

import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class turnos extends persona{
    
    private ConexionMySQL conexionDB;
    private String NOMBRE_TURNO;
    private String HORA_INICIO;
    private String HORA_FIN;

    public turnos() {
        conexionDB = new ConexionMySQL();
    }

    public turnos(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS, String CORREO, String DIRECCION, String TELEFONO, String FECHA_NACIMIENTO, String NOMBRE_TURNO, String HORA_INICIO, String HORA_FIN) {
        super(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO);
        this.NOMBRE_TURNO = NOMBRE_TURNO;
        this.HORA_INICIO = HORA_INICIO;
        this.HORA_FIN = HORA_FIN;
    }

    public String getNOMBRE_TURNO() {
        return NOMBRE_TURNO;
    }

    public void setNOMBRE_TURNO(String NOMBRE_TURNO) {
        this.NOMBRE_TURNO = NOMBRE_TURNO;
    }

    public String getHORA_INICIO() {
        return HORA_INICIO;
    }

    public void setHORA_INICIO(String HORA_INICIO) {
        this.HORA_INICIO = HORA_INICIO;
    }

    public String getHORA_FIN() {
        return HORA_FIN;
    }

    public void setHORA_FIN(String HORA_FIN) {
        this.HORA_FIN = HORA_FIN;
    }
    
    public boolean verificarHorasTurno(int idTurno) {
        Connection conexion = conexionDB.conectar();
        String sql = "SELECT HORA_INICIO, HORA_FIN FROM TURNOS WHERE TURNO_ID = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, idTurno);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Time horaInicio = resultSet.getTime("HORA_INICIO");
                Time horaFin = resultSet.getTime("HORA_FIN");

                LocalTime horaActual = LocalTime.now();
                LocalTime horaInicioLocalTime = horaInicio.toLocalTime();
                LocalTime horaFinLocalTime = horaFin.toLocalTime();

                return horaActual.isAfter(horaInicioLocalTime) && horaActual.isBefore(horaFinLocalTime);
            } else {
                System.out.println("No se encontró el turno con ID: " + idTurno);
                JOptionPane.showMessageDialog(null, "No se encontró el turno con ID: " + idTurno);
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            conexionDB.desconectar();
        }
    }
}
