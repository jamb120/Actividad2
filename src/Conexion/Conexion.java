/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion;

/**
 *
 * @author JOSE
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
      private static Connection conn;
      private static final String drive ="com.mysql.cj.jdbc.Driver";
      private static final String user = "root";
      private static final String password = "";
      private static final String url = "jdbc:mysql://localhost:3306/bymarjorisgarces";
      
    public Conexion() throws SQLException {
        conn=null;
        try {
                Class.forName(drive);
                conn = DriverManager.getConnection(url,user,password);
                if(conn != null){
                    System.out.println("Conexion establecida");
                }
            }
            
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al conectar "+ ex);
            }
        
    }     
    public Connection  getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if(conn==null){
        System.out.println("Conexion terminada");}
    }
        
    }
    

