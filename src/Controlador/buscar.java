package Controlador;
import Modelo.Conexion;
import static inventario.BUSCAR.tablabuscar;
import static inventario.BUSCAR.txtbuscar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/*se importan los libbrerias necesarias para que el sistema funcione correctamente*/
public class buscar {
        public boolean buscarQR() {
            /*se crea un metosdo que sirve para buscar algun dato en la base de datos, se obtiene el valor del cuadro de texto
             y se le asigna a una nueva variable que se concatena con la consukta*/
         PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= conn.getConexion(); //mysql
String campo = txtbuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = " WHERE qr='" + campo + "'";
        }
        try{
            DefaultTableModel model =new DefaultTableModel();
    tablabuscar.setModel(model);
    String sql ="SELECT * FROM registro "+where;
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
        model.addColumn("QR");
        model.addColumn("NOMBRE");
        model.addColumn("PRECIO VENTA");
        model.addColumn("PRECIO COMPRA");
        model.addColumn("CADUCIDAD");
        model.addColumn("CATEGORIA");
        model.addColumn("PRESENTACION");
        model.addColumn("REGISTRO");
    int [] ancho={50,50,50,50,50,50,50,50};
    for (int i=0; i < CColumna; i++){
        tablabuscar.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }return true;
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean buscarNom() {
         PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= conn.getConexion(); //mysql
String campo = txtbuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = " WHERE nombre='" + campo + "'";
        }
        try{
            DefaultTableModel model =new DefaultTableModel();
    tablabuscar.setModel(model);
    String sql ="SELECT * FROM registro "+where;
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
        model.addColumn("QR");
        model.addColumn("NOMBRE");
        model.addColumn("PRECIO VENTA");
        model.addColumn("PRECIO COMPRA");
        model.addColumn("CADUCIDAD");
        model.addColumn("CATEGORIA");
        model.addColumn("PRESENTACION");
        model.addColumn("REGISTRO");
    int [] ancho={50,50,50,50,50,50,50,50};
    for (int i=0; i < CColumna; i++){
        tablabuscar.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }return true;
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean buscarTodo() {
         PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= conn.getConexion(); //mysql
String campo = txtbuscar.getText();
        String where = "";
        /*if (!"".equals(campo)) {
            where = " WHERE nombre='" + campo + "'";
        }*/
        try{
            DefaultTableModel model =new DefaultTableModel();
    tablabuscar.setModel(model);
    String sql ="SELECT * FROM registro ";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
        model.addColumn("QR");
        model.addColumn("NOMBRE");
        model.addColumn("PRECIO VENTA");
        model.addColumn("PRECIO COMPRA");
        model.addColumn("CADUCIDAD");
        model.addColumn("CATEGORIA");
        model.addColumn("PRESENTACION");
        model.addColumn("REGISTRO");
    int [] ancho={50,50,50,50,50,50,50,50};
    for (int i=0; i < CColumna; i++){
        tablabuscar.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }return true;
        } catch (SQLException ex) {
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}