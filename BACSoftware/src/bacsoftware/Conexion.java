/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacsoftware;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author yayod
 */
public class Conexion {
    
    
    public Connection conexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bac", "root", "");
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error de conexion" + e);
        }        
        return con;
    }
    
    public ArrayList<Data> getInventario() throws SQLException
    {
        ArrayList<Data> datos = new ArrayList<Data>();
        
        String d1,d2,d3;
        float cantidad;
        
        Connection con =  this.conexion();
        Statement stmt = con.createStatement() ;
        ResultSet rs=stmt.executeQuery("select Pr.nombreProducto, sbc.nombreSubcategoria,  cat.nombreCategoria, Pr.cantidad from Producto As Pr  join Subcategoria as sbc   join Categoria as cat where Pr.fk_idSubcategoria = sbc.idSubcategoria and Pr.fk_idCategoria = cat.idCategoria;");
        String devolver="";
        
        
        while(rs.next())
        {   
           Data dato = new Data();
           
           d1 = rs.getString("nombreProducto");
           d2 = rs.getString("nombreSubcategoria");
           d3 = rs.getString("nombreCategoria");
           cantidad = rs.getFloat("Cantidad");
           
           dato.setData(d1, d2, d3, cantidad);
           
           datos.add(dato);
        }
        
        con.close();
        return datos;
    }
}


