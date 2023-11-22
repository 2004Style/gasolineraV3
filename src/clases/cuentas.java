package clases;

import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cuentas {
    
    private String user;
    private String pasword;
    private String permisos;

    public cuentas() {
    }
    
    public cuentas(String user, String pasword, String permisos) {
        this.user = user;
        this.pasword = pasword;
        this.permisos = permisos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    public boolean validarUsuario(String USUARIO) {
        ConexionMySQL conexionDB = new ConexionMySQL();
        String consulta = "SELECT C.USUARIO, C.CONTRASENA FROM CUENTAS C WHERE C.USUARIO=?";
    
        try (Connection connection = conexionDB.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, USUARIO);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next(); // Devuelve true si el usuario y contraseña coinciden
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de excepción o error, devuelve false
        }
    }

}
