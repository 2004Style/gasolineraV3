package clases;

import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class combustible {
    
    private ConexionMySQL conexionDB;
    
    private int combustible_id;
    private String tipo;
    private String nombre;
    private int cantidad;
    private double precio;

    public combustible() {
        conexionDB = new ConexionMySQL();
    }

    public combustible(String tipo) {
        this.tipo = tipo;
        conexionDB = new ConexionMySQL();
    }
    
    public combustible(String tipo, String nombre, int cantidad, double precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        
        conexionDB = new ConexionMySQL();
    }

    public combustible(int combustible_id, String tipo, String nombre, int cantidad, double precio) {
        this.combustible_id = combustible_id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        conexionDB = new ConexionMySQL();
    }

    public int getCombustible_id() {
        return combustible_id;
    }

    public void setCombustible_id(int combustible_id) {
        this.combustible_id = combustible_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void actualizarCantidad(String tipo, String nombre, int cantidadARestar) {
        Connection conexion = conexionDB.conectar();

        String sql = "UPDATE COMBUSTIBLE SET CANTIDAD = CANTIDAD - ? WHERE TIPO = ? AND NOMBRE = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, cantidadARestar);
            preparedStatement.setString(2, tipo);
            preparedStatement.setString(3, nombre);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);

                int nuevaCantidad = CantidadDisponible(tipo, nombre);
                if (nuevaCantidad == 0) {
                    System.out.println("La cantidad esta en cero.");
                    JOptionPane.showMessageDialog(null, "La cantidad del combustible: "+nombre+" del tipo: "+tipo+" esta en cero");
                }

                if (nuevaCantidad >0 && nuevaCantidad< 20) {
                    System.out.println("Atención: La cantidad es menor a 20.");
                    JOptionPane.showMessageDialog(null, "Atención: La cantidad del combustible: "+nombre+" del tipo: "+tipo+" es menor a 20.");
                }

            } else {
                System.out.println("No se encontró ninguna fila para actualizar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionDB.desconectar();
        }
    }

    private int CantidadDisponible(String tipo, String nombre) {
        Connection conexion = conexionDB.conectar();
        int cantidad = 0;

        String sql = "SELECT CANTIDAD FROM COMBUSTIBLE WHERE TIPO = ? AND NOMBRE = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, tipo);
            preparedStatement.setString(2, nombre);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                cantidad = resultSet.getInt("CANTIDAD");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionDB.desconectar();
        }

        return cantidad;
    }

    
    public List<combustible> visualizarTodosLosRegistros() {
        List<combustible> listaCombustibles = new ArrayList<>();
        Connection conexion = null;

        try {
            if (conexionDB == null) {
                conexionDB = new ConexionMySQL();
            }

            conexion = conexionDB.conectar();

            String sql = "SELECT C.COMBUSTIBLE_ID, C.TIPO, C.NOMBRE, C.CANTIDAD, C.PRECIO FROM COMBUSTIBLE C";
        

            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    combustible combustible = new combustible();
                    combustible.setCombustible_id(resultSet.getInt("COMBUSTIBLE_ID"));
                    combustible.setTipo(resultSet.getString("TIPO"));
                    combustible.setNombre(resultSet.getString("NOMBRE"));
                    combustible.setCantidad(resultSet.getInt("CANTIDAD"));
                    combustible.setPrecio(resultSet.getDouble("PRECIO"));

                    listaCombustibles.add(combustible);
                }

                if (listaCombustibles.isEmpty()) {
                    System.out.println("No se encontró ningún registro.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conexion != null) {
                    conexionDB.desconectar();
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return listaCombustibles;
    }

    public List<combustible> visualizarRegistro(String tipo) {
        List<combustible> listaCombustibles = new ArrayList<>();
        Connection conexion = null;

        try {
            if (conexionDB == null) {
                conexionDB = new ConexionMySQL();
            }

            conexion = conexionDB.conectar();

            String sql = "SELECT C.COMBUSTIBLE_ID, C.TIPO, C.NOMBRE, C.CANTIDAD, C.PRECIO FROM COMBUSTIBLE C WHERE TIPO = ?";

            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                preparedStatement.setString(1, tipo);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    combustible combustible = new combustible();
                    combustible.setCombustible_id(resultSet.getInt("COMBUSTIBLE_ID"));
                    combustible.setTipo(resultSet.getString("TIPO"));
                    combustible.setNombre(resultSet.getString("NOMBRE"));
                    combustible.setCantidad(resultSet.getInt("CANTIDAD"));
                    combustible.setPrecio(resultSet.getDouble("PRECIO"));

                    listaCombustibles.add(combustible);

                }

                if (listaCombustibles.isEmpty()) {
                    System.out.println("No se encontró ningún registro con el tipo especificado.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conexion != null) {
                    conexionDB.desconectar();
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return listaCombustibles;
    }

    public double obtenerPrecioCombustible(String tipo, String nombreCombustible) {
        ConexionMySQL conexionDB = new ConexionMySQL();
        String consulta = "SELECT C.PRECIO FROM COMBUSTIBLE C WHERE C.TIPO = ? AND C.NOMBRE = ?";

        try (Connection connection = conexionDB.conectar();
             PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {

            preparedStatement.setString(1, tipo);
            preparedStatement.setString(2, nombreCombustible);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getDouble("PRECIO");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 50;
    }
    
}
