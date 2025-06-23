package principal;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    static DefaultTableModel t = new DefaultTableModel();
//    DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();

//    ArrayList<String> usuariosReg = new ArrayList<>();
    ArrayList<Libro> listaLibros = new ArrayList<>();
    ArrayList<Revista> listaRevistas = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        t = (DefaultTableModel) tablaLibros.getModel();
        oculta();
        ocultarMenus();
        pnlAcceso.setVisible(true);
        pnlInicio.setVisible(false);
//        usuariosReg.add("Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogLibros = new javax.swing.JDialog();
        lblLibros = new javax.swing.JLabel();
        btnAnyadirLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        btnActualizarTablaLibros = new javax.swing.JButton();
        btnActualizarLibro = new javax.swing.JButton();
        btnVolverLibros = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        dialogAnyadirLibros = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoLib = new javax.swing.JTextField();
        txtTituloLib = new javax.swing.JTextField();
        txtAutorLib = new javax.swing.JTextField();
        txtEditorialLib = new javax.swing.JTextField();
        txtCantidadLib = new javax.swing.JTextField();
        btnAceptarLibro = new javax.swing.JButton();
        btnRegresarAnyadirLibros = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dialogRevistas = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRevistas = new javax.swing.JTable();
        btnActualizarRev = new javax.swing.JButton();
        btnAnyadirRev = new javax.swing.JButton();
        btnRegresarRev1 = new javax.swing.JButton();
        btnVolverRevistas = new javax.swing.JButton();
        dialogAnyadirRevistas = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCodigoRev = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTituloRev = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEditorialRev = new javax.swing.JTextField();
        btnAceptarRev = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        dialogTesis = new javax.swing.JDialog();
        lblLibros1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTesis = new javax.swing.JTable();
        btnAnyadirTesis = new javax.swing.JButton();
        btnActualizarTesis = new javax.swing.JButton();
        dialogRegistrarUsuario = new javax.swing.JDialog();
        lblEstudiante = new javax.swing.JLabel();
        lblIngresarDatos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoPat = new javax.swing.JLabel();
        txtApellidoPat = new javax.swing.JTextField();
        lblApellidoMat = new javax.swing.JLabel();
        txtApellidoMat = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblLicenciatura = new javax.swing.JLabel();
        cmbBxLicenciatura = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlAcceso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btnRegistrarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlInicio = new javax.swing.JPanel();
        btnVerLibros = new javax.swing.JButton();
        btnVerRevistas = new javax.swing.JButton();
        btnVerTesis = new javax.swing.JButton();
        lblInicio = new javax.swing.JLabel();
        menus = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuItemInicio = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        mnItmLibros = new javax.swing.JMenuItem();
        mnItmRevistas = new javax.swing.JMenuItem();
        mnItmTesis = new javax.swing.JMenuItem();
        menuPrestamos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        dialogLibros.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogLibros.setModal(true);
        dialogLibros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLibros.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        lblLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibros.setText("Libros");
        dialogLibros.getContentPane().add(lblLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 470, 60));

        btnAnyadirLibro.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnAnyadirLibro.setText("Añadir libro");
        btnAnyadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnyadirLibroActionPerformed(evt);
            }
        });
        dialogLibros.getContentPane().add(btnAnyadirLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 250, -1));

        tablaLibros.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Editorial", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaLibros);

        dialogLibros.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 730, 320));

        btnActualizarTablaLibros.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnActualizarTablaLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconActualizar.png"))); // NOI18N
        btnActualizarTablaLibros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarTablaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaLibrosActionPerformed(evt);
            }
        });
        dialogLibros.getContentPane().add(btnActualizarTablaLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnActualizarLibro.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnActualizarLibro.setText("<html>Actualizar<br>registro</html>");
        btnActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLibroActionPerformed(evt);
            }
        });
        dialogLibros.getContentPane().add(btnActualizarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        btnVolverLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconVolverAtras.png"))); // NOI18N
        btnVolverLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLibrosActionPerformed(evt);
            }
        });
        dialogLibros.getContentPane().add(btnVolverLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        btnEliminarLibro.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnEliminarLibro.setText("<html>Eliminar<br>registro</html>");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });
        dialogLibros.getContentPane().add(btnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        dialogAnyadirLibros.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogAnyadirLibros.setModal(true);
        dialogAnyadirLibros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Añadir Libro");
        dialogAnyadirLibros.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 320, 40));

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel7.setText("Código");
        dialogAnyadirLibros.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel8.setText("Título");
        dialogAnyadirLibros.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel9.setText("Autor");
        dialogAnyadirLibros.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel10.setText("Cantidad");
        dialogAnyadirLibros.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel11.setText("Editorial");
        dialogAnyadirLibros.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        txtCodigoLib.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirLibros.getContentPane().add(txtCodigoLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 380, -1));

        txtTituloLib.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirLibros.getContentPane().add(txtTituloLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 380, -1));

        txtAutorLib.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        txtAutorLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorLibKeyTyped(evt);
            }
        });
        dialogAnyadirLibros.getContentPane().add(txtAutorLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 380, -1));

        txtEditorialLib.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirLibros.getContentPane().add(txtEditorialLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 380, -1));

        txtCantidadLib.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        txtCantidadLib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadLibKeyTyped(evt);
            }
        });
        dialogAnyadirLibros.getContentPane().add(txtCantidadLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 380, -1));

        btnAceptarLibro.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnAceptarLibro.setText("Aceptar");
        btnAceptarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarLibroActionPerformed(evt);
            }
        });
        dialogAnyadirLibros.getContentPane().add(btnAceptarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        btnRegresarAnyadirLibros.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnRegresarAnyadirLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconVolverAtras.png"))); // NOI18N
        btnRegresarAnyadirLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAnyadirLibrosActionPerformed(evt);
            }
        });
        dialogAnyadirLibros.getContentPane().add(btnRegresarAnyadirLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 50));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libros.jpeg"))); // NOI18N
        jLabel12.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel12.setPreferredSize(new java.awt.Dimension(800, 600));
        dialogAnyadirLibros.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        dialogRevistas.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogRevistas.setModal(true);
        dialogRevistas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel14.setText("Revistas");
        dialogRevistas.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        tablaRevistas.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        tablaRevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Editorial"
            }
        ));
        jScrollPane2.setViewportView(tablaRevistas);

        dialogRevistas.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 690, 350));

        btnActualizarRev.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnActualizarRev.setText("Actualizar");
        btnActualizarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRevActionPerformed(evt);
            }
        });
        dialogRevistas.getContentPane().add(btnActualizarRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        btnAnyadirRev.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnAnyadirRev.setText("Añadir revistas");
        btnAnyadirRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnyadirRevActionPerformed(evt);
            }
        });
        dialogRevistas.getContentPane().add(btnAnyadirRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        btnRegresarRev1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnRegresarRev1.setText("Regresar");
        btnRegresarRev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRev1ActionPerformed(evt);
            }
        });
        dialogRevistas.getContentPane().add(btnRegresarRev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        btnVolverRevistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconVolverAtras.png"))); // NOI18N
        btnVolverRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRevistasActionPerformed(evt);
            }
        });
        dialogRevistas.getContentPane().add(btnVolverRevistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 50));

        dialogAnyadirRevistas.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogAnyadirRevistas.setModal(true);
        dialogAnyadirRevistas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Añadir Revista");
        dialogAnyadirRevistas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 320, 40));

        jLabel16.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel16.setText("Código");
        dialogAnyadirRevistas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        txtCodigoRev.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirRevistas.getContentPane().add(txtCodigoRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 380, -1));

        jLabel17.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel17.setText("Título");
        dialogAnyadirRevistas.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        txtTituloRev.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirRevistas.getContentPane().add(txtTituloRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 380, -1));

        jLabel18.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        jLabel18.setText("Editorial");
        dialogAnyadirRevistas.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        txtEditorialRev.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogAnyadirRevistas.getContentPane().add(txtEditorialRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 380, -1));

        btnAceptarRev.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnAceptarRev.setText("Aceptar");
        btnAceptarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRevActionPerformed(evt);
            }
        });
        dialogAnyadirRevistas.getContentPane().add(btnAceptarRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconRev.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        dialogAnyadirRevistas.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 180, 180));

        dialogTesis.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogTesis.setPreferredSize(new java.awt.Dimension(800, 600));
        dialogTesis.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLibros1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        lblLibros1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibros1.setText("Tesis");
        dialogTesis.getContentPane().add(lblLibros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 510, 60));

        tablaTesis.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        tablaTesis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Licenciatura", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(tablaTesis);

        dialogTesis.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 730, 320));

        btnAnyadirTesis.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnAnyadirTesis.setText("Añadir tesis");
        btnAnyadirTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnyadirTesisActionPerformed(evt);
            }
        });
        dialogTesis.getContentPane().add(btnAnyadirTesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 250, -1));

        btnActualizarTesis.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnActualizarTesis.setText("Actualizar");
        btnActualizarTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTesisActionPerformed(evt);
            }
        });
        dialogTesis.getContentPane().add(btnActualizarTesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 160, 40));

        dialogRegistrarUsuario.setMinimumSize(new java.awt.Dimension(800, 600));
        dialogRegistrarUsuario.setModal(true);
        dialogRegistrarUsuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstudiante.setFont(new java.awt.Font("Liberation Serif", 3, 36)); // NOI18N
        lblEstudiante.setText("Usuario");
        dialogRegistrarUsuario.getContentPane().add(lblEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        lblIngresarDatos.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblIngresarDatos.setText("Ingrese sus datos:");
        dialogRegistrarUsuario.getContentPane().add(lblIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        lblNombre.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblNombre.setText("Nombre:");
        dialogRegistrarUsuario.getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNombre.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogRegistrarUsuario.getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 310, -1));

        lblApellidoPat.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblApellidoPat.setText("Apellido Paterno:");
        dialogRegistrarUsuario.getContentPane().add(lblApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtApellidoPat.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogRegistrarUsuario.getContentPane().add(txtApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 310, -1));

        lblApellidoMat.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblApellidoMat.setText("Apellido Materno:");
        dialogRegistrarUsuario.getContentPane().add(lblApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtApellidoMat.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogRegistrarUsuario.getContentPane().add(txtApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 310, -1));

        lblMatricula.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblMatricula.setText("Matrícula:");
        dialogRegistrarUsuario.getContentPane().add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        txtMatricula.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        dialogRegistrarUsuario.getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 310, -1));

        lblLicenciatura.setFont(new java.awt.Font("Liberation Serif", 3, 24)); // NOI18N
        lblLicenciatura.setText("Licenciatura:");
        dialogRegistrarUsuario.getContentPane().add(lblLicenciatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        cmbBxLicenciatura.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        cmbBxLicenciatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informática", "Administración Municipal", "Administración Pública", "Ciencias Biomédicas", "Ciencias Empresariales", "Enfermería", "Medicina", "Nutrición", "Odontología " }));
        dialogRegistrarUsuario.getContentPane().add(cmbBxLicenciatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 310, -1));

        btnRegistrar.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        dialogRegistrarUsuario.getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        dialogRegistrarUsuario.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel13.setOpaque(true);
        dialogRegistrarUsuario.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alumno.png"))); // NOI18N
        jLabel20.setOpaque(true);
        dialogRegistrarUsuario.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Biblioteca");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAcceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a la biblioteca");
        pnlAcceso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 653, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlAcceso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 720, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgBiblioLogo.jpg"))); // NOI18N
        pnlAcceso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 160, 160));

        cmbUsuarios.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        cmbUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Alumno", " " }));
        pnlAcceso.add(cmbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 250, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario");
        pnlAcceso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contraseña");
        pnlAcceso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, -1));

        password.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        pnlAcceso.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 248, -1));

        jButton1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlAcceso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        btnRegistrarUsuario.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        btnRegistrarUsuario.setText("Registrar usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        pnlAcceso.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libros.jpeg"))); // NOI18N
        pnlAcceso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        getContentPane().add(pnlAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVerLibros.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        btnVerLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconLibros.png"))); // NOI18N
        btnVerLibros.setText("Ver Libros");
        btnVerLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLibrosActionPerformed(evt);
            }
        });
        pnlInicio.add(btnVerLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        btnVerRevistas.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        btnVerRevistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconRevistas.png"))); // NOI18N
        btnVerRevistas.setText("Ver Revistas");
        btnVerRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRevistasActionPerformed(evt);
            }
        });
        pnlInicio.add(btnVerRevistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        btnVerTesis.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        btnVerTesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconTesis.png"))); // NOI18N
        btnVerTesis.setText("Ver Tesis");
        btnVerTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTesisActionPerformed(evt);
            }
        });
        pnlInicio.add(btnVerTesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/libros.jpeg"))); // NOI18N
        pnlInicio.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        menus.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N

        menuInicio.setText("Inicio");
        menuInicio.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N

        menuItemInicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemInicio.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        menuItemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon1.png"))); // NOI18N
        menuItemInicio.setText("Inicio");
        menuInicio.add(menuItemInicio);

        menuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemCerrarSesion.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        menuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon2.png"))); // NOI18N
        menuItemCerrarSesion.setText("Cerrar Sesión");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemCerrarSesion);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemSalir.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon4.png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemSalir);

        menus.add(menuInicio);

        menuConsultar.setText("Consultar acervo");
        menuConsultar.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N

        mnItmLibros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnItmLibros.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        mnItmLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-book_1370093.png"))); // NOI18N
        mnItmLibros.setText("Libros");
        mnItmLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmLibrosActionPerformed(evt);
            }
        });
        menuConsultar.add(mnItmLibros);

        mnItmRevistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnItmRevistas.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        mnItmRevistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magazine_1155654.png"))); // NOI18N
        mnItmRevistas.setText("Revistas");
        mnItmRevistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmRevistasActionPerformed(evt);
            }
        });
        menuConsultar.add(mnItmRevistas);

        mnItmTesis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnItmTesis.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        mnItmTesis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document_326868.png"))); // NOI18N
        mnItmTesis.setText("Tesis");
        mnItmTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmTesisActionPerformed(evt);
            }
        });
        menuConsultar.add(mnItmTesis);

        menus.add(menuConsultar);

        menuPrestamos.setText("Préstamos");
        menuPrestamos.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconPrestamo.png"))); // NOI18N
        jMenuItem3.setText("Solicitar Préstamo");
        menuPrestamos.add(jMenuItem3);

        menus.add(menuPrestamos);

        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon6.png"))); // NOI18N
        jMenuItem4.setText("Ver préstamos");
        menuReportes.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconLibros.png"))); // NOI18N
        jMenuItem5.setText("Libros más solicitados");
        menuReportes.add(jMenuItem5);

        menus.add(menuReportes);

        setJMenuBar(menus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItmLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmLibrosActionPerformed
        mostrarJDialogLibros();
    }//GEN-LAST:event_mnItmLibrosActionPerformed

    private void mnItmRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmRevistasActionPerformed
        mostrarJDialogRevistas();
    }//GEN-LAST:event_mnItmRevistasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = (String) cmbUsuarios.getSelectedItem();
        String contrasenya = String.valueOf(password.getPassword());
        String contraseña = "admin", nombre = "Administrador";
        if (!contrasenya.isEmpty()) {
            if (nombre.equals(usuario)) {
                if (contraseña.equals(contrasenya)) {
                    //pnlAcceso.setVisible(false);
                    mostrarMenus();
                    oculta();
                    pnlInicio.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error C");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error U");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Introduzca la contraseña");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerLibrosActionPerformed

    private void btnVerRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRevistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerRevistasActionPerformed

    private void btnVerTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerTesisActionPerformed

    private void btnAnyadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnyadirLibroActionPerformed
        dialogAnyadirLibros.setLocationRelativeTo(this);
        dialogAnyadirLibros.setVisible(true);
    }//GEN-LAST:event_btnAnyadirLibroActionPerformed

    private void btnActualizarTablaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaLibrosActionPerformed
        mostrarJDialogLibros();
    }//GEN-LAST:event_btnActualizarTablaLibrosActionPerformed

    private void btnAceptarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarLibroActionPerformed
        if (!validarDatosLib()) {
            return;
        }
        Libro a = new Libro(txtCodigoLib.getText(), txtTituloLib.getText(), txtAutorLib.getText(), txtEditorialLib.getText(), Integer.parseInt(txtCantidadLib.getText()), true);
        listaLibros.add(a);
        txtCodigoLib.setText("");
        txtTituloLib.setText("");
        txtAutorLib.setText("");
        txtEditorialLib.setText("");
        txtCantidadLib.setText("");
        JOptionPane.showMessageDialog(dialogAnyadirLibros, "Libro registrado. \nActualice para ver cambios.");
        System.out.println(listaLibros.size());
        System.out.println("ArrayList: " + listaLibros);
    }//GEN-LAST:event_btnAceptarLibroActionPerformed

    private void btnActualizarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRevActionPerformed
        mostrarJDialogRevistas();
    }//GEN-LAST:event_btnActualizarRevActionPerformed

    private void btnAnyadirRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnyadirRevActionPerformed
        dialogAnyadirRevistas.setLocationRelativeTo(this);
        dialogAnyadirRevistas.setVisible(true);
    }//GEN-LAST:event_btnAnyadirRevActionPerformed

    private void btnRegresarRev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRev1ActionPerformed
        dialogRevistas.setVisible(false);
    }//GEN-LAST:event_btnRegresarRev1ActionPerformed

    private void btnAceptarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRevActionPerformed
        if (!validarDatosRev()) {
            return;
        }
        Revista b = new Revista(txtCodigoRev.getText(), txtTituloRev.getText(), txtEditorialRev.getText());
        listaRevistas.add(b);
        txtCodigoRev.setText("");
        txtTituloRev.setText("");
        txtEditorialRev.setText("");
        JOptionPane.showMessageDialog(this, "Revista registrada.");
        System.out.println(listaRevistas.size());
        System.out.println("ArrayList: " + listaRevistas);
    }//GEN-LAST:event_btnAceptarRevActionPerformed

    private void mnItmTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmTesisActionPerformed
        mostrarJDialogTesis();
    }//GEN-LAST:event_mnItmTesisActionPerformed

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        mostrarJDialogRegistrarUsuario();
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnAnyadirTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnyadirTesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnyadirTesisActionPerformed

    private void btnActualizarTesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTesisActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Usuario d = new Usuario(txtNombre.getText(), txtApellidoPat.getText(), txtApellidoMat.getText(), txtMatricula.getText(), String.valueOf(cmbBxLicenciatura.getSelectedItem()));
        listaUsuarios.add(d);
        txtNombre.setText("");
        txtApellidoPat.setText("");
        txtApellidoMat.setText("");
        txtMatricula.setText("");
        JOptionPane.showMessageDialog(this, "Usuario agregado.");
        System.out.println(listaUsuarios.size());
        System.out.println("ArrayList: " + listaUsuarios);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNombre.setText("");
        txtApellidoPat.setText("");
        txtApellidoMat.setText("");
        txtMatricula.setText("");
        dialogRegistrarUsuario.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        oculta();
        ocultarMenus();
        pnlAcceso.setVisible(true);
        password.setText("");
        menus.setEnabled(false);
        pnlInicio.setVisible(false);
        //cerrarSesion.setEnabled(false);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
