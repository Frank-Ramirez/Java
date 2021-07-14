package Controlador;
import Modelo.Conexion;
import Modelo.USR;
import com.mysql.jdbc.Connection;
import inventario.MENU;
import static inventario.inicio.txtUSRL;
import static inventario.inicio.txtpassL;
import java.awt.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Login extends Conexion{
      public int existeU(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con = getConexion();
        String sql = "SELECT COUNT (id) FROM usuario where usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs=ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }/*
        public boolean iniciarLogin(USR usr) {
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con=getConexion();
        String sql = "SELECT id, nombre, pass, tipon, tipo FROM usuario where nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombreUSR());
            rs=ps.executeQuery();
            if (rs.next()) {
                if (usr.getPasword().equals(rs.getString(3))) {
                    usr.setId(rs.getString(1));
                    usr.setNombreUSR(rs.getString(2));
                    usr.setTipon(rs.getString(4));
                    usr.setTipo(rs.getString(5));
                    return true;
                }else{
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        /*finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
         }
     public boolean iniciarSession(){
     Login modSql = new Login();
        USR mod = new USR();
       // String pass = new String(txtpassL.getPassword());
        if (!txtUSRL.getText().equals("") && !txtpassL.equals("")) {
            
          //  String nuevoPass = hash.sha1(pass);
            //setUsuario(txtIu.getText());
            
            mod.setNombreUSR(txtUSRL.getText());
            mod.setPasword(String.valueOf(txtpassL.getPassword()));
            
            if (modSql.iniciarLogin(mod)) {
                Login.frmLog = null;
                this.dispose();
                
                MENU frmMenu = new MENU(mod);
                frmMenu.setVisible(true);
//                this.dispose();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                return false;
                //limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
            return false;
        }
     }*/
}