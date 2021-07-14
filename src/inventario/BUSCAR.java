package inventario;
import Controlador.buscar;
import javax.swing.JOptionPane;
public class BUSCAR extends javax.swing.JFrame {
    buscar b=new buscar();
    public BUSCAR() {
        initComponents();
        radiogroup.add(rbtqr);
        radiogroup.add(rbtnombre);
        radiogroup.add(rbttodos);
        /* se asignan los radiobuton a un radiogroup para que funciones*/
        b.buscarQR();
        b.buscarNom();
         b.buscarTodo();//se mandan a llamr los metodos de las tablas 
         this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radiogroup = new javax.swing.ButtonGroup();
        panel1 = new org.edisoncor.gui.panel.Panel();
        rbttodos = new javax.swing.JRadioButton();
        rbtqr = new javax.swing.JRadioButton();
        rbtnombre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablabuscar = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbttodos.setText("TODOS LOS PRODUCTOS");
        panel1.add(rbttodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 7, -1, -1));

        rbtqr.setText("QR");
        panel1.add(rbtqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        rbtnombre.setText("NOMBRE");
        panel1.add(rbtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        tablabuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablabuscar);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, 206));
        panel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 49, 198, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 48, -1, -1));
        panel1.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 320));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*se realizan condiiones para seleccioanr el tupo de busqueda que se quiere hacer*/
        if (rbtqr.isSelected()==true) {
            b.buscarQR();
        }else if(rbtnombre.isSelected()==true){
            b.buscarNom();
        }else if(rbttodos.isSelected()==true){
            b.buscarTodo();
        }else{
            JOptionPane.showMessageDialog(this,"No se encontraron coincidencias");
        }
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
            java.util.logging.Logger.getLogger(BUSCAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BUSCAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BUSCAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BUSCAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.ButtonGroup radiogroup;
    private javax.swing.JRadioButton rbtnombre;
    private javax.swing.JRadioButton rbtqr;
    private javax.swing.JRadioButton rbttodos;
    public static javax.swing.JTable tablabuscar;
    public static javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
