package clases;

public class persona extends cuentas{
    private String DNI;
    private String NOMBRE;
    private String APELLIDOS_PATERNOS;
    private String APELLIDOS_MATERNOS;
    private String CORREO;
    private String DIRECCION;
    private String TELEFONO;
    private String FECHA_NACIMIENTO;

    public persona() {
    }

    public persona(String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS, String TELEFONO) {
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS_PATERNOS = APELLIDOS_PATERNOS;
        this.APELLIDOS_MATERNOS = APELLIDOS_MATERNOS;
        this.TELEFONO = TELEFONO;
    }
    
    public persona(String user, String pasword, String permisos, String DNI, String NOMBRE, String APELLIDOS_PATERNOS, String APELLIDOS_MATERNOS, String CORREO, String DIRECCION, String TELEFONO, String FECHA_NACIMIENTO) {
        super(user, pasword, permisos);
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS_PATERNOS = APELLIDOS_PATERNOS;
        this.APELLIDOS_MATERNOS = APELLIDOS_MATERNOS;
        this.CORREO = CORREO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
    }
    

    
}
