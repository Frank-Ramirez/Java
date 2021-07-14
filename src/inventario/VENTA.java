package inventario;
import Controlador.ConsultaVenta;
import Controlador.ConsultasVenta;
import Controlador.Tablas;
import Modelo.Conexion;
import Modelo.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class VENTA extends javax.swing.JFrame {
    Tablas tr=new Tablas();
    public VENTA() {
        initComponents();
        this.setLocationRelativeTo(null);
       // jButton2.setVisible(false);
        txtv1.setVisible(false);
        txtv2.setVisible(false);
        txtv3.setVisible(false);
        txtv4.setVisible(false);
        tr.TablaVentas();
        /*se niega la visibilidad de algunos textfield para evitar saturar el frame de campos 
        y se manda a llamr el metodo de la tabla*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        labelRes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnanadir = new javax.swing.JButton();
        txtv1 = new javax.swing.JTextField();
        txtv2 = new javax.swing.JTextField();
        txtv3 = new javax.swing.JTextField();
        txtv4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("QR");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 24, -1, -1));
        panel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 21, 146, -1));

        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaventaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaventa);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 480, 178));

        labelRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelRes.setText("TOTAL $ 00.00");
        panel1.add(labelRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 293, -1, -1));

        jButton1.setText("VENDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 296, -1, -1));

        btnanadir.setText("Añadir");
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });
        panel1.add(btnanadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        panel1.add(txtv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 70, -1));
        panel1.add(txtv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 30, -1));
        panel1.add(txtv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 40, -1));
        panel1.add(txtv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 30, -1));

        jButton3.setText("Cancelar Venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton2.setText("Eliminar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));
        panel1.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaventaMouseClicked
        try{
    PreparedStatement ps=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion();
    int fila=tablaventa.getSelectedRow();
    String id=tablaventa.getValueAt(fila, 0).toString();
    ps=con.prepareStatement("SELECT * FROM venta WHERE codigo=?");
    ps.setString(1,id);
    ResultSet rs=null;
    rs=ps.executeQuery();
    while(rs.next()){
        txtv1.setText(rs.getString("codigo"));
        txtv2.setText(rs.getString("nombreP"));
        txtv3.setText(rs.getString("total"));
        txtv4.setText(rs.getString("fecha"));
    }
    tr.TablaVentas();
}       catch (SQLException ex) {
            Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaventaMouseClicked
int re=0;
    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirActionPerformed
        ConsultaVenta cv=new ConsultaVenta();
        Registro ro=new Registro();
        ro.setQr(txtcodigo.getText());
        if (cv.seleccioanr(ro)) {
            ro.setQr(txtv1.getText());
            ro.setNombre(txtv2.getText());
            ro.setPrecio_venta(txtv3.getText());
            ro.setFecha_caducidad(txtv4.getText());
            cv.guardar(ro);
            tr.TablaVentas();
        }
        tr.TablaVentas();
        
        int r=Integer.parseInt(txtv3.getText().toString());
        
        re=re+r;
        txtv3.setText("");
        labelRes.setText("TOTAL $ "+re);
        txtcodigo.setText("");
        /*se mandan a llamar los metodos para ejecutar la insercion a la base de datos y se ponen las condiciones para
        saber si se guardo correctamente o no y se limpian los campos para una siguiente insercion */
    }//GEN-LAST:event_btnanadirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ConsultaVenta ccv=new ConsultaVenta();
        Registro res=new Registro();
        res.setQr(txtv1.getText());
        res.setNombre(txtv2.getText());
        res.setPrecio_venta(txtv3.getText());
        res.setFecha_caducidad(txtv4.getText());
        if (ccv.eliminarP(res)) {
            JOptionPane.showMessageDialog(this,"Producto ELiminado");
        }else{
            JOptionPane.showMessageDialog(this,"No Se Pudo ELiminar El Producto");
        }
         tr.TablaVentas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         ConsultaVenta ccv=new ConsultaVenta();
         ccv.cancelar();
         tr.TablaVentas();
         labelRes.setText("TOTAL $ 00.00");
        txtcodigo.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ConsultaVenta ccv=new ConsultaVenta();
         if (ccv.cancelar()) {
            JOptionPane.showMessageDialog(this,"Venta Realizada");
        }else{
             JOptionPane.showMessageDialog(this,"No Se Pudo Registrar La Venta");
         }
         tr.TablaVentas();
         labelRes.setText("TOTAL $ 00.00");
        txtcodigo.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanadir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRes;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    public static javax.swing.JTable tablaventa;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtv1;
    public static javax.swing.JTextField txtv2;
    public static javax.swing.JTextField txtv3;
    public static javax.swing.JTextField txtv4;
    // End of variables declaration//GEN-END:variables
}
