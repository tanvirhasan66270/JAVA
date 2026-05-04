/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Emp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import util.DbUtil;

/**
 *
 * @author Admin
 */
public class EmpDao {

    static DbUtil util = new DbUtil();

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(Emp e) {
        int status = 0;
        sql = "insert into emp(name,salary,date,email,subject) values(?,?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getSalary());
            ps.setString(3, e.getDate());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getSubject());

            status = ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;

    }

    public static List<Emp> getAll() {
        List<Emp> list = new ArrayList<>();
        sql = "select * from emp";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Emp e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("salary"),
                        rs.getString("date"),
                        rs.getString("email"),
                        rs.getString("subject")
                );
                list.add(e);
            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    public static Emp getById(int id) {
        Emp e = null;
        sql = "select * from emp where id =?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("salary"),
                        rs.getString("date"),
                        rs.getString("email"),
                        rs.getString("subject")
                );

            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    public static int update(Emp e) {
        int status = 0;
        sql = "update emp set name = ?,salary=?,date=?,email=?,subject=? where id=? ";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getSalary());
            ps.setString(3, e.getDate());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getSubject());
            ps.setInt(6, e.getId());

            status = ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;

    }

    public static int delete(int id) {
        int status = 0;
        sql = "delete from emp where id =?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;

    }

}
