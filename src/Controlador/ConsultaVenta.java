package Controlador;
import Modelo.Conexion;
import Modelo.Registro;
import Modelo.USR;
import inventario.VENTA;
import static inventario.VENTA.txtcodigo;
import static inventario.VENTA.txtv1;
import static inventario.VENTA.txtv3;
import static inventario.VENTA.txtv4;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConsultaVenta extends Conexion{
    public boolean seleccioanr(Registro re){
        try {
            PreparedStatement ps=null;
            ResultSet rs=null;//se crea una variable de tipo ResultSet 
            Connection con= getConexion();
            String sql="SELECT qr, nombre, precio_venta, fecha_caducidad FROM registro WHERE qr=?";
            ps=con.prepareStatement(sql);
            /*se crea la consulta y se ejecuta la varible*/
           ps.setString(1, re.getQr());
            rs=ps.executeQuery();//se ejecuta la variable ps y se le asigna a la variable rs
            while(rs.next()){//se crea un while para mostrar todos los datos de un registro
            txtv1.setText(rs.getString("qr"));
            VENTA.txtv2.setText(rs.getString("nombre"));
            txtv3.setText(rs.getString("precio_venta"));
            txtv4.setText(rs.getString("fecha_caducidad"));}
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean guardar(Registro r){
        try {
            PreparedStatement ps=null;
            ResultSet rs=null;
            Connection con= getConexion();
            String sql="INSERT INTO venta (codigo,nombreP,total,fecha) VALUES(?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, r.getQr());
            ps.setString(2, r.getNombre());
            ps.setString(3, r.getPrecio_venta());
            ps.setString(4, r.getFecha_caducidad());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean eliminarP(Registro ma) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM venta where codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getQr());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean cancelar(){
        try {
            PreparedStatement ps = null;
            Connection con = getConexion();
            String sql = "truncate venta";
            ps=con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}