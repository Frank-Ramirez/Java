package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
 private static String usr = "root";
 private static String pass = "";
 private static String url = "jdbc:mysql://localhost:3306/farmacia";
 Connection con = null;
 public Connection getConexion(){
     try {
         Class.forName("com.mysql.jdbc.Driver");
         con=(Connection) DriverManager.getConnection(url,usr,pass);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
     }
     return con;
 }
 void Conectar(){
     getConexion();
 }
    public static void main(String[] args) {
        Conexion c = new Conexion();
     c.Conectar();
    }
}