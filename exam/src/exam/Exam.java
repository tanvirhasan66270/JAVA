/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exam {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        saveStudent("Badrul", "badrul@gmail.com", 1000);
        showAllData();
        //------------------------------------------------------------------
        Delete(4);
        showAllData();

        Update("PK", "pk@gmail.com", 20000, 7);
        showAllData();

    }

    public static Connection getConnaction() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/practice";
        String userName = "root";
        String password = "1234";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void saveStudent(String name, String email, float fee) {
        String sqlSave = "insert into student (name,email,fee) values(?,?,?)";

        try {
            ps = getConnaction().prepareStatement(sqlSave);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            int status = ps.executeUpdate();
            ps.close();

            if (status > 0) {

                System.out.println("Data save");
            } else {
                System.err.println("Data not save");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllData() {
        String showAll = "select * from student";

        try {
            ps = getConnaction().prepareStatement(showAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name")
                        + " " + rs.getString("email") + " " + rs.getFloat("fee"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Delete(int id) {
        String deleteSql = "delete from student where id=?";

        try {
            ps = getConnaction().prepareStatement(deleteSql);

            ps.setInt(1, id);
            int status1 = ps.executeUpdate();
            ps.close();

            if (status1 > 0) {

                System.out.println("Data delete");
            } else {
                System.err.println("Data not Delete");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Update(String name, String email, float fee, int id) {

        String updateSql = "update student set name=?,email=?,fee=? where id=?";

        try {
            ps = getConnaction().prepareStatement(updateSql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setInt(4, id);
            int status = ps.executeUpdate();
            ps.close();

            if (status > 0) {

                System.out.println("Data Update");
            } else {
                System.err.println("Data not Update");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
