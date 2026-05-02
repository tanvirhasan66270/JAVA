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

    public void save(Emp s) {

        sql = "insert into emp (name,getCustom1,getCustom2,getCustom3,getCustom4,getCustom5)values(?,?,?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCustom1());
            ps.setString(3, s.getCustom2());
            ps.setString(4, s.getCustom3());
            ps.setString(5, s.getCustom4());
            ps.setString(6, s.getCustom5());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Emp> findAll() {

        List<Emp> list = new ArrayList<>();

        sql = "select * from emp";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Emp e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("getCustom1"),
                        rs.getString("getCustom2"),
                        rs.getString("getCustom3"),
                        rs.getString("getCustom4"),
                        rs.getString("getCustom5")
                );

                list.add(e);
            }
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
 public Emp getById(int id) {
        Emp e = null;
        sql = "select * from emp where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                  e = new Emp(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("getCustom1"),
                        rs.getString("getCustom2"),
                        rs.getString("getCustom3"),
                        rs.getString("getCustom4"),
                        rs.getString("getCustom5")
                );
            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
 
  public void delete(int id) {
        sql = "delete from emp where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
  public void update(Emp s) {

        sql = "update emp set name=?,getCustom1=?,getCustom2=?,getCustom3=?,getCustom4=?,getCustom5=?  where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCustom1());
            ps.setString(3, s.getCustom2());
            ps.setString(4, s.getCustom3());
            ps.setString(5, s.getCustom4());
            ps.setString(6, s.getCustom5());
            ps.setInt(6, s.getId());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
