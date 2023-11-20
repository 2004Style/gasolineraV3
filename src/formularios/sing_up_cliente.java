package formularios;

import clases.clientes;
import clases.cuentas;
import clases.trabajadores;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class sing_up_cliente extends javax.swing.JFrame {

    public sing_up_cliente() {
        initComponents();  
        
        sing_up_cliente.this.setBackground(new Color(0,0,0,0));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
    
        this.setLocation(x, y);
        validarnumeros();
        validarfecha_de_nacimiento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_pasword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        label_dni = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_apellido_paterno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_apellido_materno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        label_telefono = new javax.swing.JLabel();
        label_fecha_nacimiento = new javax.swing.JLabel();
        txt_mes = new javax.swing.JTextField();
        txt_año = new javax.swing.JTextField();
        txt_dia = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_registrar = new javax.swing.JPanel();
        jbl_registrar = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_usuario.setForeground(java.awt.Color.gray);
        txt_usuario.setText("Ingrese su usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("USUARIO");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 13, -1, -1));

        txt_pasword.setBackground(new java.awt.Color(255, 255, 255));
        txt_pasword.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_pasword.setForeground(java.awt.Color.gray);
        txt_pasword.setText("Ingrese su contraseña");
        txt_pasword.setBorder(null);
        txt_pasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_paswordMousePressed(evt);
            }
        });
        jPanel3.add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 91, 180, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CONTRASEÑA");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 69, -1, -1));

        txt_dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_dni.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_dni.setForeground(java.awt.Color.gray);
        txt_dni.setText("Ingrese su DNI");
        txt_dni.setBorder(null);
        txt_dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_dniMousePressed(evt);
            }
        });
        jPanel3.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        label_dni.setBackground(new java.awt.Color(0, 0, 0));
        label_dni.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_dni.setForeground(new java.awt.Color(0, 0, 0));
        label_dni.setText("DNI");
        jPanel3.add(label_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_nombre.setForeground(java.awt.Color.gray);
        txt_nombre.setText("Ingrese su nombre");
        txt_nombre.setBorder(null);
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NOMBRE");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_apellido_paterno.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido_paterno.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_apellido_paterno.setForeground(java.awt.Color.gray);
        txt_apellido_paterno.setText("Ingrese su apellido paterno");
        txt_apellido_paterno.setBorder(null);
        txt_apellido_paterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido_paternoMousePressed(evt);
            }
        });
        jPanel3.add(txt_apellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("APELLIDO PATERNO");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_apellido_materno.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido_materno.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_apellido_materno.setForeground(java.awt.Color.gray);
        txt_apellido_materno.setText("Ingrese su apellido materno");
        txt_apellido_materno.setBorder(null);
        txt_apellido_materno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_apellido_maternoMousePressed(evt);
            }
        });
        jPanel3.add(txt_apellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("APELLIDO MATERNO");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_correo.setForeground(java.awt.Color.gray);
        txt_correo.setText("Ingrese su correo");
        txt_correo.setBorder(null);
        txt_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_correoMousePressed(evt);
            }
        });
        jPanel3.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("CORREO");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_direccion.setForeground(java.awt.Color.gray);
        txt_direccion.setText("Ingrese su dirección");
        txt_direccion.setBorder(null);
        txt_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_direccionMousePressed(evt);
            }
        });
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("DIRECCION");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_telefono.setForeground(java.awt.Color.gray);
        txt_telefono.setText("Ingrese su teléfono");
        txt_telefono.setBorder(null);
        txt_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_telefonoMousePressed(evt);
            }
        });
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, -1));

        label_telefono.setBackground(new java.awt.Color(0, 0, 0));
        label_telefono.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(0, 0, 0));
        label_telefono.setText("TELEFONO");
        jPanel3.add(label_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        label_fecha_nacimiento.setBackground(new java.awt.Color(0, 0, 0));
        label_fecha_nacimiento.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_fecha_nacimiento.setForeground(new java.awt.Color(0, 0, 0));
        label_fecha_nacimiento.setText("FECHA DE NACIMIENTO");
        jPanel3.add(label_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        txt_mes.setBackground(new java.awt.Color(255, 255, 255));
        txt_mes.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_mes.setForeground(java.awt.Color.gray);
        txt_mes.setText("Mes");
        txt_mes.setBorder(null);
        txt_mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_mesMousePressed(evt);
            }
        });
        jPanel3.add(txt_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 40, -1));

        txt_año.setBackground(new java.awt.Color(255, 255, 255));
        txt_año.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_año.setForeground(java.awt.Color.gray);
        txt_año.setText("Año");
        txt_año.setBorder(null);
        txt_año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_añoMousePressed(evt);
            }
        });
        jPanel3.add(txt_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 40, -1));

        txt_dia.setBackground(new java.awt.Color(255, 255, 255));
        txt_dia.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_dia.setForeground(java.awt.Color.gray);
        txt_dia.setText("Día");
        txt_dia.setBorder(null);
        txt_dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_diaMousePressed(evt);
            }
        });
        jPanel3.add(txt_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 40, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 10));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 10));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 10, 290));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 430, 310));

        jPanel2.setBackground(new java.awt.Color(2, 84, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(51, 153, 255));
        lbl_login.setText("Ingresa a ella desde aquí");
        lbl_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_loginMouseExited(evt);
            }
        });
        jPanel2.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Ya tienes una cuenta?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        pnl_registrar.setBackground(new java.awt.Color(23, 112, 110));

        jbl_registrar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jbl_registrar.setForeground(new java.awt.Color(251, 120, 19));
        jbl_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_registrar.setText("Registrar");
        jbl_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_registrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_registrarLayout = new javax.swing.GroupLayout(pnl_registrar);
        pnl_registrar.setLayout(pnl_registrarLayout);
        pnl_registrarLayout.setHorizontalGroup(
            pnl_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnl_registrarLayout.setVerticalGroup(
            pnl_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(pnl_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing-up-cliente.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 350));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarcontenidodecampos(){
        if (txt_apellido_paterno.getText().equals("Ingrese su apellido paterno")||txt_usuario.getText().equals("Ingrese su usuario")||txt_dni.getText().equals("Ingrese su DNI")||txt_nombre.getText().equals("Ingrese su nombre")||txt_pasword.getText().equals("Ingrese su contraseña")||txt_apellido_materno.getText().equals("Ingrese su apellido materno")||txt_correo.getText().equals("Ingrese su correo")||txt_direccion.getText().equals("Ingrese su dirección")||txt_telefono.getText().equals("Ingrese su teléfono")||txt_año.getText().equals("Año")||txt_mes.getText().equals("Mes")||txt_dia.getText().equals("Día")
            ||txt_apellido_paterno.getText().equals("")||txt_usuario.getText().equals("")||txt_dni.getText().equals("")||txt_nombre.getText().equals("")||txt_pasword.getText().equals("")||txt_apellido_materno.getText().equals("")||txt_correo.getText().equals("")||txt_direccion.getText().equals("")||txt_telefono.getText().equals("")||txt_año.getText().equals("")||txt_mes.getText().equals("")||txt_dia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "todos los campos deben ser rellenados");
        }
        else{
            //CUENTA
            String user = txt_usuario.getText();
            System.out.println("user: " +user);
            String pasword = txt_pasword.getText();
            System.out.println("pasword: " +pasword);
            String permisos = "CLIENTE";
            System.out.println("permisos: " +permisos);

            //PERSONA
            String DNI = txt_dni.getText();
            System.out.println("DNI: " +DNI);
            String NOMBRE = txt_nombre.getText();
            System.out.println("NOMBRE: " +NOMBRE);
            String APELLIDOS_PATERNOS = txt_apellido_paterno.getText();
            System.out.println("APELLIDOS_PATERNOS: " +APELLIDOS_PATERNOS);
            String APELLIDOS_MATERNOS = txt_apellido_materno.getText();
            System.out.println("APELLIDOS_MATERNOS: " +APELLIDOS_MATERNOS);
            String CORREO = txt_correo.getText();
            System.out.println("CORREO: " +CORREO);
            String DIRECCION = txt_direccion.getText();
            System.out.println("DIRECCION: " +DIRECCION);
            String TELEFONO = txt_telefono.getText();
            System.out.println("TELEFONO: " +TELEFONO);
            String nacimiento = txt_año.getText()+"-"+txt_mes.getText()+"-"+txt_dia.getText();
            String FECHA_NACIMIENTO = nacimiento;
            System.out.println("FECHA_NACIMIENTO: " +FECHA_NACIMIENTO);
            
            clientes c = new clientes(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO);
            try {
                Date fechaNacimiento = Date.valueOf(FECHA_NACIMIENTO);

                boolean exito = c.registrarCliente(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, fechaNacimiento);

                if (exito) {
                    System.out.println("Cuenta registrada con éxito.");
                    new log_in().setVisible(true);
                    this.dispose();
                } else {
                    System.out.println("Error al registrar la cuenta.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error en el formato de la fecha de nacimiento.");
            }
        }
    }
    public void validarnumeros(){
        txt_dni.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            public void changed() {
                String texto = txt_dni.getText();
                if (texto.isEmpty() || texto.matches("\\d+")) {
                    label_dni.setForeground(Color.BLACK);
                } else {
                    label_dni.setForeground(Color.RED);
                }
            }
        });
        txt_telefono.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            public void changed() {
                String texto = txt_telefono.getText();
                if (texto.matches("^\\+\\d+$")) {
                    label_telefono.setForeground(Color.BLACK);
                } else {
                    label_telefono.setForeground(Color.RED);
                }
            }
        });
        
    }
    public void validarfecha_de_nacimiento() {
        asignarValidacion(txt_año);
        asignarValidacion(txt_mes);
        asignarValidacion(txt_dia);
    }
    public void asignarValidacion(JTextField textField) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarCampo(textField, label_fecha_nacimiento);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarCampo(textField, label_fecha_nacimiento);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarCampo(textField, label_fecha_nacimiento);
            }
        });
    }
    public void validarCampo(JTextField textField, JLabel label) {
        String texto = textField.getText();
        if (texto.isEmpty() || !texto.matches("\\d+")) {
            label.setForeground(Color.RED);
            return;
        }

        int numero = Integer.parseInt(texto);

        if (textField == txt_año) {
            if (texto.length() != 4) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        } else if (textField == txt_mes) {
            if (texto.length() != 2 || numero > 12) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        } else if (textField == txt_dia) {
            if (texto.length() != 2 || numero > 31) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        }
    }
    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_paswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_paswordMousePressed
        if (txt_pasword.getText().equals("Ingrese su contraseña")) {
            txt_pasword.setText("");
            txt_pasword.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_paswordMousePressed

    private void txt_dniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dniMousePressed
        if (txt_dni.getText().equals("Ingrese su DNI")) {
            txt_dni.setText("");
            txt_dni.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_dniMousePressed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
        if (txt_nombre.getText().equals("Ingrese su nombre")) {
            txt_nombre.setText("");
            txt_nombre.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_nombreMousePressed

    private void txt_apellido_paternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido_paternoMousePressed
        if (txt_apellido_paterno.getText().equals("Ingrese su apellido paterno")) {
            txt_apellido_paterno.setText("");
            txt_apellido_paterno.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_apellido_paternoMousePressed

    private void txt_apellido_maternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellido_maternoMousePressed
        if (txt_apellido_materno.getText().equals("Ingrese su apellido materno")) {
            txt_apellido_materno.setText("");
            txt_apellido_materno.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_apellido_maternoMousePressed

    private void txt_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_correoMousePressed
        if (txt_correo.getText().equals("Ingrese su correo")) {
            txt_correo.setText("");
            txt_correo.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_correoMousePressed

    private void txt_direccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_direccionMousePressed
        if (txt_direccion.getText().equals("Ingrese su dirección")) {
            txt_direccion.setText("");
            txt_direccion.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_direccionMousePressed

    private void txt_telefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_telefonoMousePressed
        if (txt_telefono.getText().equals("Ingrese su teléfono")) {
            txt_telefono.setText("");
            txt_telefono.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_telefonoMousePressed

    private void txt_añoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_añoMousePressed
        if (txt_año.getText().equals("Año")) {
            txt_año.setText("");
            txt_año.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_añoMousePressed

    private void txt_mesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mesMousePressed
        if (txt_mes.getText().equals("Mes")) {
            txt_mes.setText("");
            txt_mes.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_dia.getText().isEmpty()) {
            txt_dia.setText("Día");
            txt_dia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_mesMousePressed

    private void txt_diaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_diaMousePressed
        if (txt_dia.getText().equals("Día")) {
            txt_dia.setText("");
            txt_dia.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
        if (txt_dni.getText().isEmpty()) {
            txt_dni.setText("Ingrese su DNI");
            txt_dni.setForeground(Color.gray);
        }
        if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese su nombre");
            txt_nombre.setForeground(Color.gray);
        }
        if (txt_pasword.getText().isEmpty()) {
            txt_pasword.setText("Ingrese su contraseña");
            txt_pasword.setForeground(Color.gray);
        }
        if (txt_apellido_paterno.getText().isEmpty()) {
            txt_apellido_paterno.setText("Ingrese su apellido paterno");
            txt_apellido_paterno.setForeground(Color.gray);
        }
        if (txt_apellido_materno.getText().isEmpty()) {
            txt_apellido_materno.setText("Ingrese su apellido materno");
            txt_apellido_materno.setForeground(Color.gray);
        }
        if (txt_correo.getText().isEmpty()) {
            txt_correo.setText("Ingrese su correo");
            txt_correo.setForeground(Color.gray);
        }
        if (txt_direccion.getText().isEmpty()) {
            txt_direccion.setText("Ingrese su dirección");
            txt_direccion.setForeground(Color.gray);
        }
        if (txt_telefono.getText().isEmpty()) {
            txt_telefono.setText("Ingrese su teléfono");
            txt_telefono.setForeground(Color.gray);
        }
        if (txt_año.getText().isEmpty()) {
            txt_año.setText("Año");
            txt_año.setForeground(Color.gray);
        }
        if (txt_mes.getText().isEmpty()) {
            txt_mes.setText("Mes");
            txt_mes.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_diaMousePressed

    private void lbl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseClicked
        new log_in().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_loginMouseClicked

    private void lbl_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseEntered
        lbl_login.setForeground(new Color(22, 255, 0));
    }//GEN-LAST:event_lbl_loginMouseEntered

    private void lbl_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseExited
        lbl_login.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_lbl_loginMouseExited

    private void jbl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseClicked
        
        cuentas CUENT = new cuentas();
        
        if (CUENT.validarUsuario(txt_usuario.getText(), txt_pasword.getText())) {
            JOptionPane.showMessageDialog(null, " ya se encuentra registrado un usuario con el mismo nombre de usuario y contraseña");
        } else {
            trabajadores trab = new trabajadores();
            String DniEncontrado = trab.obtenerDNI(txt_dni.getText());
        
            if (DniEncontrado.equals(txt_dni.getText())) {
                JOptionPane.showMessageDialog(null, "este dni ya se encuentra registrado");
            }else{
                validarcontenidodecampos();
            }
        }
    }//GEN-LAST:event_jbl_registrarMouseClicked

    private void jbl_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseEntered
        pnl_registrar.setBackground(new Color(43,132,130));
        jbl_registrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbl_registrarMouseEntered

    private void jbl_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseExited
        pnl_registrar.setBackground(new Color(23,112,110));
        jbl_registrar.setForeground(new Color(251,120,19));
    }//GEN-LAST:event_jbl_registrarMouseExited

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sing_up_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sing_up_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sing_up_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sing_up_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sing_up_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jbl_registrar;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_fecha_nacimiento;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JPanel pnl_registrar;
    private javax.swing.JTextField txt_apellido_materno;
    private javax.swing.JTextField txt_apellido_paterno;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pasword;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
