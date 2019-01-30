package projectui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh Kukreja
 */
public class MySqlConnect {
    /*
    By:Harsh Kukreja
    The below method connects database and returns connection object
    */
    public static Connection connectDB(){
        try {
            /*
                We want to establish connection with mysql server.
                Connection String for the same will be:
            
            jdbc:mysql://servername:portno/database_name
            
            getConnection (String connectionString, String username, String password);
            */
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/canteendb" , "phpdb" ,"phpdb");
            //JOptionPane.showMessageDialog(null, "Connection Successfull!" ,"Connection" , JOptionPane.INFORMATION_MESSAGE);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull!"+e ,"Connection" , JOptionPane.ERROR_MESSAGE);
            return null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull!"+e ,"Connection" , JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
