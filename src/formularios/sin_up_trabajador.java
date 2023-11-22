package formularios;

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

public class sin_up_trabajador extends javax.swing.JFrame {

    public sin_up_trabajador() {
        initComponents();   
        
        sin_up_trabajador.this.setBackground(new Color(0,0,0,0));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
    
        this.setLocation(x, y);
        
        validarfecha_de_nacimiento();
        validarnumeros();
        validarhora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        txt_turno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_hora_inicio = new javax.swing.JTextField();
        label_hora_inicio = new javax.swing.JLabel();
        label_hora_fin = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JTextField();
        label_sueldo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        txt_minuto_inicio = new javax.swing.JTextField();
        txt_hora_fin = new javax.swing.JTextField();
        txt_minuto_fin = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        pnl_registrar = new javax.swing.JPanel();
        jbl_registrar = new javax.swing.JLabel();
        txt_apellido_paterno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txt_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        label_dni = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_pasword = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_apellido_materno = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        label_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        label_fecha_nacimiento = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txt_dia = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_turno.setBackground(new java.awt.Color(255, 255, 255));
        txt_turno.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_turno.setForeground(java.awt.Color.gray);
        txt_turno.setText("Ingrese el nombre del turno");
        txt_turno.setBorder(null);
        txt_turno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_turnoMousePressed(evt);
            }
        });
        jPanel1.add(txt_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 180, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("TURNO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        txt_hora_inicio.setBackground(new java.awt.Color(255, 255, 255));
        txt_hora_inicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_hora_inicio.setForeground(java.awt.Color.gray);
        txt_hora_inicio.setText("Hora");
        txt_hora_inicio.setBorder(null);
        txt_hora_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_hora_inicioMousePressed(evt);
            }
        });
        jPanel1.add(txt_hora_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 50, -1));

        label_hora_inicio.setBackground(new java.awt.Color(0, 0, 0));
        label_hora_inicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_hora_inicio.setForeground(new java.awt.Color(0, 0, 0));
        label_hora_inicio.setText("HORA INICIO");
        jPanel1.add(label_hora_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        label_hora_fin.setBackground(new java.awt.Color(0, 0, 0));
        label_hora_fin.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_hora_fin.setForeground(new java.awt.Color(0, 0, 0));
        label_hora_fin.setText("HORA FIN");
        jPanel1.add(label_hora_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        txt_sueldo.setBackground(new java.awt.Color(255, 255, 255));
        txt_sueldo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_sueldo.setForeground(java.awt.Color.gray);
        txt_sueldo.setText("Ingrese el sueldo");
        txt_sueldo.setBorder(null);
        txt_sueldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_sueldoMousePressed(evt);
            }
        });
        jPanel1.add(txt_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, -1));

        label_sueldo.setBackground(new java.awt.Color(0, 0, 0));
        label_sueldo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_sueldo.setForeground(new java.awt.Color(0, 0, 0));
        label_sueldo.setText("SUELDO");
        jPanel1.add(label_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CARGO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        txt_cargo.setBackground(new java.awt.Color(255, 255, 255));
        txt_cargo.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_cargo.setForeground(java.awt.Color.gray);
        txt_cargo.setText("Ingrese el cargo");
        txt_cargo.setBorder(null);
        txt_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cargoMousePressed(evt);
            }
        });
        jPanel1.add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, -1));

        txt_minuto_inicio.setBackground(new java.awt.Color(255, 255, 255));
        txt_minuto_inicio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_minuto_inicio.setForeground(java.awt.Color.gray);
        txt_minuto_inicio.setText("Minuto");
        txt_minuto_inicio.setBorder(null);
        txt_minuto_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_minuto_inicioMousePressed(evt);
            }
        });
        jPanel1.add(txt_minuto_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txt_hora_fin.setBackground(new java.awt.Color(255, 255, 255));
        txt_hora_fin.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_hora_fin.setForeground(java.awt.Color.gray);
        txt_hora_fin.setText("Hora");
        txt_hora_fin.setBorder(null);
        txt_hora_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_hora_finMousePressed(evt);
            }
        });
        jPanel1.add(txt_hora_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 50, -1));

        txt_minuto_fin.setBackground(new java.awt.Color(255, 255, 255));
        txt_minuto_fin.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        txt_minuto_fin.setForeground(java.awt.Color.gray);
        txt_minuto_fin.setText("Minuto");
        txt_minuto_fin.setBorder(null);
        txt_minuto_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_minuto_finMousePressed(evt);
            }
        });
        jPanel1.add(txt_minuto_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 60, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 180, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 10));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 10));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 10, 480));

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
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnl_registrarLayout.setVerticalGroup(
            pnl_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 180, 50));

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
        jPanel1.add(txt_apellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 10));

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
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 10));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("NOMBRE");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

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
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 10));

        label_dni.setBackground(new java.awt.Color(0, 0, 0));
        label_dni.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_dni.setForeground(new java.awt.Color(0, 0, 0));
        label_dni.setText("DNI");
        jPanel1.add(label_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 10));

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
        jPanel1.add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 91, 180, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("CONTRASEÑA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 69, -1, -1));

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
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 10));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("USUARIO");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 13, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

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
        jPanel1.add(txt_apellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, -1));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 10));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("CORREO");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

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
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, 10));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("DIRECCION");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

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
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 10));

        label_telefono.setBackground(new java.awt.Color(0, 0, 0));
        label_telefono.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_telefono.setForeground(new java.awt.Color(0, 0, 0));
        label_telefono.setText("TELEFONO");
        jPanel1.add(label_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

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
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, 10));

        label_fecha_nacimiento.setBackground(new java.awt.Color(0, 0, 0));
        label_fecha_nacimiento.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_fecha_nacimiento.setForeground(new java.awt.Color(0, 0, 0));
        label_fecha_nacimiento.setText("FECHA DE NACIMIENTO");
        jPanel1.add(label_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

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
        jPanel1.add(txt_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 40, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 10));

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
        jPanel1.add(txt_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, -1));

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
        jPanel1.add(txt_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 430, 500));

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
        jPanel2.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Ya tienes una cuenta?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing-up.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarcontenidodecampos(){
        if (txt_apellido_paterno.getText().equals("Ingrese su apellido paterno")||txt_usuario.getText().equals("Ingrese su usuario")||txt_dni.getText().equals("Ingrese su DNI")||txt_nombre.getText().equals("Ingrese su nombre")||txt_pasword.getText().equals("Ingrese su contraseña")||txt_apellido_materno.getText().equals("Ingrese su apellido materno")||txt_correo.getText().equals("Ingrese su correo")||txt_direccion.getText().equals("Ingrese su dirección")||txt_telefono.getText().equals("Ingrese su teléfono")||txt_año.getText().equals("Año")||txt_mes.getText().equals("Mes")||txt_dia.getText().equals("Día")||txt_sueldo.getText().equals("Ingrese el sueldo")||txt_cargo.getText().equals("Ingrese el cargo")||txt_turno.getText().equals("Ingrese el nombre del turno")||txt_hora_inicio.getText().equals("Hora")||txt_minuto_inicio.getText().equals("Minuto")||txt_hora_fin.getText().equals("Hora")||txt_minuto_fin.getText().equals("Minuto")
            ||txt_apellido_paterno.getText().equals("")||txt_usuario.getText().equals("")||txt_dni.getText().equals("")||txt_nombre.getText().equals("")||txt_pasword.getText().equals("")||txt_apellido_materno.getText().equals("")||txt_correo.getText().equals("")||txt_direccion.getText().equals("")||txt_telefono.getText().equals("")||txt_año.getText().equals("")||txt_mes.getText().equals("")||txt_dia.getText().equals("")||txt_sueldo.getText().equals("")||txt_cargo.getText().equals("")||txt_turno.getText().equals("")||txt_hora_inicio.getText().equals("")||txt_minuto_inicio.getText().equals("")||txt_hora_fin.getText().equals("")||txt_minuto_fin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "todos los campos deben ser rellenados");
        }
        else{
            //CUENTA
            String user = txt_usuario.getText();
            System.out.println("user: " +user);
            String pasword = txt_pasword.getText();
            System.out.println("pasword: " +pasword);
            String permisos = "TRABAJADOR";
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
            String TELEFONO = "+51 "+txt_telefono.getText();
            System.out.println("TELEFONO: " +TELEFONO);
            String nacimiento = txt_año.getText()+"-"+txt_mes.getText()+"-"+txt_dia.getText();
            String FECHA_NACIMIENTO = nacimiento;
            System.out.println("FECHA_NACIMIENTO: " +FECHA_NACIMIENTO);

            //TURNO
            String NOMBRE_TURNO = txt_turno.getText();
            System.out.println("NOMBRE_TURNO: " +NOMBRE_TURNO);
            String horainicio = txt_hora_inicio.getText()+":"+txt_minuto_inicio.getText()+":00";
            String HORA_INICIO = horainicio;
            System.out.println("HORA_INICIO: " +HORA_INICIO);
            String horafin = txt_hora_fin.getText()+":"+txt_minuto_fin.getText()+":00";
            String HORA_FIN = horafin;
            System.out.println("HORA_FIN: " +HORA_FIN);

            //TRABAJADOR
            double sueldo = Double.parseDouble(txt_sueldo.getText()) ;
            System.out.println("sueldo: " +sueldo);
            String puesto = txt_cargo.getText();
            System.out.println("puesto: " +puesto);

            trabajadores t = new trabajadores(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, FECHA_NACIMIENTO, NOMBRE_TURNO, HORA_INICIO, HORA_FIN, puesto, sueldo);

            try {
                Date fechaNacimiento = Date.valueOf(FECHA_NACIMIENTO);
                Time fechaInicio = Time.valueOf(HORA_INICIO);
                Time fechaFin = Time.valueOf(HORA_FIN);
                boolean exito = t.nuevo_Trabajador(user, pasword, permisos, DNI, NOMBRE, APELLIDOS_PATERNOS, APELLIDOS_MATERNOS, CORREO, DIRECCION, TELEFONO, fechaNacimiento, NOMBRE_TURNO, fechaInicio, fechaFin, CORREO, sueldo);

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
                if (texto.matches("\\d+")) {
                    label_dni.setForeground(Color.BLACK);
                } else {
                    label_dni.setForeground(Color.RED);
                }
                if (texto.length() < 8) {
                    label_dni.setForeground(Color.RED);
                }else {
                    label_dni.setForeground(Color.BLACK);
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
                /*String texto = txt_telefono.getText();
                if (texto.matches("^\\+\\d+$")) {
                    label_telefono.setForeground(Color.BLACK);
                } else {
                    label_telefono.setForeground(Color.RED);
                }*/
                
                String texto = txt_telefono.getText();
                if (texto.matches("\\d{9}") && texto.startsWith("9")) {
                    label_telefono.setForeground(Color.BLACK);
                    if (texto.length() != 9) {
                        label_telefono.setForeground(Color.RED);
                    }else {
                        label_telefono.setForeground(Color.BLACK);
                    }
                } else {
                    label_telefono.setForeground(Color.RED);
                }
                
            }
        });
        txt_sueldo.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = txt_sueldo.getText();
                if (texto.isEmpty() || texto.matches("\\d+")) {
                    label_sueldo.setForeground(Color.BLACK);
                } else {
                    label_sueldo.setForeground(Color.RED);
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
    
    
    public void validarhora() {
        asignarhorainicio(txt_hora_inicio);
        asignarhorainicio(txt_minuto_inicio);
        asignarhorafin(txt_hora_fin);
        asignarhorafin(txt_minuto_fin);
    }
    public void asignarhorainicio(JTextField textField) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarCampohorainicio(textField, label_hora_inicio);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarCampohorainicio(textField, label_hora_inicio);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarCampohorainicio(textField, label_hora_inicio);
            }
        });
    }
    public void asignarhorafin(JTextField textField) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validarCampohorafin(textField, label_hora_fin);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validarCampohorafin(textField, label_hora_fin);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validarCampohorafin(textField, label_hora_fin);
            }
        });
    }
    public void validarCampohorainicio(JTextField textField, JLabel label) {
        String texto = textField.getText();
        if (texto.isEmpty() || !texto.matches("\\d+")) {
            label.setForeground(Color.RED);
            return;
        }

        int numero = Integer.parseInt(texto);

        if (textField == txt_hora_inicio) {
            if (texto.length() != 2 || numero > 23) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        } else if (textField == txt_minuto_inicio) {
            if (texto.length() != 2 || numero > 59) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        }
    }
    public void validarCampohorafin(JTextField textField, JLabel label) {
        String texto = textField.getText();
        if (texto.isEmpty() || !texto.matches("\\d+")) {
            label.setForeground(Color.RED);
            return;
        }

        int numero = Integer.parseInt(texto);

        if (textField == txt_hora_fin) {
            if (texto.length() != 2 || numero > 23) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        } else if (textField == txt_minuto_fin) {
            if (texto.length() != 2 || numero > 59) {
                label.setForeground(Color.RED);
            } else {
                label.setForeground(Color.BLACK);
            }
        }
    }
    
    
    
    
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_apellido_paternoMousePressed

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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_nombreMousePressed

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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_dniMousePressed

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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_paswordMousePressed

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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_telefonoMousePressed

    private void txt_añoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_añoMousePressed
        validarfecha_de_nacimiento();
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_añoMousePressed

    private void txt_diaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_diaMousePressed
        validarfecha_de_nacimiento();
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_diaMousePressed

    private void txt_mesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mesMousePressed
        validarfecha_de_nacimiento();
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_mesMousePressed

    private void txt_sueldoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sueldoMousePressed
        if (txt_sueldo.getText().equals("Ingrese el sueldo")) {
            txt_sueldo.setText("");
            txt_sueldo.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_sueldoMousePressed

    private void txt_cargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cargoMousePressed
        if (txt_cargo.getText().equals("Ingrese el cargo")) {
            txt_cargo.setText("");
            txt_cargo.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_cargoMousePressed

    private void txt_turnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_turnoMousePressed
        if (txt_turno.getText().equals("Ingrese el nombre del turno")) {
            txt_turno.setText("");
            txt_turno.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_turnoMousePressed

    private void txt_hora_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hora_inicioMousePressed
        if (txt_hora_inicio.getText().equals("Hora")) {
            txt_hora_inicio.setText("");
            txt_hora_inicio.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_hora_inicioMousePressed

    private void txt_minuto_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minuto_inicioMousePressed
        if (txt_minuto_inicio.getText().equals("Minuto")) {
            txt_minuto_inicio.setText("");
            txt_minuto_inicio.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_minuto_inicioMousePressed

    private void txt_hora_finMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hora_finMousePressed
        if (txt_hora_fin.getText().equals("Hora")) {
            txt_hora_fin.setText("");
            txt_hora_fin.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_fin.getText().isEmpty()) {
            txt_minuto_fin.setText("Minuto");
            txt_minuto_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_hora_finMousePressed

    private void txt_minuto_finMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minuto_finMousePressed
        if (txt_minuto_fin.getText().equals("Minuto")) {
            txt_minuto_fin.setText("");
            txt_minuto_fin.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
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
        if (txt_sueldo.getText().isEmpty()) {
            txt_sueldo.setText("Ingrese el sueldo");
            txt_sueldo.setForeground(Color.gray);
        }
        if (txt_cargo.getText().isEmpty()) {
            txt_cargo.setText("Ingrese el cargo");
            txt_cargo.setForeground(Color.gray);
        }
        if (txt_turno.getText().isEmpty()) {
            txt_turno.setText("Ingrese el nombre del turno");
            txt_turno.setForeground(Color.gray);
        }
        if (txt_hora_inicio.getText().isEmpty()) {
            txt_hora_inicio.setText("Hora");
            txt_hora_inicio.setForeground(Color.gray);
        }
        if (txt_minuto_inicio.getText().isEmpty()) {
            txt_minuto_inicio.setText("Minuto");
            txt_minuto_inicio.setForeground(Color.gray);
        }
        if (txt_hora_fin.getText().isEmpty()) {
            txt_hora_fin.setText("Hora");
            txt_hora_fin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_minuto_finMousePressed

    private void jbl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseClicked
        cuentas CUENT = new cuentas();
        
        if (CUENT.validarUsuario(txt_usuario.getText())) {
            JOptionPane.showMessageDialog(null, " ya se encuentra registrado un usuario con el mismo nombre");
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
            java.util.logging.Logger.getLogger(sin_up_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sin_up_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sin_up_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sin_up_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sin_up_trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jbl_registrar;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_fecha_nacimiento;
    private javax.swing.JLabel label_hora_fin;
    private javax.swing.JLabel label_hora_inicio;
    private javax.swing.JLabel label_sueldo;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JPanel pnl_registrar;
    private javax.swing.JTextField txt_apellido_materno;
    private javax.swing.JTextField txt_apellido_paterno;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_hora_fin;
    private javax.swing.JTextField txt_hora_inicio;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_minuto_fin;
    private javax.swing.JTextField txt_minuto_inicio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pasword;
    private javax.swing.JTextField txt_sueldo;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_turno;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
