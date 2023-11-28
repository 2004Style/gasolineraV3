package formularios;

import clases.RegistroCombustible;
import clases.combustible;
import clases.turnos;
import clases.ventas;
import conexionbd.ConexionMySQL;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class trabajador extends javax.swing.JFrame {
    
    private String nombrePersona;
    private String nombreTurno;
    private int Turno_id;
    
    public trabajador() {
        initComponents();
        trabajador.this.setBackground(new Color(0,0,0,0));
                
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
    
        this.setLocation(x, y);
        
        pnl_registro.setVisible(false);
        pnl_venta.setVisible(false);
        lbl_home.setVisible(true);
        
        mostrarregistrosgenerales();
        mostrarregistro();
    }

    public trabajador(String NombrePersona, String NombreTurno, int turno_id) {
        this();
        this.nombrePersona = NombrePersona;
        this.nombreTurno = NombreTurno;
        this.Turno_id = turno_id;
        
        
        
        System.out.println("Trabajador: "+NombrePersona);
        System.out.println("Nombre de Turno: "+NombreTurno);
        System.out.println("Turno id: "+turno_id);
        
        validarcamposregistro();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_venta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_cliente = new javax.swing.JTextArea();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_combustible = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_productos = new javax.swing.JTable();
        label_dni = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_cantidadv = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbl_VerHistorial = new javax.swing.JLabel();
        pnl_realizarventa = new javax.swing.JPanel();
        jbl_RealizarVenta = new javax.swing.JLabel();
        txt_dni_cliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_cantidadv = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbl_BuscarPorTipo = new javax.swing.JLabel();
        pnl_MostrarTodo = new javax.swing.JPanel();
        jlb_MostrarTodo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnl_registro = new javax.swing.JPanel();
        txt_tipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        label_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        label_precio = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_productosr = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pnl_registrar = new javax.swing.JPanel();
        jbl_registrar = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        pnl_barra_menu = new javax.swing.JPanel();
        pnl_inicio = new javax.swing.JPanel();
        jbl_inicio = new javax.swing.JLabel();
        pnl_registros = new javax.swing.JPanel();
        jbl_registro = new javax.swing.JLabel();
        pnl_ventas = new javax.swing.JPanel();
        jbl_ventas = new javax.swing.JLabel();
        pnl_volver = new javax.swing.JPanel();
        jbl_volver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_venta.setBackground(new java.awt.Color(255, 255, 255));
        pnl_venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_cliente.setBackground(new java.awt.Color(204, 204, 204));
        ta_cliente.setColumns(10);
        ta_cliente.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ta_cliente.setForeground(new java.awt.Color(0, 0, 0));
        ta_cliente.setRows(5);
        ta_cliente.setBorder(null);
        jScrollPane2.setViewportView(ta_cliente);

        pnl_venta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 220, 100));

        cb_tipo.setBackground(new java.awt.Color(255, 255, 255));
        cb_tipo.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        cb_tipo.setForeground(new java.awt.Color(0, 0, 0));
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_tipo.setBorder(new javax.swing.border.MatteBorder(null));
        pnl_venta.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        cb_combustible.setBackground(new java.awt.Color(255, 255, 255));
        cb_combustible.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        cb_combustible.setForeground(new java.awt.Color(0, 0, 0));
        cb_combustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_combustible.setBorder(new javax.swing.border.MatteBorder(null));
        pnl_venta.add(cb_combustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));

        jt_productos.setBackground(new java.awt.Color(204, 204, 204));
        jt_productos.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jt_productos.setForeground(new java.awt.Color(0, 0, 0));
        jt_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_productos);

        pnl_venta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 260));

        label_dni.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_dni.setForeground(new java.awt.Color(0, 0, 0));
        label_dni.setText("DNI");
        pnl_venta.add(label_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Combustible");
        pnl_venta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        label_cantidadv.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        label_cantidadv.setForeground(new java.awt.Color(0, 0, 0));
        label_cantidadv.setText("Cantidad");
        pnl_venta.add(label_cantidadv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DNI");
        pnl_venta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jbl_VerHistorial.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_VerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        jbl_VerHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_VerHistorial.setText("Ver Historial");
        jbl_VerHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_VerHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_VerHistorialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_VerHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_VerHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnl_venta.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 340, 70));

        pnl_realizarventa.setBackground(new java.awt.Color(0, 51, 102));

        jbl_RealizarVenta.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_RealizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jbl_RealizarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_RealizarVenta.setText("Realizar Venta");
        jbl_RealizarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_RealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_RealizarVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_realizarventaLayout = new javax.swing.GroupLayout(pnl_realizarventa);
        pnl_realizarventa.setLayout(pnl_realizarventaLayout);
        pnl_realizarventaLayout.setHorizontalGroup(
            pnl_realizarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_RealizarVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        pnl_realizarventaLayout.setVerticalGroup(
            pnl_realizarventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_RealizarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pnl_venta.add(pnl_realizarventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 340, 70));

        txt_dni_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_dni_cliente.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_dni_cliente.setForeground(java.awt.Color.gray);
        txt_dni_cliente.setText("Ingrese el Dni del cliente a buscar");
        txt_dni_cliente.setBorder(null);
        txt_dni_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_dni_clienteMousePressed(evt);
            }
        });
        pnl_venta.add(txt_dni_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, -1));
        pnl_venta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 10));

        txt_cantidadv.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidadv.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_cantidadv.setForeground(java.awt.Color.gray);
        txt_cantidadv.setText("Ingrese la cantidad de combustible");
        txt_cantidadv.setBorder(null);
        txt_cantidadv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cantidadvMousePressed(evt);
            }
        });
        pnl_venta.add(txt_cantidadv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, -1));
        pnl_venta.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 10));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jbl_BuscarPorTipo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jbl_BuscarPorTipo.setForeground(new java.awt.Color(255, 255, 255));
        jbl_BuscarPorTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_BuscarPorTipo.setText("Buscar Por Tipo");
        jbl_BuscarPorTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_BuscarPorTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_BuscarPorTipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_BuscarPorTipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_BuscarPorTipoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_BuscarPorTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_BuscarPorTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnl_venta.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 210, 30));

        pnl_MostrarTodo.setBackground(new java.awt.Color(0, 51, 51));

        jlb_MostrarTodo.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jlb_MostrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        jlb_MostrarTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_MostrarTodo.setText("Mostrar Todo");
        jlb_MostrarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlb_MostrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlb_MostrarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_MostrarTodoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlb_MostrarTodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlb_MostrarTodoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_MostrarTodoLayout = new javax.swing.GroupLayout(pnl_MostrarTodo);
        pnl_MostrarTodo.setLayout(pnl_MostrarTodoLayout);
        pnl_MostrarTodoLayout.setHorizontalGroup(
            pnl_MostrarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb_MostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pnl_MostrarTodoLayout.setVerticalGroup(
            pnl_MostrarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb_MostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnl_venta.add(pnl_MostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo");
        pnl_venta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        getContentPane().add(pnl_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 680, 400));

        pnl_registro.setBackground(new java.awt.Color(255, 255, 255));
        pnl_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_tipo.setBackground(new java.awt.Color(255, 255, 255));
        txt_tipo.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_tipo.setForeground(java.awt.Color.gray);
        txt_tipo.setText("Ingrese el tipo de combustible");
        txt_tipo.setBorder(null);
        txt_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_tipoMousePressed(evt);
            }
        });
        pnl_registro.add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo");
        pnl_registro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        pnl_registro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_nombre.setForeground(java.awt.Color.gray);
        txt_nombre.setText("Ingrese el nombre del combustible");
        txt_nombre.setBorder(null);
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        pnl_registro.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, -1));

        label_cantidad.setBackground(new java.awt.Color(0, 0, 0));
        label_cantidad.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        label_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        label_cantidad.setText("Cantidad");
        pnl_registro.add(label_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_cantidad.setForeground(java.awt.Color.gray);
        txt_cantidad.setText("Ingrese la cantidad del combustible");
        txt_cantidad.setBorder(null);
        txt_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cantidadMousePressed(evt);
            }
        });
        pnl_registro.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 210, -1));

        label_precio.setBackground(new java.awt.Color(0, 0, 0));
        label_precio.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        label_precio.setForeground(new java.awt.Color(0, 0, 0));
        label_precio.setText("Precio");
        pnl_registro.add(label_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        txt_precio.setForeground(java.awt.Color.gray);
        txt_precio.setText("Ingrese el precio del combustible");
        txt_precio.setBorder(null);
        txt_precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_precioMousePressed(evt);
            }
        });
        pnl_registro.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, -1));

        jt_productosr.setBackground(new java.awt.Color(204, 204, 204));
        jt_productosr.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jt_productosr.setForeground(new java.awt.Color(0, 0, 0));
        jt_productosr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Tipo", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_productosr);

        pnl_registro.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 170));
        pnl_registro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 210, 10));
        pnl_registro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 210, 10));
        pnl_registro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 10));
        pnl_registro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 210, 10));

        pnl_registrar.setBackground(java.awt.Color.darkGray);

        jbl_registrar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_registrar.setForeground(java.awt.Color.gray);
        jbl_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_registrar.setText("Registrar");
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
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        pnl_registrarLayout.setVerticalGroup(
            pnl_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnl_registro.add(pnl_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 630, 40));

        getContentPane().add(pnl_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 680, 400));

        lbl_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\chave\\Downloads\\home.png")); // NOI18N
        getContentPane().add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 670, 400));

        pnl_barra_menu.setBackground(new java.awt.Color(4, 13, 18));
        pnl_barra_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_inicio.setBackground(new java.awt.Color(4, 13, 18));
        pnl_inicio.setForeground(new java.awt.Color(0, 102, 51));

        jbl_inicio.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_inicio.setForeground(new java.awt.Color(255, 255, 255));
        jbl_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_inicio.setText("Inicio");
        jbl_inicio.setAlignmentY(0.0F);
        jbl_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_inicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_inicioLayout = new javax.swing.GroupLayout(pnl_inicio);
        pnl_inicio.setLayout(pnl_inicioLayout);
        pnl_inicioLayout.setHorizontalGroup(
            pnl_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnl_inicioLayout.setVerticalGroup(
            pnl_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnl_barra_menu.add(pnl_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        pnl_registros.setBackground(new java.awt.Color(4, 13, 18));

        jbl_registro.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_registro.setForeground(new java.awt.Color(255, 255, 255));
        jbl_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_registro.setText("Registro");
        jbl_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_registroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_registroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_registroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_registrosLayout = new javax.swing.GroupLayout(pnl_registros);
        pnl_registros.setLayout(pnl_registrosLayout);
        pnl_registrosLayout.setHorizontalGroup(
            pnl_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnl_registrosLayout.setVerticalGroup(
            pnl_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnl_barra_menu.add(pnl_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));

        pnl_ventas.setBackground(new java.awt.Color(4, 13, 18));

        jbl_ventas.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_ventas.setForeground(new java.awt.Color(255, 255, 255));
        jbl_ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_ventas.setText("Ventas");
        jbl_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_ventasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_ventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_ventasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_ventasLayout = new javax.swing.GroupLayout(pnl_ventas);
        pnl_ventas.setLayout(pnl_ventasLayout);
        pnl_ventasLayout.setHorizontalGroup(
            pnl_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnl_ventasLayout.setVerticalGroup(
            pnl_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnl_barra_menu.add(pnl_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        pnl_volver.setBackground(new java.awt.Color(4, 13, 18));

        jbl_volver.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jbl_volver.setForeground(new java.awt.Color(255, 255, 255));
        jbl_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbl_volver.setText("Volver");
        jbl_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbl_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbl_volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbl_volverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_volverLayout = new javax.swing.GroupLayout(pnl_volver);
        pnl_volver.setLayout(pnl_volverLayout);
        pnl_volverLayout.setHorizontalGroup(
            pnl_volverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnl_volverLayout.setVerticalGroup(
            pnl_volverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnl_barra_menu.add(pnl_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        getContentPane().add(pnl_barra_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarcamposregistro(){
        if(txt_tipo.getText().equals("Ingrese el tipo de combustible")&&txt_nombre.getText().equals("Ingrese el nombre del combustible")&&txt_cantidad.getText().equals("Ingrese la cantidad del combustible")&&txt_precio.getText().equals("Ingrese el precio del combustible")){
            pnl_registrar.setBackground(Color.DARK_GRAY);
            jbl_registrar.setForeground(Color.GRAY);
        }
        else if(txt_tipo.getText().equals("")&&txt_nombre.getText().equals("")&&txt_cantidad.getText().equals("")&&txt_precio.getText().equals("")){
            pnl_registrar.setBackground(Color.DARK_GRAY);
            jbl_registrar.setForeground(Color.GRAY);
        }
        else{
            if(txt_tipo.getText().equals("Ingrese el tipo de combustible")||txt_tipo.getText().equals("")){
                pnl_registrar.setBackground(Color.DARK_GRAY);
                jbl_registrar.setForeground(Color.GRAY);
            }else if(txt_nombre.getText().equals("Ingrese el nombre del combustible")||txt_nombre.getText().equals("")){
                pnl_registrar.setBackground(Color.DARK_GRAY);
                jbl_registrar.setForeground(Color.GRAY);
            }else if(txt_cantidad.getText().equals("Ingrese la cantidad del combustible")||txt_cantidad.getText().equals("")){
                pnl_registrar.setBackground(Color.DARK_GRAY);
                jbl_registrar.setForeground(Color.GRAY);
            }else if(txt_precio.getText().equals("Ingrese el precio del combustible")||txt_precio.getText().equals("")){
                pnl_registrar.setBackground(Color.DARK_GRAY);
                jbl_registrar.setForeground(Color.GRAY);
            }else{
                pnl_registrar.setBackground(new Color(22,255,0));
                jbl_registrar.setForeground(Color.BLACK); 
            }
        }
    }
    public void mostrarregistro(){
        DefaultTableModel tableModel = (DefaultTableModel) jt_productosr.getModel();
        tableModel.setRowCount(0);

        clases.combustible c = new clases.combustible();
        List<clases.combustible> listaCombustibles = c.visualizarTodosLosRegistros();

        tableModel.setRowCount(0);

        for (clases.combustible combustibleItem : listaCombustibles) {
            Object[] rowData = {
                combustibleItem.getCombustible_id(),
                combustibleItem.getTipo(),
                combustibleItem.getNombre(),
                combustibleItem.getCantidad(),
                combustibleItem.getPrecio()
            };
            tableModel.addRow(rowData);
        }
    }
    public void mostrarregistrosgenerales(){
        DefaultTableModel tableModel = (DefaultTableModel) jt_productos.getModel();
        tableModel.setRowCount(0);

        clases.combustible c = new clases.combustible();
        List<clases.combustible> listaCombustibles = c.visualizarTodosLosRegistros();

        tableModel.setRowCount(0);

        for (clases.combustible combustibleItem : listaCombustibles) {
            Object[] rowData = {
                combustibleItem.getTipo(),
                combustibleItem.getNombre(),
                combustibleItem.getCantidad(),
                combustibleItem.getPrecio()
            };
            tableModel.addRow(rowData);
        }
        
        Set<String> tiposUnicos = new HashSet<>();

        for (clases.combustible combustibleItem : listaCombustibles) {
            tiposUnicos.add(combustibleItem.getTipo());
        }

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (String tipo : tiposUnicos) {
            comboBoxModel.addElement(tipo);
        }

        cb_tipo.setModel(comboBoxModel);
        
        Set<String> nombrescombustibleunicos = new HashSet<>();

        for (clases.combustible combustibleItem : listaCombustibles) {
            nombrescombustibleunicos.add(combustibleItem.getNombre());
        }

        DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();

        for (String combustible : nombrescombustibleunicos) {
            comboBoxModel2.addElement(combustible);
        }

        cb_combustible.setModel(comboBoxModel2);
        
    }
    public void registrarcombustible(){
        if (txt_tipo.getText().isEmpty() && txt_nombre.getText().isEmpty() && txt_cantidad.getText().isEmpty() && txt_precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos se encuentran vacíos");
        } else if (txt_tipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de tipo se encuentra vacío");
        } else if (txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de nombre se encuentra vacío");
        } else if (!txt_cantidad.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El campo de cantidad se encuentra vacío o no es un valor numérico entero.");
        } else if (!txt_precio.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo de precio se encuentra vacío o no es un valor numérico decimal.");
        }else{
            String tipo = txt_tipo.getText();
            System.out.println("tipo: "+tipo);

            String nombre = txt_nombre.getText();
            System.out.println("nombre: "+nombre);

            int cantidad = Integer.parseInt(txt_cantidad.getText());
            System.out.println("cantidad: "+cantidad);

            double precio = Double.parseDouble(txt_precio.getText());
            System.out.println("precio: "+precio);

            LocalDate fecha_registro = LocalDate.now();
            System.out.println("fecha_registro: "+fecha_registro);

            int turno_id = Turno_id;
            System.out.println("turno_id: "+turno_id);

            RegistroCombustible rc = new RegistroCombustible(tipo, nombre, cantidad, precio, turno_id, fecha_registro);

            Date fecharegistro = Date.valueOf(fecha_registro);

            boolean exito = rc.registrarCombustible(tipo, nombre, cantidad, precio, turno_id, fecharegistro);

            if (exito) {
                txt_tipo.setText(null);
                txt_nombre.setText(null);
                txt_cantidad.setText(null);
                txt_precio.setText(null);
                System.out.println("registro exitoso...");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el combustible.");
                System.out.println("Error al registrar el combustible.");
            }
        }
    }    public void buscarportipo(){
         String tiposeleccionado = (String) cb_tipo.getSelectedItem();
        
        DefaultTableModel tableModel = (DefaultTableModel) jt_productos.getModel();
        tableModel.setRowCount(0);

        clases.combustible c = new clases.combustible();
        List<clases.combustible> listaCombustibles = c.visualizarRegistro(tiposeleccionado);

        tableModel.setRowCount(0);

        for (clases.combustible combustibleItem : listaCombustibles) {
            Object[] rowData = {
                combustibleItem.getTipo(),
                combustibleItem.getNombre(),
                combustibleItem.getCantidad(),
                combustibleItem.getPrecio()
            };
            tableModel.addRow(rowData);
        }
        
        Set<String> nombrescombustibleunicos = new HashSet<>();

        for (clases.combustible combustibleItem : listaCombustibles) {
            nombrescombustibleunicos.add(combustibleItem.getNombre());
        }

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (String combustible : nombrescombustibleunicos) {
            comboBoxModel.addElement(combustible);
        }

        cb_combustible.setModel(comboBoxModel);
    }
    private void jbl_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_volverMouseClicked
        this.setVisible(false);
        new log_in().setVisible(true);
    }//GEN-LAST:event_jbl_volverMouseClicked

    private void jbl_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_inicioMouseClicked
        lbl_home.setVisible(true);
        pnl_registro.setVisible(false);
        pnl_venta.setVisible(false);
    }//GEN-LAST:event_jbl_inicioMouseClicked

    private void jbl_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_inicioMouseEntered
        pnl_inicio.setBackground(new Color(10,19,24));
        jbl_inicio.setForeground(Color.red);
    }//GEN-LAST:event_jbl_inicioMouseEntered

    private void jbl_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_inicioMouseExited
        pnl_inicio.setBackground(new Color(4,13,18));
        jbl_inicio.setForeground(Color.white);
    }//GEN-LAST:event_jbl_inicioMouseExited

    private void jbl_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registroMouseClicked
        pnl_venta.setVisible(false);
        lbl_home.setVisible(false);
        pnl_registro.setVisible(true);
        
        txt_cantidad.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = txt_cantidad.getText();
                if (texto.isEmpty() || texto.matches("\\d+")) {
                    label_cantidad.setForeground(Color.BLACK);
                    validarcamposregistro();
                } else {
                    label_cantidad.setForeground(Color.RED);
                    pnl_registrar.setBackground(Color.DARK_GRAY);
                    jbl_registrar.setForeground(Color.GRAY);
                    
                }
            }
        });
        txt_precio.getDocument().addDocumentListener(new DocumentListener() {
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
                validarcamposregistro();
                String texto = txt_precio.getText();
                if (texto.isEmpty() || texto.matches("\\d+")) {
                    label_precio.setForeground(Color.BLACK);
                    validarcamposregistro();
                } else {
                    label_precio.setForeground(Color.RED);
                    pnl_registrar.setBackground(Color.DARK_GRAY);
                    jbl_registrar.setForeground(Color.GRAY);
                }
            }
        });
        txt_tipo.getDocument().addDocumentListener(new DocumentListener() {
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
                validarcamposregistro();
            }
        });
        txt_nombre.getDocument().addDocumentListener(new DocumentListener() {
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
                validarcamposregistro();
            }
        });
    }//GEN-LAST:event_jbl_registroMouseClicked

    private void jbl_registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registroMouseEntered
        pnl_registros.setBackground(new Color(10,19,24));
        jbl_registro.setForeground(Color.red);
    }//GEN-LAST:event_jbl_registroMouseEntered

    private void jbl_registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registroMouseExited
        pnl_registros.setBackground(new Color(4,13,18));
        jbl_registro.setForeground(Color.white);
    }//GEN-LAST:event_jbl_registroMouseExited

    private void jbl_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_ventasMouseClicked
        lbl_home.setVisible(false);
        pnl_registro.setVisible(false);
        pnl_venta.setVisible(true);
        
        txt_dni_cliente.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = txt_dni_cliente.getText();
                if (texto.isEmpty() || texto.matches("\\d+")) {
                    label_dni.setForeground(Color.BLACK);
                }else{
                    label_dni.setForeground(Color.RED);
                }
                
                if (texto.length() != 8) {
                    label_dni.setForeground(Color.RED);
                }else {
                    label_dni.setForeground(Color.BLACK);
                    String id = null;
                    buscar_cliente();
                }
            }
        });
              
        txt_cantidadv.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = txt_cantidadv.getText();
                if (texto.matches("\\d+")) {
                    label_cantidadv.setForeground(Color.BLACK);
                    pnl_realizarventa.setBackground(new Color(0,102,153));
                    jbl_RealizarVenta.setForeground(Color.white);
                }else {
                    label_cantidadv.setForeground(Color.RED);
                    pnl_realizarventa.setBackground(new Color(0,51,102));
                    jbl_RealizarVenta.setForeground(Color.white);
                }
            }
        });
    }//GEN-LAST:event_jbl_ventasMouseClicked

    private void jbl_ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_ventasMouseEntered
        pnl_ventas.setBackground(new Color(10,19,24));
        jbl_ventas.setForeground(Color.red);
    }//GEN-LAST:event_jbl_ventasMouseEntered

    private void jbl_ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_ventasMouseExited
        pnl_ventas.setBackground(new Color(4,13,18));
        jbl_ventas.setForeground(Color.white);
    }//GEN-LAST:event_jbl_ventasMouseExited

    private void jbl_volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_volverMouseEntered
        pnl_volver.setBackground(new Color(10,19,24));
        jbl_volver.setForeground(Color.red);
    }//GEN-LAST:event_jbl_volverMouseEntered

    private void jbl_volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_volverMouseExited
        pnl_volver.setBackground(new Color(4,13,18));
        jbl_volver.setForeground(Color.white);
    }//GEN-LAST:event_jbl_volverMouseExited

    private void jbl_VerHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_VerHistorialMouseClicked
        new historial_de_ventas().setVisible(true);new trabajador(this.nombrePersona, this.nombreTurno, this.Turno_id).setVisible(false);
    }//GEN-LAST:event_jbl_VerHistorialMouseClicked

    private void jbl_RealizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_RealizarVentaMouseClicked
        validarcamposdeventa();
    }//GEN-LAST:event_jbl_RealizarVentaMouseClicked

    public void validarcamposdeventa(){
        if (txt_cantidadv.getText().equals("Ingrese la cantidad de combustible")) {
            JOptionPane.showMessageDialog(null, "el campo de cantidad de combustible a vender se encuentra vacio");
        }
        if (txt_cantidadv.getText().matches("\\d+")) {
            clases.turnos turno = new turnos();
            boolean sePuedeRealizarVenta = turno.verificarHorasTurno(this.Turno_id);
            if (sePuedeRealizarVenta) {
                combustible cantidadCombustible = new combustible();
                String tipo = (String) cb_tipo.getSelectedItem();
                String nombre = (String) cb_combustible.getSelectedItem();
                int cantidadVenta = Integer.parseInt(txt_cantidadv.getText());
                int cantidadDisponible = cantidadCombustible.CantidadDisponible(tipo,nombre);
                if (cantidadVenta <= cantidadDisponible) {
                    pnl_realizarventa.setBackground(new Color(0,102,153));
                    jbl_RealizarVenta.setForeground(Color.white);
                    realizarventa();
                }
                else{
                    pnl_realizarventa.setBackground(new Color(0,51,102));
                    jbl_RealizarVenta.setForeground(Color.white);
                    JOptionPane.showMessageDialog(null, "la cantidad que desea vender es superior a la cantidad que dispone la estacion de servicio.");
                }
            } else {
                System.out.println("No se pueden realizar ventas fuera del horario de trabajo.");
                JOptionPane.showMessageDialog(null, "No se pueden realizar ventas fuera del horario de trabajo.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "los campos deben tener un valor numerico");
        }
    }
    public int buscar_cliente(){
        String dni = txt_dni_cliente.getText();
        ConexionMySQL conexionDB = new ConexionMySQL();
        String consulta = "SELECT CL.CLIENTES_ID, P.DNI, P.NOMBRE, P.APELLIDOS_PATERNOS, P.APELLIDOS_MATERNOS, P.TELEFONO " +
                "FROM PERSONAS P " +
                "INNER JOIN CLIENTES CL ON P.PERSONAS_ID = CL.PERSONAS_ID " +
                "WHERE DNI = ?";
        try (Connection connection = conexionDB.conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, dni);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("CLIENTES_ID");
                String Dni = resultSet.getString("DNI");
                String nombre = resultSet.getString("NOMBRE");
                String apellidop = resultSet.getString("APELLIDOS_PATERNOS");
                String apellidom = resultSet.getString("APELLIDOS_MATERNOS");
                String telefono = resultSet.getString("TELEFONO");
                String cliente = ("ID: "+id+"\nDNI: "+Dni+"\nCLIENTE: "+nombre+", "+apellidop+", "+apellidom+"\nTELEFONO: "+telefono);
                ta_cliente.setText(cliente);
                System.out.println("cliente encontrado: "+cliente);
                int ID = Integer.parseInt(id);
                return ID;
            }else{
                String nciente= "no se encontro ningun cliente\nregistrado";
                ta_cliente.setText(nciente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    private void txt_dni_clienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dni_clienteMousePressed
        if (txt_dni_cliente.getText().equals("Ingrese el Dni del cliente a buscar")) {
            txt_dni_cliente.setText("");
            txt_dni_cliente.setForeground(Color.black);
        }
        if (txt_cantidadv.getText().isEmpty()) {
            txt_cantidadv.setText("Ingrese la cantidad de combustible");
            txt_cantidadv.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_dni_clienteMousePressed

    private void txt_cantidadvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cantidadvMousePressed
        if (txt_cantidadv.getText().equals("Ingrese la cantidad de combustible")) {
            txt_cantidadv.setText("");
            txt_cantidadv.setForeground(Color.black);
        }
        if (txt_dni_cliente.getText().isEmpty()) {
            txt_dni_cliente.setText("Ingrese el Dni del cliente a buscar");
            txt_dni_cliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_cantidadvMousePressed

    private void jlb_MostrarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_MostrarTodoMouseClicked
        mostrarregistrosgenerales();
    }//GEN-LAST:event_jlb_MostrarTodoMouseClicked

    private void jlb_MostrarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_MostrarTodoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_MostrarTodoMouseEntered

    private void jlb_MostrarTodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_MostrarTodoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb_MostrarTodoMouseExited

    private void jbl_BuscarPorTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_BuscarPorTipoMouseClicked
        buscarportipo();
    }//GEN-LAST:event_jbl_BuscarPorTipoMouseClicked

    private void jbl_BuscarPorTipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_BuscarPorTipoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbl_BuscarPorTipoMouseEntered

    private void jbl_BuscarPorTipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_BuscarPorTipoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbl_BuscarPorTipoMouseExited

    private void jbl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseClicked
        clases.turnos turno = new turnos();
        boolean sePuedeRealizarVenta = turno.verificarHorasTurno(this.Turno_id);
        if (sePuedeRealizarVenta) {
            registrarcombustible();
            mostrarregistro();
            mostrarregistrosgenerales();
        } else {
            System.out.println("No se pueden registrar combustible fuera del horario de trabajo.");
                JOptionPane.showMessageDialog(null, "No se pueden registrar combustible fuera del horario de trabajo.");
        }
    }//GEN-LAST:event_jbl_registrarMouseClicked

    private void jbl_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbl_registrarMouseEntered

    private void jbl_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_registrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbl_registrarMouseExited

    private void txt_tipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tipoMousePressed
        if (txt_tipo.getText().equals("Ingrese el tipo de combustible")) {
            txt_tipo.setText("");
            txt_tipo.setForeground(Color.black);
        }if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese el nombre del combustible");
            txt_nombre.setForeground(Color.gray);
        }if (txt_cantidad.getText().isEmpty()) {
            txt_cantidad.setText("Ingrese la cantidad del combustible");
            txt_cantidad.setForeground(Color.gray);
        }if (txt_precio.getText().isEmpty()) {
            txt_precio.setText("Ingrese el precio del combustible");
            txt_precio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_tipoMousePressed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
        if (txt_nombre.getText().equals("Ingrese el nombre del combustible")) {
            txt_nombre.setText("");
            txt_nombre.setForeground(Color.black);
        }if (txt_tipo.getText().isEmpty()) {
            txt_tipo.setText("Ingrese el tipo de combustible");
            txt_tipo.setForeground(Color.gray);
        }if (txt_cantidad.getText().isEmpty()) {
            txt_cantidad.setText("Ingrese la cantidad del combustible");
            txt_cantidad.setForeground(Color.gray);
        }if (txt_precio.getText().isEmpty()) {
            txt_precio.setText("Ingrese el precio del combustible");
            txt_precio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_nombreMousePressed

    private void txt_cantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cantidadMousePressed
        if (txt_cantidad.getText().equals("Ingrese la cantidad del combustible")) {
            txt_cantidad.setText("");
            txt_cantidad.setForeground(Color.black);
        }if (txt_tipo.getText().isEmpty()) {
            txt_tipo.setText("Ingrese el tipo de combustible");
            txt_tipo.setForeground(Color.gray);
        }if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese el nombre del combustible");
            txt_nombre.setForeground(Color.gray);
        }if (txt_precio.getText().isEmpty()) {
            txt_precio.setText("Ingrese el precio del combustible");
            txt_precio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_cantidadMousePressed

    private void txt_precioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_precioMousePressed
        if (txt_precio.getText().equals("Ingrese el precio del combustible")) {
            txt_precio.setText("");
            txt_precio.setForeground(Color.black);
        }if (txt_tipo.getText().isEmpty()) {
            txt_tipo.setText("Ingrese el tipo de combustible");
            txt_tipo.setForeground(Color.gray);
        }if (txt_nombre.getText().isEmpty()) {
            txt_nombre.setText("Ingrese el nombre del combustible");
            txt_nombre.setForeground(Color.gray);
        }if (txt_cantidad.getText().isEmpty()) {
            txt_cantidad.setText("Ingrese la cantidad del combustible");
            txt_cantidad.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_precioMousePressed

    public void realizarventa(){
        String tiposeleccionado = (String) cb_tipo.getSelectedItem();
        String combustibleseleccionado = (String) cb_combustible.getSelectedItem();
        
        combustible comb = new combustible();
        double precio = comb.obtenerPrecioCombustible(tiposeleccionado, combustibleseleccionado);
        
        
        int CLIENTES_ID = buscar_cliente();
        if (CLIENTES_ID != 0) {
            String COMBUSTIBLE = combustibleseleccionado;
            int CANTIDAD = Integer.parseInt(txt_cantidadv.getText());
            double PRECIO_UNITARIO = precio;
            double PRECIO_TOTAL = precio * CANTIDAD;
            String TURNO = this.nombreTurno;
            String VENDEDOR = this.nombrePersona;
        
            JTextField txt_dinero_recibido = new JTextField();
                txt_dinero_recibido.setFont(new Font("Roboto Black", Font.PLAIN, 14));
                txt_dinero_recibido.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    updateColor();
                }
            
                @Override
                public void removeUpdate(DocumentEvent e) {
                updateColor();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    updateColor();
                }

                private void updateColor() {
                    try {
                        double dineroRecibido = Double.parseDouble(txt_dinero_recibido.getText());
                        if (dineroRecibido < PRECIO_TOTAL) {
                            txt_dinero_recibido.setForeground(Color.RED);
                        } else {
                            txt_dinero_recibido.setForeground(Color.GREEN);
                        }
                    } catch (NumberFormatException ex) {
                    }
                }
            });

            Object[] message = {
                "Monto total = " + PRECIO_TOTAL + "\nIngrese el dinero recibido:",
                txt_dinero_recibido
            };

            int option = JOptionPane.showOptionDialog(null,
            message,"Mensaje",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,
            new Object[]{"Cancelar venta", "Realizar Venta"},"default");

            if (option == 0) {
                System.out.println("venta cancelada");
            } else if (option == 1) {
                double dineroRecibido = Double.parseDouble(txt_dinero_recibido.getText());
                if (dineroRecibido < PRECIO_TOTAL) {
                    JOptionPane.showMessageDialog(null, "el monto que ah ingresado es inferior al monto del precio total");
                } else {
                    double DINERO_RECIBIDO = Double.parseDouble(txt_dinero_recibido.getText());
                    ventas nuevaventa = new ventas(CLIENTES_ID, COMBUSTIBLE, PRECIO_UNITARIO, PRECIO_TOTAL, TURNO, CANTIDAD, VENDEDOR, DINERO_RECIBIDO);
                    nuevaventa.registrarVenta(CLIENTES_ID, COMBUSTIBLE, PRECIO_UNITARIO, PRECIO_TOTAL, TURNO, CANTIDAD, VENDEDOR, DINERO_RECIBIDO);
        
                    comb.actualizarCantidad(tiposeleccionado, combustibleseleccionado, CANTIDAD);
            
                    mostrarregistro();
                    buscarportipo();
                    System.out.println("venta realizada");
                }
            
            
            } else {
                System.out.println("Ventana cerrada");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "debe ingresar el numero de DNI del cliente al que esta realizando la venta");
        }
        
        
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabajador().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_combustible;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jbl_BuscarPorTipo;
    private javax.swing.JLabel jbl_RealizarVenta;
    private javax.swing.JLabel jbl_VerHistorial;
    private javax.swing.JLabel jbl_inicio;
    private javax.swing.JLabel jbl_registrar;
    private javax.swing.JLabel jbl_registro;
    private javax.swing.JLabel jbl_ventas;
    private javax.swing.JLabel jbl_volver;
    private javax.swing.JLabel jlb_MostrarTodo;
    private javax.swing.JTable jt_productos;
    private javax.swing.JTable jt_productosr;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_cantidadv;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_precio;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JPanel pnl_MostrarTodo;
    private javax.swing.JPanel pnl_barra_menu;
    private javax.swing.JPanel pnl_inicio;
    private javax.swing.JPanel pnl_realizarventa;
    private javax.swing.JPanel pnl_registrar;
    private javax.swing.JPanel pnl_registro;
    private javax.swing.JPanel pnl_registros;
    private javax.swing.JPanel pnl_venta;
    private javax.swing.JPanel pnl_ventas;
    private javax.swing.JPanel pnl_volver;
    private javax.swing.JTextArea ta_cliente;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cantidadv;
    private javax.swing.JTextField txt_dni_cliente;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
