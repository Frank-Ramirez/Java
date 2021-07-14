package inventario;
import Modelo.Conexion;
import com.mysql.jdbc.Connection;
import static inventario.inicio.txtUSRL;
import static inventario.inicio.txtpassL;
import static inventario.me.jMenu2;
import static inventario.me.jMenuItem1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ses extends javax.swing.JFrame {
    public ses() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jButton1 = new javax.swing.JButton();
        txt2 = new javax.swing.JPasswordField();
        txt1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(0, 102, 153));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setColorPrimario(new java.awt.Color(0, 0, 0));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 0, 51));
        txt2.setBorder(null);
        txt2.setCaretColor(new java.awt.Color(255, 0, 51));
        panel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 127, 20));

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 0, 51));
        txt1.setBorder(null);
        txt1.setCaretColor(new java.awt.Color(255, 0, 51));
        panel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 20));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 10));
        panel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 20));
        panel2.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 230, 300));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int x=0;
         int y=0;
        String co="";
        try{
            PreparedStatement ps=null;
            ResultSet rs=null;
            Conexion conn=new Conexion();
            Connection con=conn.getConexion();
            String sql="SELECT id, tipon from usuario WHERE nombre=\""+txt1.getText()+"\" AND pass=\""+txt2.getText()+"\"";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            ResultSetMetaData ct=rs.getMetaData();
            int cc=rs.getRow();
            while(rs.next()){
                x=rs.getInt("id");
                y=rs.getInt("tipon");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ses.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(x!=0 && y==1){
           me a=new me();
            a.setVisible(true);
            jButton1.setVisible(false);
            this.dispose();
        }else if(x!=0 && y==2){
        me m=new me();
        m.setVisible(true);
        jMenu2.setVisible(false);
        jMenuItem1.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
            txt1.setText(null);
            txt2.setText(null);
            /*se crea un metodo que hace una consulta a la base de datos para comprobar si el usuario existe 
            y dependiendo del tipo puede ver algunas cosas*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTextField txt1;
    private javax.swing.JPasswordField txt2;
    // End of variables declaration//GEN-END:variables
}
