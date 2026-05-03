/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DbUtil {

    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/practice";
    private String userName = "root";
    private String password = "1234";
    private String drive = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(drive);
            con = DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }
}
