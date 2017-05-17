/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacsoftware;
import java.sql.*;
/**
 *
 * @author yayod
 */
public class Conexion {
    Connection con = null;
    
    public Connection conexion(){
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
}


