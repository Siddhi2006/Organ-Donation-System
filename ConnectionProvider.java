



//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Siddhi
 */
/*public class dbclass
{
   static final String DB_URL="jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false";
   
    static final String USER="root";
    static final String PASS="Siddhi@123";
   /*public static Connection con()
    {
        Connection conn=null;
    
  
        try {
         Class.forName("com.mysql.jdbc.Driver");
  conn=(Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false","root","Siddhi@123");
         // java.sql.Connection conn=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata?autoReconnect=true&useSSL=false\",\"root\",\"Siddhi@123");
        //
          return (Connection) conn;
        } catch (Exception ex) {
           System.out.println("There were errors while conecting to database");
            return null;
        }
    }
 
    public static Connection getcon()
    {
        Connection conn=null;
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
              //  conn=(Connection) java.sql.DriverManager.getConnection(DB_URL,USER,PASS);
              conn=(Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata?autoReconnect=true&useSSL=false","root","Siddhi@123");   
              
            } catch (ClassNotFoundException|SQLException ex) {
                //Logger.getLogger(dbclass.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }  
            return conn;
    } */
public class ConnectionProvider
{
    public static Connection getcon()
    {
   /* {
        
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata","root","Siddhi@123");
         return con;
     }catch(Exception e)
     {
         return null;
     }*/
 Connection con=null;
  try{
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata","root","Siddhi@123");
  }     catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
  return (con);
  }
public static void main(String args[])
    {
        Connection con=ConnectionProvider.getcon();
        System.out.println("Done");
    }
}

            
 
            


 
