package Controlador;
import Modelo.Conexion;
import Modelo.USR;
import inventario.inicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*Se importan las librerias necesarias para que funcione el sistema correctamente*/
public class ConsultaUSR extends Conexion{
    public boolean RegistrarUsuario(USR u){
        PreparedStatement ps = null;//creacion de variable que sirve para prepara la abse  de datos mediante la consulta
        Connection con = getConexion();//se crea una variable de tipo conecction y se le asigna la conexion
        String sql = "INSERT INTO usuario (id, nombre, pass, tipon, tipo) VALUES(?,?,?,?,?)";
        //se crea una variable de tipo String que reaiza la consulta
        try {
            ps = con.prepareStatement(sql);//se le asigna la conexion y la consulta a la variable ps
            ps.setString(1, u.getId());
            ps.setString(2, u.getNombreUSR());
            ps.setString(3, u.getPasword());
            ps.setString(4, u.getTipon());
            ps.setString(5, u.getTipo());
            ps.execute();
            /*se le asignan los valores correspondientes para poder insertalos en la BD y se executa la variable ps*/
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {//aqui se cierra la conexion
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     public boolean bteliminarU(USR usr){
    PreparedStatement ps = null;//creacion de variable que sirve para prepara la abse  de datos mediante la consulta
        Connection con = getConexion();//se crea una variable de tipo conecction y se le asigna la conexion
        String sql = "DELETE FROM usuario where id=?";//se crea una variable de tipo String que reaiza la consulta
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getId());
            ps.execute();
            /*se le asignan los valores correspondientes para poder insertalos en la BD y se executa la variable ps*/
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}