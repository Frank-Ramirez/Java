package Controlador;
import Modelo.Conexion;
import static inventario.CATEGORIA.tablacategoria;
import static inventario.Usuario.tablausr;
import static inventario.STOCK.tablastock;
import static inventario.Usuario.tablaeliminarusr;
import static inventario.VENTA.tablaventa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/*se importan los libbrerias necesarias para que el sistema funcione correctamente*/
public class Tablas {
        public void TablaStock(){
            /*Se ejecutan las variables que realizan la cosulta y mmuestran los datos en la tabla*/
    try{
    DefaultTableModel model =new DefaultTableModel();
    tablastock.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT qr,nombre,precio_venta,precio_compra,fecha_caducidad,categoria,presentacion FROM registro";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    /*se crea los espacios necesarios para que la tabla muestre los datos correctamente*/
    model.addColumn("QR");
    model.addColumn("NOMBRE");
    model.addColumn("PRECIO VENTA");
    model.addColumn("PRECIO COMPRA");
    model.addColumn("CADUCIDAD");
     model.addColumn("CATEGORIA");
    model.addColumn("PRESENTACION");
    
    int [] ancho={50,50,50,50,50,50,50};
    for (int i=0; i < CColumna; i++){
        tablastock.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException e) {   
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, e);
        }}
        public void TablaCategoria(){
    try{
    DefaultTableModel model =new DefaultTableModel();
    tablacategoria.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT * FROM categoria";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    
    model.addColumn("NOMBRE");
    
    int [] ancho={50};
    for (int i=0; i < CColumna; i++){
        tablacategoria.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException e) {   
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, e);
        }}
        public void TablaUsuario(){
    try{
    DefaultTableModel model =new DefaultTableModel();
    tablausr.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT id, nombre, tipo FROM usuario";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    model.addColumn("ID");
    model.addColumn("NOMBRE");
    model.addColumn("TIPO");
    
    int [] ancho={50,50,50};
    for (int i=0; i < CColumna; i++){
        tablausr.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException e) {   
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, e);
        }}
        public void TablaEliminarUsuario(){
    try{
    DefaultTableModel model =new DefaultTableModel();
    tablaeliminarusr.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT id, nombre, tipo FROM usuario";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    model.addColumn("ID");
    model.addColumn("NOMBRE");
    model.addColumn("TIPO");
    
    int [] ancho={50,50,50};
    for (int i=0; i < CColumna; i++){
        tablaeliminarusr.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException e) {   
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, e);
        }}
        public void TablaVentas(){
    try{
    DefaultTableModel model =new DefaultTableModel();
    tablaventa.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT codigo,nombreP,total,fecha FROM venta";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    model.addColumn("CODIGO");
    model.addColumn("NOMBRE");
    model.addColumn("PRECIO");
    model.addColumn("CADUCIDAD");
    int [] ancho={50,50,50,50};
    for (int i=0; i < CColumna; i++){
        tablaventa.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException e) {   
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, e);
        }}
}