/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class conector {
    
    Connection conexion = null;
    String url = 
   "jdbc:mysql://localhost:3306/productos";
    String usuario = "root";
    String password = "1234";
    
    
    public conector(){
        
        try {
            conexion = (Connection) DriverManager.getConnection(url,usuario,password);
            if (conexion != null) {
                System.out.println("Se conecto");
            } else {
                System.err.println("No Se conecto");
            }
        } catch (SQLException ex) {
            System.err.println("Error conexion");
            ex.printStackTrace();
        }
    }
    
    
    public  Connection getConxion(){
        return conexion;
    }
    
    public  void Desconectars(){
        conexion = null;
    }
    
}
