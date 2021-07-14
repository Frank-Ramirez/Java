package inventario;
import Controlador.ConsultaUSR;
import Controlador.ConsultasVenta;
import Controlador.Tablas;
import Modelo.Conexion;
import Modelo.USR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Usuario extends javax.swing.JFrame {
    ConsultasVenta c=new ConsultasVenta();
    ConsultaUSR q=new ConsultaUSR();
    Tablas t1 = new Tablas();
    public Usuario() {
        initComponents();
        c.cargo();
        t1.TablaUsuario();
        t1.TablaEliminarUsuario();
        txtid.setVisible(false);
        /*se mandan a llamr los metodos de las tablas que se van a mostrar*/
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRusr = new javax.swing.JTextField();
        txtRpass = new javax.swing.JPasswordField();
        btnNewUSR = new javax.swing.JButton();
        cbxTU = new javax.swing.JComboBox<>();
        panelCurves3 = new org.edisoncor.gui.panel.PanelCurves();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaeliminarusr = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        txtid = new javax.swing.JTextField();
        panel3 = new org.edisoncor.gui.panel.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablausr = new javax.swing.JTable();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("USUARIO");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 27, -1, -1));

        jLabel2.setText("CONTRASEÑA");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 70, -1, -1));

        jLabel3.setText("TIPO");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 132, -1, -1));
        panel1.add(txtRusr, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 24, 93, -1));
        panel1.add(txtRpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 67, 130, -1));

        btnNewUSR.setText("GUARDAR");
        btnNewUSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUSRActionPerformed(evt);
            }
        });
        panel1.add(btnNewUSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 204, -1, -1));

        cbxTU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel1.add(cbxTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        panel1.add(panelCurves3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 290));

        jTabbedPane1.addTab("Agregar", panel1);

        panel2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel2.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ingresar nombre");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));
        panel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 12, 139, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, -1, -1));

        tablaeliminarusr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaeliminarusr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaeliminarusrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaeliminarusr);

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 410, 190));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        panel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 11, -1, -1));
        panel2.add(panelCurves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 290));
        panel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, -1));

        jTabbedPane1.addTab("Eliminar", panel2);

        panel3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel3.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablausr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablausr);

        panel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 406, 214));
        panel3.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 290));

        jTabbedPane1.addTab("Ver Usuarios", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewUSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUSRActionPerformed
USR u=new USR();
        String r="";
        u.setNombreUSR(txtRusr.getText());
        u.setPasword(txtRpass.getText());
        String cbx=cbxTU.getSelectedItem().toString();
        if (cbx.equals("Administrador")) {
           r="1";  
        }else if(cbx.equals("Empleado")){
             r="2";
        }
        u.setTipon(r);
        u.setTipo(cbx);
        if (q.RegistrarUsuario(u)) {
           JOptionPane.showMessageDialog(this,"Usuario guardado con exito"); 
        }else{
            JOptionPane.showMessageDialog(this,"Error al guardar el usuario");
        }
        t1.TablaUsuario();
        t1.TablaEliminarUsuario();
        /*se mandan a llamar los metodos para ejecutar la insercion a la base de datos y se ponen las condiciones para
        saber si se guardo correctamente o no */
    }//GEN-LAST:event_btnNewUSRActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ConsultaUSR u = new ConsultaUSR();
        USR p = new USR();
        p.setId(txtid.getText());
        if (u.bteliminarU(p)) {
            JOptionPane.showMessageDialog(this, "Usuario Eliminado corectamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error al elimianr el usuario");
        }
         t1.TablaUsuario();
        t1.TablaEliminarUsuario();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tablaeliminarusrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaeliminarusrMouseClicked
        
        try{
    PreparedStatement ps=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion();
    int fila=tablaeliminarusr.getSelectedRow();
    String id=tablaeliminarusr.getValueAt(fila, 0).toString();
    ps=con.prepareStatement("SELECT * FROM usuario WHERE id=?");
    ps.setString(1,id);
    ResultSet rs=null;
    rs=ps.executeQuery();
    while(rs.next()){
        txtid.setText(rs.getString("id"));
       /* txtnombreP.setText(rs.getString("nombre"));
        txtdescripcionP.setText(rs.getString("descripcion"));
        txtcantidadP.setText(rs.getString("cantidad"));*/
    }                
}       catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaeliminarusrMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewUSR;
    private javax.swing.JButton btneliminar;
    public static javax.swing.JComboBox<String> cbxTU;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves3;
    public static javax.swing.JTable tablaeliminarusr;
    public static javax.swing.JTable tablausr;
    private javax.swing.JPasswordField txtRpass;
    private javax.swing.JTextField txtRusr;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
