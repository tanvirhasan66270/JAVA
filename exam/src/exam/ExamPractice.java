/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamPractice {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

    }

    public static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/practice1";
        String userName = "root";
        String password = "1234";
        String drive = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(drive);
            con = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void saveEmployee(String name, String email, double salary) {

        String saveSql = "insert into employee(name,email,salary) values(?,?,?)";

        try {
            ps = getCon().prepareStatement(saveSql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, (float) salary);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ExamPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
