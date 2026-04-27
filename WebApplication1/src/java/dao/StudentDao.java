/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.StudentDao.ps;
import static dao.StudentDao.rs;
import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DbUtil;

/**
 *
 * @author Dell
 */
public class StudentDao {

    static DbUtil util = new DbUtil();

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(Student s) {
        int status = 0;
        sql = "INSERT INTO student ( name, email, fee) VALUES ( ?, ?, ?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDouble(3, s.getFee());
            status = ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public static List<Student> findAll() {
        List<Student> List = new ArrayList<>();

        sql = "select * from student";

        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("fee"));
                List.add(s);
            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return List;
    }

    public static void delete(int id) {
        sql = "delete from student where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void update(Student s) {

        sql = "update student set  name=?, email=?, fee=? where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDouble(3, s.getFee());
            ps.setInt(4, s.getId());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public static Student getById(int id) {
        Student s = null;

        sql = "select * from student where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("fee")
                );
            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;

    }

}
