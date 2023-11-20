package clases;

public class historialCompras {
    private String Combustible;
    private String Cantida;
    private String PrecioUnitario;
    private String PrecioTotal;
    private String fecha;
    private String HoraCompra;

    public historialCompras(String Combustible, String Cantida, String PrecioUnitario, String PrecioTotal, String fecha, String HoraCompra) {
        this.Combustible = Combustible;
        this.Cantida = Cantida;
        this.PrecioUnitario = PrecioUnitario;
        this.PrecioTotal = PrecioTotal;
        this.fecha = fecha;
        this.HoraCompra = HoraCompra;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getCantida() {
        return Cantida;
    }

    public void setCantida(String Cantida) {
        this.Cantida = Cantida;
    }

    public String getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(String PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(String PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraCompra() {
        return HoraCompra;
    }

    public void setHoraCompra(String HoraCompra) {
        this.HoraCompra = HoraCompra;
    }

    @Override
    public String toString() {
        return "historialCompras{" + "Combustible=" + Combustible + ", Cantida=" + Cantida + ", PrecioUnitario=" + PrecioUnitario + ", PrecioTotal=" + PrecioTotal + ", fecha=" + fecha + ", HoraCompra=" + HoraCompra + '}';
    }
    
}
