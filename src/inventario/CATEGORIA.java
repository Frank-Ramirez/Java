package inventario;
import Controlador.ConsultasVenta;
import Controlador.Tablas;
import Modelo.Categoria;
import javax.swing.JOptionPane;
public class CATEGORIA extends javax.swing.JFrame {
Tablas t = new Tablas();
    public CATEGORIA() {
        this.setLocationRelativeTo(null);
        initComponents();
        t.TablaCategoria();//se manda a llamar el metodo de la tabla a mostrar
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtCATN = new javax.swing.JTextField();
        btnCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacategoria = new javax.swing.JTable();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOMBRE");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));
        panel1.add(txtCATN, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 16, 133, -1));

        btnCategoria.setText("GUARDAR");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        panel1.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 15, -1, -1));

        tablacategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablacategoria);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 44, 340, 117));
        panel1.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
ConsultasVenta c = new ConsultasVenta();
Categoria ca= new Categoria();
ca.setNombreCat(txtCATN.getText());
        if (c.NewCategoria(ca)) {
            JOptionPane.showMessageDialog(this,"Categoria nueva creada correctamente");
            txtCATN.setText("");
        }else{
        JOptionPane.showMessageDialog(this,"Error al crear categoria nueva");
        txtCATN.setText("");}
        t.TablaCategoria();
        /*se mandan a llamar los metodos para ejecutar la insercion a la base de datos y se ponen las condiciones para
        saber si se guardo correctamente o no */
        
    }//GEN-LAST:event_btnCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(CATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CATEGORIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CATEGORIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    public static javax.swing.JTable tablacategoria;
    private javax.swing.JTextField txtCATN;
    // End of variables declaration//GEN-END:variables
}
