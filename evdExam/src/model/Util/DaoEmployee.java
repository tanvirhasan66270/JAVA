/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DaoEmployee {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        System.out.println(" Save Data : ");
        save("Badrul", 22000.0, "nata");
        save("Tanvir", 11000.0, "Student");
        showAll();
        System.out.println(" Update Data : ");
        update("Tanvir", 15000, "Cap", 2);
        showAll();
        System.out.println("Update Data: ");
        delete(2);
          showAll();

    }

    public static Connection getCon() {

        Connection con = null;
        String URL = "jdbc:mysql://localhost:3306/jeestore";
        String userName = "root";
        String pssaword = "1234";
        String drive = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(drive);
            con = DriverManager.getConnection(URL, userName, pssaword);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void save(String name, double salary, String desegnation) {

        String saveSql = "insert into employee1(name,salary,desegnation) values(?,?,?)";

        try {
            ps = getCon().prepareStatement(saveSql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, desegnation);

            int num = ps.executeUpdate();
            ps.close();
            if (num > 0) {
                System.out.println("Saved");
            } else {
                System.out.println(" not  Saved");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAll() {
        String showAll = "select * from employee1";

        try {
            ps = getCon().prepareStatement(showAll);

            rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id") + "  " + "Name: " + rs.getString("name") + " " + "Salary :" + rs.getDouble("salary") + " " + "Discription :" + rs.getString("desegnation"));

            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(String name, double salary, String desegnation, int id) {
        String updateSql = "update employee1 set name=?,salary=?,desegnation=? where id=? ";
        try {
            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, desegnation);
            ps.setInt(4, id);

            int num1 = ps.executeUpdate();
            ps.close();
            if (num1 > 0) {
                System.out.println("Update");
            } else {
                System.out.println(" Not  Update");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void delete(int id) {
        String deleteSql = "delete from employee1 where id=?";

        try {
            ps = getCon().prepareStatement(deleteSql);
            ps.setInt(1, id);

            int num2 = ps.executeUpdate();
            ps.close();
            if (num2 > 0) {
                System.out.println("Delete");
            } else {
                System.out.println(" Not  Delete");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
