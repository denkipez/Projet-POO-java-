/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.lang.*;

/**
 *
 * @author Naiss
 */
public class JDBConnector {
     Connection conn = null;
     
     public JDBConnector(){
        
     }

    public Connection CreateConnection() {
        String url = "jdbc:mysql://localhost:3306/cinema";
        String user      = "root";
        String password  = "";
        System.out.println("Connecting database...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Connected successfully to the database");

        } catch (ClassNotFoundException e) {
            System.err.println("Driver loading error : " + e);
        }
        catch (SQLException e)
        {
            System.out.println("Error Occured " + e.toString());
        }
        
        return conn;
        
    }

}