//        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea salir?", "Elija una opción", JOptionPane.YES_NO_OPTION);
//        if (opcion == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(this, "Hasta luego. Au revoir", "Salir", JOptionPane.INFORMATION_MESSAGE);
//            System.exit(0);
//        } else {
//            JOptionPane.showMessageDialog(this, "Volviendo...", "Volver", JOptionPane.INFORMATION_MESSAGE);
//        }
        java.awt.event.WindowEvent cerrar = new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING);
        formWindowClosing(cerrar);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea salir?", "Elija una opción", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "<html>Hasta luego.<br/>Au revoir.</html>", "Salir", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Volviendo...", "Volver", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
        int indiceFila = tablaLibros.getSelectedRow();
        int columna = 0;
        if (indiceFila != -1) {
            String codigoLibro = (String) tablaLibros.getValueAt(indiceFila, columna);
            for (Libro l : listaLibros) {
                if (l.getCodigo().equals(codigoLibro)) {
                    txtCodigoLib.setText(l.getCodigo());
                    txtTituloLib.setText(l.getTitulo());
                    txtAutorLib.setText(l.getAutor());
                    txtEditorialLib.setText(l.getEditorial());
                    txtCantidadLib.setText(String.valueOf(l.getCantidad()));
                    dialogAnyadirLibros.setLocationRelativeTo(this);
                    dialogAnyadirLibros.setVisible(true);
                    listaLibros.remove(indiceFila);
                    break;
                } else {
                    JOptionPane.showMessageDialog(dialogLibros, "Libro no encontrado!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(dialogLibros, "Seleccione un registro!", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void btnRegresarAnyadirLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAnyadirLibrosActionPerformed
        if (!txtCodigoLib.getText().trim().isEmpty() || !txtTituloLib.getText().trim().isEmpty()
            || !txtAutorLib.getText().trim().isEmpty() || !txtEditorialLib.getText().trim().isEmpty()
            || !txtCantidadLib.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error de registro.");
        }
        dialogAnyadirLibros.setVisible(false);
    }//GEN-LAST:event_btnRegresarAnyadirLibrosActionPerformed

    private void btnVolverLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLibrosActionPerformed
        dialogLibros.setVisible(false);
    }//GEN-LAST:event_btnVolverLibrosActionPerformed

    private void btnVolverRevistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRevistasActionPerformed
        dialogRevistas.setVisible(false);
    }//GEN-LAST:event_btnVolverRevistasActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        int indiceFila = tablaLibros.getSelectedRow();
        int columna = 0;
        if (indiceFila != -1) {
            String codigoLibro = (String) tablaLibros.getValueAt(indiceFila, columna);
            for (Libro l : listaLibros) {
                if (l.getCodigo().equals(codigoLibro)) {
                    listaLibros.remove(indiceFila);
                    JOptionPane.showMessageDialog(dialogLibros, "<html>Libro eliminado.<br/>Actualice para ver cambios.</html>", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                } else {
                    JOptionPane.showMessageDialog(dialogLibros, "Libro no encontrado!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(dialogLibros, "Seleccione un registro!", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void txtCantidadLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadLibKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadLibKeyTyped

    private void txtAutorLibKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorLibKeyTyped
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtAutorLibKeyTyped

    public void oculta() {
        pnlAcceso.setVisible(false);
    }

    public void ocultarMenus() {
        menuInicio.setEnabled(false);
        menuConsultar.setEnabled(false);
        menuPrestamos.setEnabled(false);
        menuReportes.setEnabled(false);
    }

    public void mostrarMenus() {
        menuInicio.setEnabled(true);
        menuConsultar.setEnabled(true);
        menuPrestamos.setEnabled(true);
        menuReportes.setEnabled(true);
    }

    public static void limpiaTabla() {
        int a = t.getRowCount();
        while (a != 0) {
            if (a != 0) {
                t.removeRow(0);
            }
            a = t.getRowCount();
        }
    }

    public void mostrarJDialogLibros() {
        dialogLibros.setLocationRelativeTo(this);
        dialogLibros.setVisible(true);
        limpiaTabla();
        for (Libro a : listaLibros) {
            Object[] fila = {a.getCodigo(), a.getTitulo(), a.getAutor(), a.getEditorial(), a.getCantidad()};
            t.addRow(fila);
        }
        tablaLibros.setModel(t);
    }

    public void mostrarJDialogRevistas() {
        dialogRevistas.setLocationRelativeTo(this);
        dialogRevistas.setVisible(true);
        limpiaTabla();
        for (Revista a : listaRevistas) {
            Object[] fila = {a.getCodigo(), a.getTitulo(), a.getEditorial()};
            t.addRow(fila);
        }
        tablaRevistas.setModel(t);
    }

    public void mostrarJDialogTesis() {
        dialogTesis.setLocationRelativeTo(this);
        dialogTesis.setVisible(true);
        limpiaTabla();
        for (Libro a : listaLibros) {
            Object[] fila = {a.getCodigo(), a.getTitulo(), a.getAutor(), a.getEditorial(), a.getIdioma()};
            t.addRow(fila);
        }
        tablaTesis.setModel(t);
    }

    public void mostrarJDialogRegistrarUsuario() {
        dialogRegistrarUsuario.setLocationRelativeTo(this);
        dialogRegistrarUsuario.setVisible(true);
    }

    public boolean validarDatosRev() {
        if (txtCodigoRev.getText().trim().isEmpty() || txtTituloRev.getText().trim().isEmpty()
                || txtEditorialRev.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese adecuadamente sus datos.");
            return false;
        }
        return true;
    }

    public boolean validarDatosLib() {
        if (txtCodigoLib.getText().trim().isEmpty() || txtTituloLib.getText().trim().isEmpty()
                || txtAutorLib.getText().trim().isEmpty() || txtEditorialLib.getText().trim().isEmpty()
                || txtCantidadLib.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(dialogAnyadirLibros, "Por favor, ingrese adecuadamente los datos.");
            return false;
        }
        return true;
    }

    public boolean validarDatosUsuario() {
        if (txtCodigoLib.getText().trim().isEmpty() || txtTituloLib.getText().trim().isEmpty()
                || txtAutorLib.getText().trim().isEmpty() || txtEditorialLib.getText().trim().isEmpty()
                || txtCantidadLib.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese adecuadamente sus datos.");
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarLibro;
    private javax.swing.JButton btnAceptarRev;
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JButton btnActualizarRev;
    private javax.swing.JButton btnActualizarTablaLibros;
    private javax.swing.JButton btnActualizarTesis;
    private javax.swing.JButton btnAnyadirLibro;
    private javax.swing.JButton btnAnyadirRev;
    private javax.swing.JButton btnAnyadirTesis;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegresarAnyadirLibros;
    private javax.swing.JButton btnRegresarRev1;
    private javax.swing.JButton btnVerLibros;
    private javax.swing.JButton btnVerRevistas;
    private javax.swing.JButton btnVerTesis;
    private javax.swing.JButton btnVolverLibros;
    private javax.swing.JButton btnVolverRevistas;
    private javax.swing.JComboBox<String> cmbBxLicenciatura;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JDialog dialogAnyadirLibros;
    private javax.swing.JDialog dialogAnyadirRevistas;
    private javax.swing.JDialog dialogLibros;
    private javax.swing.JDialog dialogRegistrarUsuario;
    private javax.swing.JDialog dialogRevistas;
    private javax.swing.JDialog dialogTesis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellidoMat;
    private javax.swing.JLabel lblApellidoPat;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblIngresarDatos;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblLibros1;
    private javax.swing.JLabel lblLicenciatura;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemInicio;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuPrestamos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuBar menus;
    private javax.swing.JMenuItem mnItmLibros;
    private javax.swing.JMenuItem mnItmRevistas;
    private javax.swing.JMenuItem mnItmTesis;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pnlAcceso;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTable tablaRevistas;
    private javax.swing.JTable tablaTesis;
    private javax.swing.JTextField txtApellidoMat;
    private javax.swing.JTextField txtApellidoPat;
    private javax.swing.JTextField txtAutorLib;
    private javax.swing.JTextField txtCantidadLib;
    private javax.swing.JTextField txtCodigoLib;
    private javax.swing.JTextField txtCodigoRev;
    private javax.swing.JTextField txtEditorialLib;
    private javax.swing.JTextField txtEditorialRev;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTituloLib;
    private javax.swing.JTextField txtTituloRev;
    // End of variables declaration//GEN-END:variables
}
