CREATE DATABASE estaciondeserviciov2;
USE estaciondeserviciov2;

CREATE TABLE CUENTAS(
CUENTAS_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
USUARIO VARCHAR(100) NOT NULL,
CONTRASENA VARCHAR(300) NOT NULL,
PERMISOS VARCHAR(20) NOT NULL
);

CREATE TABLE PERSONAS(
PERSONAS_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
CUENTAS_ID INT NOT NULL, FOREIGN KEY(CUENTAS_ID) REFERENCES CUENTAS(CUENTAS_ID),
DNI VARCHAR(8) NOT NULL,
NOMBRE VARCHAR(200) NOT NULL,
APELLIDOS_PATERNOS VARCHAR(200) NOT NULL,
APELLIDOS_MATERNOS VARCHAR(200) NOT NULL,
CORREO VARCHAR(300) NOT NULL,
DIRECCION VARCHAR(200) NOT NULL,
TELEFONO VARCHAR(20) NOT NULL,
FECHA_NACIMIENTO DATETIME NOT NULL
);

CREATE TABLE CLIENTES(
CLIENTES_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
PERSONAS_ID INT NOT NULL, FOREIGN KEY(PERSONAS_ID) REFERENCES PERSONAS(PERSONAS_ID)
);

CREATE TABLE TURNOS(
TURNO_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
NOMBRE_TURNO VARCHAR(50) NOT NULL,
HORA_INICIO TIME NOT NULL,
HORA_FIN TIME NOT NULL
);

CREATE TABLE TRABAJADORES(
TRABAJADORES_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
PERSONAS_ID INT NOT NULL, FOREIGN KEY(PERSONAS_ID) REFERENCES PERSONAS(PERSONAS_ID),
PUESTO VARCHAR(300)NOT NULL,
SUELDO DECIMAL,
TURNO_ID INT NOT NULL, FOREIGN KEY(TURNO_ID) REFERENCES TURNOS(TURNO_ID)
);

CREATE TABLE COMBUSTIBLE(
COMBUSTIBLE_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
TIPO VARCHAR(100),
NOMBRE VARCHAR(100) NOT NULL,
CANTIDAD INT NOT NULL,
PRECIO DECIMAL NOT NULL
);

CREATE TABLE REGISTRO_COMBUSTIBLE(
RCOMBUSTIBLE_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
COMBUSTIBLE_ID INT NOT NULL, FOREIGN KEY(COMBUSTIBLE_ID) REFERENCES COMBUSTIBLE (COMBUSTIBLE_ID),
TURNO_ID INT NOT NULL, FOREIGN KEY(TURNO_ID) REFERENCES TURNOS(TURNO_ID),
FECHA_REGISTRO DATE NOT NULL
);

CREATE TABLE VENTAS(
VENTAS_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
CLIENTES_ID INT NOT NULL, FOREIGN KEY(CLIENTES_ID) REFERENCES CLIENTES(CLIENTES_ID),
COMBUSTIBLE VARCHAR(300) NOT NULL,
PRECIO_UNITARIO DECIMAL NOT NULL,
PRECIO_TOTAL DECIMAL NOT NULL,
TURNO VARCHAR(50) NOT NULL,
FECHA DATE NOT NULL,
HORA_DE_VENTA TIME NOT NULL,
CANTIDAD INT NOT NULL,
VENDEDOR VARCHAR(100) NOT NULL,
DINERO_RECIBIDO DECIMAL NOT NULL,
VUELTO DECIMAL NOT NULL
);