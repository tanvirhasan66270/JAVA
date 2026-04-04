
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dell
 */
public class DbUtil {

    private Connection con = null;
    private final String url = "jdbc:mysql://localhost:3306/jeetanvir?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String userName="root";
    private final String password = "1234";
    private final String drive = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(drive);
            con =DriverManager.getConnection(url,userName , password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
