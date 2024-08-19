/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TechSpot.config;


import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Claudio Duhart
 */
public class conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_tienda_final";
    String user="root";
    String pass="";
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
    
}
