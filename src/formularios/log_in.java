package formularios;

import clases.historialCompras;
import conexionbd.ConexionMySQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class log_in extends javax.swing.JFrame {

    public log_in() {
        initComponents();
        log_in.this.setBackground(new Color(0,0,0,0));
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
    
        this.setLocation(x, y);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnl_log_in = new javax.swing.JPanel();
        jbl_log_in = new javax.swing.JLabel();
        lbl_salir = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contrasenia = new javax.swing.JPasswordField();
        separathor2 = new javax.swing.JSeparator();
        separathor1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbl_registrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panellogin.setBackground(new java.awt.Color(255, 255, 255));
        panellogin.setForeground(new java.awt.Color(0, 0, 0));
        panellogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("login");
        panellogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 110));
        panellogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 7, -1, -1));

        pnl_log_in.setBackground(new java.awt.Color(0, 13, 23));

        jbl_log_in.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jbl_log_in.setForeground(new java.awt.Color(255, 255, 255));
        jbl_log_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_log_in.setText("Log-In");
        jbl_log_in.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_log_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_log_inMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_log_inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_log_inMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_log_inLayout = new javax.swing.GroupLayout(pnl_log_in);
        pnl_log_in.setLayout(pnl_log_inLayout);
        pnl_log_inLayout.setHorizontalGroup(
            pnl_log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_log_in, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnl_log_inLayout.setVerticalGroup(
            pnl_log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_log_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panellogin.add(pnl_log_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 40));

        lbl_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
        });
        panellogin.add(lbl_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txt_usuario.setForeground(java.awt.Color.gray);
        txt_usuario.setText("Ingrese su usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        panellogin.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, -1));

        txt_contrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setForeground(java.awt.Color.gray);
        txt_contrasenia.setText("********");
        txt_contrasenia.setBorder(null);
        txt_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseniaMousePressed(evt);
            }
        });
        panellogin.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 160, -1));

        separathor2.setBackground(new java.awt.Color(0, 0, 0));
        separathor2.setForeground(new java.awt.Color(0, 0, 0));
        panellogin.add(separathor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, 10));

        separathor1.setBackground(new java.awt.Color(0, 0, 0));
        separathor1.setForeground(new java.awt.Color(0, 0, 0));
        panellogin.add(separathor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, 10));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        panellogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 30, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        panellogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 30, 30));

        getContentPane().add(panellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 360, 390));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿No tienes una cuenta aún?");

        jbl_registrar.setBackground(new java.awt.Color(0, 102, 153));
        jbl_registrar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jbl_registrar.setForeground(new java.awt.Color(153, 153, 0));
        jbl_registrar.setText("Registrate aquí");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbl_registrar)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbl_registrar))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 420, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseClicked
        jbl_registrar.setForeground(Color.RED);
        int option = JOptionPane.showOptionDialog(
                null,
                "¿Qué tipo de cuenta desea registrar?",
                "Mensaje",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Cliente", "Trabajador"},
                "default");

        if (option == 0) {
            new sing_up_cliente().setVisible(true);
            this.dispose();
            System.out.println("Botón 1 presionado");
        } else if (option == 1) {
            new sin_up_trabajador().setVisible(true);
            this.dispose();
            System.out.println("Botón 2 presionado");
        } else {
            System.out.println("Ventana cerrada");
        }
    }//GEN-LAST:event_jbl_registrarMouseClicked

    private static void realizarAccionSegunPermisos(String nombreUsuario, String permisos) {
        if (permisos.equals("TRABAJADOR")) {
            System.out.println("Inicio de sesión exitoso como trabajador. Redirigiendo...");

            ConexionMySQL conexionDB = new ConexionMySQL();
            try (Connection conexion = conexionDB.conectar()) {
                String consultaPersona = "SELECT P.NOMBRE, TU.NOMBRE_TURNO, TU.TURNO_ID " +
                        "FROM CUENTAS C " +
                        "INNER JOIN PERSONAS P ON C.CUENTAS_ID = P.CUENTAS_ID " +
                        "INNER JOIN TRABAJADORES T ON T.PERSONAS_ID = P.PERSONAS_ID " +
                        "INNER JOIN TURNOS TU ON TU.TURNO_ID = T.TURNO_ID " +
                        "WHERE C.PERMISOS = 'TRABAJADOR' AND C.USUARIO = ?";
                
                try (PreparedStatement preparedStatementPersona = conexion.prepareStatement(consultaPersona)) {
                    preparedStatementPersona.setString(1, nombreUsuario);
                    try (ResultSet resultSetTrabajador = preparedStatementPersona.executeQuery()) {
                        if (resultSetTrabajador.next()) {
                            String nombrePersona = resultSetTrabajador.getString("NOMBRE");
                            String nombreTurno = resultSetTrabajador.getString("NOMBRE_TURNO");
                            int Turno_id = resultSetTrabajador.getInt("TURNO_ID");
                            
                            new trabajador(nombrePersona, nombreTurno, Turno_id).setVisible(true);
                        } else {
                            System.out.println("No se pudo obtener la información de la persona dueña de la cuenta.");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (permisos.equals("CLIENTE")) {
            System.out.println("Inicio de sesión exitoso como cliente. Redirigiendo...");

            ConexionMySQL conexionDB = new ConexionMySQL();
            
            try (Connection conexion = conexionDB.conectar()) {
                String consultaliente = "SELECT P.NOMBRE, V.COMBUSTIBLE, V.CANTIDAD, V.PRECIO_UNITARIO, V.PRECIO_TOTAL, V.VUELTO, V.VUELTO, V.FECHA, V.HORA_DE_VENTA " +
                        "FROM CUENTAS C " +
                        "INNER JOIN PERSONAS P ON C.CUENTAS_ID = P.CUENTAS_ID " +
                        "INNER JOIN CLIENTES CL ON P.PERSONAS_ID = CL.PERSONAS_ID " +
                        "INNER JOIN VENTAS V ON CL.CLIENTES_ID = V.CLIENTES_ID " +
                        "WHERE C.PERMISOS = 'CLIENTE' AND C.USUARIO = ?";
                
                try (PreparedStatement preparedStatementCliente = conexion.prepareStatement(consultaliente)) {
                    preparedStatementCliente.setString(1, nombreUsuario);
                    ArrayList<historialCompras> lista_compras = new ArrayList<>();
                    String nombreCliente = null;

                    try (ResultSet resultSetCLIENTE = preparedStatementCliente.executeQuery()) {
                        while (resultSetCLIENTE.next()) {
                            if (nombreCliente == null) {
                                nombreCliente = resultSetCLIENTE.getString("NOMBRE");
                            }
                            String Combustible = resultSetCLIENTE.getString("COMBUSTIBLE");
                            String Cantida = resultSetCLIENTE.getString("CANTIDAD");
                            String PrecioUnitario = resultSetCLIENTE.getString("PRECIO_UNITARIO");
                            String PrecioTotal = resultSetCLIENTE.getString("PRECIO_TOTAL");
                            String fecha = resultSetCLIENTE.getString("FECHA");
                            String HoraCompra = resultSetCLIENTE.getString("HORA_DE_VENTA");

                            historialCompras compra = new historialCompras(Combustible, Cantida, PrecioUnitario, PrecioTotal, fecha, HoraCompra);
            
                            lista_compras.add(compra);
                        }
                    }

                    if (nombreCliente != null) {
                        System.out.println("Nombre obtenido del cliente: " + nombreCliente);
                    } else {
                        System.out.println("No se pudo obtener la información del nombre del cliente.");
                    }

                    for (historialCompras compra : lista_compras) {
                        System.out.println("historial enviado hacia el formulario de clientes:\n"+compra.toString());
                    }

                    new cliente(nombreCliente,lista_compras).setVisible(true);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            System.out.println("Permisos desconocidos.");
        }
    }  
    private void jbl_log_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_log_inMouseClicked
        pnl_log_in.setBackground(new Color(162, 255, 134));
        jbl_log_in.setForeground(Color.BLACK);
        
        if (txt_usuario.getText().equals("Ingrese su usuario")&&String.valueOf(txt_contrasenia.getPassword()).equals("********")) {
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios");
        }
        else if (txt_usuario.getText().equals("")&&String.valueOf(txt_contrasenia.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos se encuentran vacios");
        }
        else{
            if (txt_usuario.getText().equals("Ingrese su usuario")||txt_usuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "El campo de usuario se encuentra vacio");
            }
            else if (String.valueOf(txt_contrasenia.getPassword()).equals("********")||String.valueOf(txt_contrasenia.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "El campo de la contraseña se encuentra vacio");
            }
            else{
                ingresar();
            }
        }
    }//GEN-LAST:event_jbl_log_inMouseClicked
    
    public void ingresar(){
        ConexionMySQL conexionDB = new ConexionMySQL();
        Connection conexion = conexionDB.conectar();

        try {
            String nombreUsuario = txt_usuario.getText();
            String contrasena = txt_contrasenia.getText();
            String consulta = "SELECT CUENTAS.PERMISOS FROM CUENTAS WHERE CUENTAS.USUARIO = ? AND CUENTAS.CONTRASENA = ?";

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, nombreUsuario);
                preparedStatement.setString(2, contrasena);
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String permisos = resultSet.getString("PERMISOS");
                    realizarAccionSegunPermisos(nombreUsuario, permisos);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "permisos invalidos");
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
    
    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void jbl_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseEntered
        jbl_registrar.setForeground(new Color(22, 255, 0));
    }//GEN-LAST:event_jbl_registrarMouseEntered

    private void jbl_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseExited
        jbl_registrar.setForeground(new Color(153,153,0));
    }//GEN-LAST:event_jbl_registrarMouseExited

    private void jbl_log_inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_log_inMouseEntered
        pnl_log_in.setBackground(new Color(22, 255, 0));
        jbl_log_in.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbl_log_inMouseEntered

    private void jbl_log_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_log_inMouseExited
        pnl_log_in.setBackground(new Color(0,13,23));
        jbl_log_in.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbl_log_inMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txt_contrasenia.getPassword()).isEmpty()) {
            txt_contrasenia.setText("********");
            txt_contrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseniaMousePressed
        
        if (String.valueOf(txt_contrasenia.getPassword()).equals("********")) {
            txt_contrasenia.setText("");
            txt_contrasenia.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_contraseniaMousePressed

    
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
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbl_log_in;
    private javax.swing.JLabel jbl_registrar;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JPanel panellogin;
    private javax.swing.JPanel pnl_log_in;
    private javax.swing.JSeparator separathor1;
    private javax.swing.JSeparator separathor2;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
