package inventario;
import Controlador.ConsultasVenta;
import Modelo.Registro;
import java.util.Date;
import javax.swing.JOptionPane;
public class Producto extends javax.swing.JFrame {
    ConsultasVenta cv = new ConsultasVenta();
    public Producto() {
        initComponents();
        //cv.categoria();
        this.setLocationRelativeTo(null);
    }
    public void limpiar(){
        txtqr.setText("");
        txtnombre.setText("");
        txtprecioventa.setText("");
        txtpreciocompra.setText("");
        /*se crea metodo paralimpiar los cuadros de texto*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtqr = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtpreciocompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxpresentacion = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        txtfechacaducidad = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FECHA CADUCIDAD");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        panel1.add(txtqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 110, -1));
        panel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, -1));
        panel1.add(txtprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, -1));
        panel1.add(txtpreciocompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, -1));

        jLabel2.setText("PRECIO VENTA");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("NOMBRE");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel5.setText("CATEGORIA");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel4.setText("PRECIO COMPRA");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("PRESENTACION");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel7.setText("QR");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anticonceptivo", "Pastillas", "Analgesicos", "Jarabes", "Crema/Gel" }));
        panel1.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, -1));

        cbxpresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tableta", "Ampolleta", "Capsulas", "Ampolleta Bebible", "Crema", "Efervecente", "Emulsion", "Frasco", "Gel", "Gel Capsulas", "Jarabe", "Inyectable" }));
        panel1.add(cbxpresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, -1));

        btnSave.setText("GUARDAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));
        panel1.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 330));
        panel1.add(txtfechacaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ConsultasVenta c = new ConsultasVenta();
        Registro g = new Registro();
        g.setQr(txtqr.getText());
        g.setNombre(txtnombre.getText());
        g.setPrecio_venta(txtprecioventa.getText());
        g.setPrecio_compra(txtpreciocompra.getText());
        Date date=txtfechacaducidad.getDate();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
       String f=fecha.toString();
        System.out.println(""+f);
        g.setFecha_caducidad(f);
        String cbxC=cbxCategoria.getSelectedItem().toString();
        
        g.setCategoria(cbxC);
        String cbxP=cbxpresentacion.getSelectedItem().toString();
        g.setPresentacion(cbxP);
        if (c.Registrar(g)) {
            JOptionPane.showMessageDialog(this,"Registro guardado");
            limpiar();
        }else{
        JOptionPane.showMessageDialog(this,"Error al registrar el producto");
        limpiar();}
        /*se mandan a llamar los metodos para ejecutar la insercion a la base de datos y se ponen las condiciones para
        saber si se guardo correctamente o no  */
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSave;
    public static javax.swing.JComboBox<String> cbxCategoria;
    public static javax.swing.JComboBox<String> cbxpresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private com.toedter.calendar.JDateChooser txtfechacaducidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtqr;
    // End of variables declaration//GEN-END:variables
}
