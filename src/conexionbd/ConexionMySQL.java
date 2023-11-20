package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL implements interfaces.consultas{
    /*
    private static final String URL = "mysql://root:kV0wpu9yOJZXNpthhAzV@containers-us-west-129.railway.app:6850/railway";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "kV0wpu9yOJZXNpthhAzV";
    */

    
    private static final String URL = "jdbc:mysql://localhost:3306/estaciondeserviciov2";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";
    
    private Connection conexion;

    public Connection conectar() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.err.println("No se pudo conectar a la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}