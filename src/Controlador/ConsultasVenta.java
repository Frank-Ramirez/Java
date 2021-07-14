package Controlador;
import Modelo.Categoria;
import Modelo.Conexion;
import Modelo.Registro;
import com.mysql.jdbc.Connection;
import inventario.Producto;
import inventario.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*Se importan las librerias necesarias para ejecutar el programa*/
public class ConsultasVenta extends Conexion{
    public boolean categoria(){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Connection con=getConexion();
            String SQL ="Select nombre From categoria";//se hace una consulta para seleccionar los datos de la catgeoria
        try {
            Producto.cbxCategoria.removeAllItems();/*se hace una conculta a la tabla categoria y se le asignan los valores 
            al check box*/
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            Producto.cbxCategoria.addItem("Selecione una opcion");
            while(rs.next()){//se ejecuta un ehile para mostrar los datos de la tabla
                Producto.cbxCategoria.addItem(rs.getString("nombre"));
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public boolean cargo(){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Connection con=getConexion();
            String SQL ="Select cargo From tipo";
        try {
            Usuario.cbxTU.removeAllItems();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            Usuario.cbxTU.addItem("Selecione una opcion");
            while(rs.next()){
                Usuario.cbxTU.addItem(rs.getString("cargo"));
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public boolean Registrar(Registro g){
        try {
            ResultSet rs=null;
            PreparedStatement ps=null;
            Connection con=getConexion();
            String sql="INSERT INTO registro (qr, nombre,precio_venta, precio_compra, fecha_caducidad, categoria, presentacion, fecha_registro) values(?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, g.getQr());
            ps.setString(2, g.getNombre());
            ps.setString(3, g.getPrecio_venta());
            ps.setString(4, g.getPrecio_compra());
            ps.setString(5, String.valueOf(g.getFecha_caducidad()));
            ps.setString(6, g.getCategoria());
            ps.setString(7, g.getPresentacion());
            ps.setString(8, g.getFecha_registro());
            ps.execute();
            /*se hace una consulta y se inserta en la tabla registro se ejecuta la cosulta */
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasVenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en la consukta");
            return false;
        }
        } 
        public boolean NewCategoria(Categoria c){
        try {
            ResultSet rs=null;
            PreparedStatement ps=null;
            Connection con=getConexion();
            String sql="INSERT INTO categoria (nombre) VALUES (?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, c.getNombreCat());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
        public boolean presentacion(){
        PreparedStatement ps=null;
            ResultSet rs=null;
            Connection con=getConexion();
            String SQL ="Select nombre From presentacion";
        try {
            Producto.cbxpresentacion.removeAllItems();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            Producto.cbxpresentacion.addItem("Selecione una opcion");
            while(rs.next()){
                Producto.cbxpresentacion.addItem(rs.getString("nombre"));
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasVenta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}