/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ritesh.crm;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Trainee
 */
public class DBConnection {
    Connection con = null;
    
    public static final String USER = "root";
    public static final String PASS = "";
    public static final String URL = "jdbc:mysql://localhost:3306/crm_db";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(URL,USER,PASS);
    }catch(Exception e){
        System.out.println(e);
        JOptionPane.showMessageDialog(null,"Unable to connect to DB, Please contact your DB administrator !!","ERROR",JOptionPane.ERROR_MESSAGE);
    }
        return con;
}
}