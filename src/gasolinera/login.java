package gasolinera;

import clases.RegistroCombustible;
import clases.clientes;
import clases.trabajadores;
import conexionbd.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class login {
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de Inicio de Sesion");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Crear una Cuenta");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion (1/2/3): ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("redirigiendo al apartado de inicio de sesion");
                iniciarSesion(args);
            } else if (opcion == 2) {
                System.out.println("redirigiendo al apartado de registro de cuenta");
                registro_cuenta(args);
            } else if (opcion == 3) {
                System.out.println("cerrando programa...");
                break;
            } else {
                System.out.println("Opcion no valida. Por favor, selecciona una opcion valida entre [1, 2, 3]");
                limpiarConsola();
            }
        }
    }
    
    public static void iniciarSesion(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            limpiarConsola();
            ConexionMySQL conexionDB = new ConexionMySQL();
            Connection conexion = conexionDB.conectar();

            try {
                System.out.print("Ingresa tu nombre de usuario: ");
                String nombreUsuario = scanner.nextLine();

                System.out.print("Ingresa tu contraseña: ");
                String contrasena = scanner.nextLine();

                String consulta = "SELECT CUENTAS.PERMISOS " +
                      "FROM CUENTAS " +
                      "WHERE CUENTAS.USUARIO = ? AND CUENTAS.CONTRASENA = ?";

                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;

                try {
                    preparedStatement = conexion.prepareStatement(consulta);
                    preparedStatement.setString(1, nombreUsuario);
                    preparedStatement.setString(2, contrasena);

                    resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        String permisos = resultSet.getString("PERMISOS");
                        realizarAccionSegunPermisos(args, nombreUsuario, permisos);
                        break;
                    } else {
                        System.out.println("Inicio de sesión fallido. Credenciales incorrectas.");
                        System.out.println("Opciones:");
                        System.out.println("1. Registrarme una cuenta");
                        System.out.println("2. Volver a intentar inicio de sesión");
                        System.out.print("Selecciona una opción (1/2): ");

                        int opcion = scanner.nextInt();
                        scanner.nextLine();

                        if (opcion == 1) {
                            System.out.println("Redirigiendo al menú de registro de cuentas.");
                            registro_cuenta(args);
                            break;
                        } else if (opcion == 2) {
                            System.out.println("Volviendo a intentar inicio de sesión");
                        } else {
                            System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    conexionDB.desconectar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void realizarAccionSegunPermisos(String[] args, String nombreUsuario, String permisos) {
        if (permisos.equals("TRABAJADOR")) {
            System.out.println("Inicio de sesión exitoso como trabajador. Redirigiendo...");

            ConexionMySQL conexionDB = new ConexionMySQL();
            try (Connection conexion = conexionDB.conectar()) {
                String consultaPersona = "SELECT P.NOMBRE, TU.NOMBRE_TURNO, TU.TURNO_ID " +
                        "FROM CUENTAS C " +
                        "INNER JOIN PERSONAS P ON C.CUENTAS_ID = P.CUENTAS_ID " +
                        "INNER JOIN TRABAJADORES T ON T.PERSONAS_ID = P.PERSONAS_ID " +
                        "INNER JOIN TURNOS TU ON TU.TURNO_ID = T.TURNO_ID " +
                        "WHERE C.PERMISOS = 'trabajador' AND C.USUARIO = ?";
                
                try (PreparedStatement preparedStatementPersona = conexion.prepareStatement(consultaPersona)) {
                    preparedStatementPersona.setString(1, nombreUsuario);
                    try (ResultSet resultSetTrabajador = preparedStatementPersona.executeQuery()) {
                        if (resultSetTrabajador.next()) {
                            String nombrePersona = resultSetTrabajador.getString("NOMBRE");
                            String nombreTurno = resultSetTrabajador.getString("NOMBRE_TURNO");
                            int Turno_id = resultSetTrabajador.getInt("TURNO_ID");
                            
                            trabajador(args, nombrePersona, nombreTurno, Turno_id);
                        } else {
                            System.out.println("No se pudo obtener la información de la persona dueña de la cuenta.");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (permisos.equals("cliente")) {
            System.out.println("Inicio de sesión exitoso como cliente. Redirigiendo...");

            ConexionMySQL conexionDB = new ConexionMySQL();
            try (Connection conexion = conexionDB.conectar()) {
                String consultaPersona = "SELECT P.NOMBRE " +
                        "FROM CUENTAS C " +
                        "INNER JOIN PERSONAS P ON C.CUENTAS_ID = P.CUENTAS_ID " +
                        "WHERE C.PERMISOS = 'cliente' AND C.USUARIO = ?";
                
                try (PreparedStatement preparedStatementPersona = conexion.prepareStatement(consultaPersona)) {
                    preparedStatementPersona.setString(1, nombreUsuario);
                    try (ResultSet resultSetCLIENTE = preparedStatementPersona.executeQuery()) {
                        if (resultSetCLIENTE.next()) {
                            String nombrePersona = resultSetCLIENTE.getString("NOMBRE");
                            
                            cliente(args, nombrePersona);
                        } else {
                            System.out.println("No se pudo obtener la información de la persona dueña de la cuenta.");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Permisos desconocidos.");
        }
    }
    
    public static void registro_cuenta(String[] args) {
        limpiarConsola();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una opcion [1 = trabajador\t2 = cliente]: ");
        int op = leer.nextInt();
        if (op == 1) {
            
            //CUENTA
            System.out.println("ingrese el nombre de ususario: ");
            String user = leer.next();
            System.out.println("ingrese contraseña: ");
            String pasword = leer.next();
            String permisos = "TRABAJADOR";
            
            //PERSONA
            System.out.println("ingresar el dni: ");
            String DNI = leer.next();
            System.out.println("ingrese su nombre");
            String NOMBRE = leer.next();
            System.out.println("ingrese su apellido paterno: ");
            String APELLIDOS_PATERNOS = leer.next();
            System.out.println("ingrese su apellido materno: ");
            String APELLIDOS_MATERNOS = leer.next();
            System.out.println("ingrese su correo: ");
            String CORREO = leer.next();
            System.out.println("ingrese su direccion: ");
            String DIRECCION = leer.next();
            System.out.println("ingrese su numero de telefono");
            String TELEFONO = leer.next();
            System.out.println("ingrese su fecha de nacimiento ejemplo[AAAA-MM-DD]: ");
            String FECHA_NACIMIENTO = leer.next();
            
            //TURNO
            System.out.println("ingrese el nombre del turno: ");
            String NOMBRE_TURNO = leer.next();
            System.out.println("ingrese la hora de inicio de turno: ");
            String HORA_INICIO = leer.next();
            System.out.println("ingrese la hora de fin de turno: ");
            String HORA_FIN = leer.next();
            
            //TRABAJADOR
            System.out.println("ingrese el sueldo: ");
            double sueldo = leer.nextDouble();
            System.out.println("ingrese el cargo: ");
            String puesto = leer.next();
            
            trabajadores t = new trabajadores(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, NOMBRE_TURNO, HORA_INICIO, HORA_FIN, puesto, sueldo);

            
            try {
                Date fechaNacimiento = Date.valueOf(FECHA_NACIMIENTO);
                Time fechaInicio = Time.valueOf(HORA_INICIO);
                Time fechaFin = Time.valueOf(HORA_FIN);
                boolean exito = t.nuevo_Trabajador(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, fechaNacimiento, NOMBRE_TURNO, fechaInicio, fechaFin, CORREO, sueldo);

                if (exito) {
                    System.out.println("Cuenta registrada con éxito.");
                } else {
                    System.out.println("Error al registrar la cuenta.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error en el formato de la fecha de nacimiento.");
            }
        }
        else if (op == 2) {
            
            //CUENTA
            System.out.println("ingrese el nombre de ususario: ");
            String user = leer.next();
            System.out.println("ingrese contraseña: ");
            String pasword = leer.next();
            String permisos = "USER";
            
            //PERSONA
            System.out.println("ingresar el dni: ");
            String DNI = leer.next();
            System.out.println("ingrese su nombre");
            String NOMBRE = leer.next();
            System.out.println("ingrese su apellido paterno: ");
            String APELLIDOS_PATERNOS = leer.next();
            System.out.println("ingrese su apellido materno: ");
            String APELLIDOS_MATERNOS = leer.next();
            System.out.println("ingrese su correo: ");
            String CORREO = leer.next();
            System.out.println("ingrese su direccion: ");
            String DIRECCION = leer.next();
            System.out.println("ingrese su numero de telefono");
            String TELEFONO = leer.next();
            System.out.println("ingrese su fecha de nacimiento ejemplo[AAAA-MM-DD]: ");
            String FECHA_NACIMIENTO = leer.next();
            
            clientes c = new clientes(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO);
            try {
                Date fechaNacimiento = Date.valueOf(FECHA_NACIMIENTO);

                boolean exito = c.registrarCliente(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, fechaNacimiento);

                if (exito) {
                    System.out.println("Cuenta registrada con éxito.");
                } else {
                    System.out.println("Error al registrar la cuenta.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error en el formato de la fecha de nacimiento.");
            }
        }
        else{
            System.out.println("opcion invalida...!");
        }
}
    
    public static void cliente(String[] args, String nombre) {
        System.out.println("vienvenido sr. "+nombre);
    }
    
    public static void trabajador(String[] args, String nombre, String turno, int turno_id) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            limpiarConsola();
            System.out.println(">>TRABAJADOR IDENTIFICADO COMO "+nombre+" esta en el turno: "+ turno+" <<");
            System.out.println("Menú de Trabajador");
            System.out.println("1. Registro de Combustible");
            System.out.println("2. Venta de Combustible");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción entre [1, 2, 3]: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registro_de_combustible(args, turno_id);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo del Menú de Trabajador.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, selecciona 1, 2 o 3.");
            }
        }
    }
    
    public static void registro_de_combustible(String[] args, int turno_id) {
        limpiarConsola();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menú de Registro de Combustible");

        System.out.print("Tipo de Combustible: ");
        String tipo = scanner.next();
        
        System.out.print("Nombre de Combustible: ");
        String nombre = scanner.next();
        
        System.out.print("Cantidad de Combustible: ");
        int cantidad = scanner.nextInt();
        
        System.out.print("Precio de Combustible: ");
        double precio = scanner.nextDouble();
                        
        System.out.print("ID DEL TURNO: "+ turno_id);
                
        LocalDate fecha_registro = LocalDate.now();
        System.out.println("fecha actual: "+fecha_registro);
        
        RegistroCombustible rc = new RegistroCombustible(tipo, nombre, cantidad, precio, turno_id, fecha_registro);
        
        Date fecharegistro = Date.valueOf(fecha_registro);
        
        boolean exito = rc.registrarCombustible(tipo, nombre, cantidad, precio, turno_id, fecharegistro);

        if (exito) {
            System.out.println("Registro de combustible exitoso.");
        } else {
            System.out.println("Error al registrar el combustible.");
        }
    }
    /*
    public static void venta(String[] args) {
        limpiarConsola();
    RealizarVenta venta = new RealizarVenta();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Registro de Venta");

    System.out.println("Tipos de Combustible Disponibles:");
    venta.mostrarTiposCombustible();

    System.out.print("Selecciona el ID del Combustible: ");
    int combustibleId = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Cantidad Vendida (litros): ");
    double cantidadVendida = scanner.nextDouble();
    scanner.nextLine();
    
    System.out.print("Nombre del Cliente: ");
    String nombreCliente = scanner.nextLine();
    System.out.print("Apellido del Cliente: ");
    String apellidoCliente = scanner.nextLine();

    int idVendedor = 1;

    int idCliente = venta.obtenerIdUsuario(nombreCliente, apellidoCliente);
    if (idCliente == -1) {
        System.out.println("Cliente no encontrado en la base de datos. Registre al cliente primero.");
        return;
    }

    double precioPorLitro = 1.0;
    double montoTotal = cantidadVendida * precioPorLitro;

    boolean exito = venta.registrarVenta(idCliente, combustibleId, cantidadVendida, montoTotal, idVendedor);

    if (exito) {
        System.out.println("Venta registrada con éxito.");
        venta.actualizarCantidadCombustible(combustibleId, cantidadVendida);
    } else {
        System.out.println("Error al registrar la venta.");
    }
}*/

}
