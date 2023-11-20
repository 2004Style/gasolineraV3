package clases;

import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ventas {
    
    private ConexionMySQL conexionDB;
    
    private int VENTAS_ID;
    private int CLIENTES_ID;
    private String CLIENTE;
    private String COMBUSTIBLE;
    private double PRECIO_UNITARIO;
    private double PRECIO_TOTAL;
    private String TURNO;
    private String FECHA;
    private String HORAVENTA;
    private int CANTIDAD;
    private String VENDEDOR;
    private double DINERO_RECIBIDO;
    private double VUELTO;

    public ventas() {
        conexionDB = new ConexionMySQL();
    }

    public ventas(int CLIENTES_ID, String CLIENTE, String COMBUSTIBLE, double PRECIO_UNITARIO, double PRECIO_TOTAL, String TURNO, String FECHA, String HORAVENTA, int CANTIDAD, String VENDEDOR, double DINERO_RECIBIDO, double VUELTO) {
        this.CLIENTES_ID = CLIENTES_ID;
        this.CLIENTE = CLIENTE;
        this.COMBUSTIBLE = COMBUSTIBLE;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TURNO = TURNO;
        this.FECHA = FECHA;
        this.HORAVENTA = HORAVENTA;
        this.CANTIDAD = CANTIDAD;
        this.VENDEDOR = VENDEDOR;
        this.DINERO_RECIBIDO = DINERO_RECIBIDO;
        this.VUELTO = VUELTO;
        conexionDB = new ConexionMySQL();
    }

    public ventas(int CLIENTES_ID, String COMBUSTIBLE, double PRECIO_UNITARIO, double PRECIO_TOTAL, String TURNO, int CANTIDAD, String VENDEDOR, double DINERO_RECIBIDO) {
        this.CLIENTES_ID = CLIENTES_ID;
        this.COMBUSTIBLE = COMBUSTIBLE;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
        this.PRECIO_TOTAL = PRECIO_TOTAL;
        this.TURNO = TURNO;
        this.CANTIDAD = CANTIDAD;
        this.VENDEDOR = VENDEDOR;
        this.DINERO_RECIBIDO = DINERO_RECIBIDO;
        conexionDB = new ConexionMySQL();
    }

    public int getVENTAS_ID() {
        return VENTAS_ID;
    }

    public void setVENTAS_ID(int VENTAS_ID) {
        this.VENTAS_ID = VENTAS_ID;
    }

    public int getCLIENTES_ID() {
        return CLIENTES_ID;
    }

    public void setCLIENTES_ID(int CLIENTES_ID) {
        this.CLIENTES_ID = CLIENTES_ID;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public String getCOMBUSTIBLE() {
        return COMBUSTIBLE;
    }

    public void setCOMBUSTIBLE(String COMBUSTIBLE) {
        this.COMBUSTIBLE = COMBUSTIBLE;
    }

    public double getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }

    public void setPRECIO_UNITARIO(double PRECIO_UNITARIO) {
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
    }

    public double getPRECIO_TOTAL() {
        return PRECIO_TOTAL;
    }

    public void setPRECIO_TOTAL(double PRECIO_TOTAL) {
        this.PRECIO_TOTAL = PRECIO_TOTAL;
    }

    public String getTURNO() {
        return TURNO;
    }

    public void setTURNO(String TURNO) {
        this.TURNO = TURNO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getHORAVENTA() {
        return HORAVENTA;
    }

    public void setHORAVENTA(String HORAVENTA) {
        this.HORAVENTA = HORAVENTA;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getVENDEDOR() {
        return VENDEDOR;
    }

    public void setVENDEDOR(String VENDEDOR) {
        this.VENDEDOR = VENDEDOR;
    }

    public double getDINERO_RECIBIDO() {
        return DINERO_RECIBIDO;
    }

    public void setDINERO_RECIBIDO(double DINERO_RECIBIDO) {
        this.DINERO_RECIBIDO = DINERO_RECIBIDO;
    }

    public double getVUELTO() {
        return VUELTO;
    }

    public void setVUELTO(double VUELTO) {
        this.VUELTO = VUELTO;
    }

    
    public boolean registrarVenta(int CLIENTES_ID, String COMBUSTIBLE, double PRECIO_UNITARIO, double PRECIO_TOTAL, String TURNO, int CANTIDAD, String VENDEDOR, double DINERO_RECIBIDO) {

        Connection conexion = conexionDB.conectar();
        String consultaVentas = "INSERT INTO VENTAS (CLIENTES_ID, COMBUSTIBLE, PRECIO_UNITARIO, "
                + "PRECIO_TOTAL, TURNO, FECHA, HORA_DE_VENTA, CANTIDAD, VENDEDOR, DINERO_RECIBIDO, VUELTO) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatementVentas = null;

        try {
            preparedStatementVentas = conexion.prepareStatement(consultaVentas);
            preparedStatementVentas.setInt(1, CLIENTES_ID);
            preparedStatementVentas.setString(2, COMBUSTIBLE);
            preparedStatementVentas.setDouble(3, PRECIO_UNITARIO);
            preparedStatementVentas.setDouble(4, PRECIO_TOTAL);
            preparedStatementVentas.setString(5, TURNO);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fechaActual = now.format(formatter);
            preparedStatementVentas.setString(6, fechaActual);

            formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaActual = now.format(formatter);
            preparedStatementVentas.setString(7, horaActual);

            preparedStatementVentas.setInt(8, CANTIDAD);
            preparedStatementVentas.setString(9, VENDEDOR);
            preparedStatementVentas.setDouble(10, DINERO_RECIBIDO);

            double VUELTO = DINERO_RECIBIDO - PRECIO_TOTAL;
            preparedStatementVentas.setDouble(11, VUELTO);

            int filasAfectadasVentas = preparedStatementVentas.executeUpdate();

            return filasAfectadasVentas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatementVentas != null)
                    preparedStatementVentas.close();
                conexionDB.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<ventas> ventasGenerales() {
        List<ventas> listaVentas = new ArrayList<>();
        Connection conexion = conexionDB.conectar();

        String sql = "SELECT V.VENTAS_ID, CONCAT(P.NOMBRE, ' ', P.APELLIDOS_PATERNOS, ' ', P.APELLIDOS_MATERNOS) AS CLIENTE, " +
                     "V.COMBUSTIBLE, V.PRECIO_UNITARIO, V.PRECIO_TOTAL, V.TURNO, V.FECHA, V.HORA_DE_VENTA, V.CANTIDAD, " +
                     "V.VENDEDOR, V.DINERO_RECIBIDO, V.VUELTO " +
                     "FROM VENTAS V " +
                     "INNER JOIN CLIENTES C ON V.CLIENTES_ID = C.CLIENTES_ID " +
                     "INNER JOIN PERSONAS P ON C.PERSONAS_ID = P.PERSONAS_ID";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                ventas venta = new ventas();
                venta.setVENTAS_ID(resultSet.getInt("VENTAS_ID"));
                venta.setCLIENTE(resultSet.getString("CLIENTE"));
                venta.setCOMBUSTIBLE(resultSet.getString("COMBUSTIBLE"));
                venta.setPRECIO_UNITARIO(resultSet.getDouble("PRECIO_UNITARIO"));
                venta.setPRECIO_TOTAL(resultSet.getDouble("PRECIO_TOTAL"));
                venta.setTURNO(resultSet.getString("TURNO"));
                venta.setFECHA(resultSet.getString("FECHA"));
                venta.setHORAVENTA(resultSet.getString("HORA_DE_VENTA"));
                venta.setCANTIDAD(resultSet.getInt("CANTIDAD"));
                venta.setVENDEDOR(resultSet.getString("VENDEDOR"));
                venta.setDINERO_RECIBIDO(resultSet.getDouble("DINERO_RECIBIDO"));
                venta.setVUELTO(resultSet.getDouble("VUELTO"));

                listaVentas.add(venta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionDB.desconectar();
        }

        return listaVentas;
    }
}
