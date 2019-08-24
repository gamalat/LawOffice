/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Al-Ahram
 */
public class DBConection {

    public static java.sql.Connection con;

    public static java.sql.Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LawOffice", "root", "");
             
             System.out.println("connection established");
             
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        return con;
    }

    public static void DisConnection() {
        if (con != null) {
            con = null;
        }
    }

    public static void main(String[] args) {

        new DBConection().getConnection();

    }
}