package dao;

import Model.Catagory;
import Model.DaoService;
import Model.Product;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoCatagoy implements DaoService<Catagory> {

    DbUtil util = new DbUtil();
    private PreparedStatement ps;
    private ResultSet rs;

    String sql = "";

    @Override
    public void save(Catagory e) {
        sql = "insert into catagory(name)values(?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Object Saved");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Object not Saved");
            Logger.getLogger(DaoCatagoy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Catagory> findAll() {
        List<Catagory> list = new ArrayList<>();

        sql = "select * from catagory";

        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Catagory c = new Catagory(
                        rs.getInt("id"),
                        rs.getString("name")
                );
                list.add(c);
            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCatagoy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(Catagory e) {
        sql = "update catagory set name=? where id=?";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setInt(2, e.getId());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showInternalMessageDialog(null, "Input Update");

        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Input Update");

            Logger.getLogger(DaoCatagoy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Catagory findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        sql = "delete from catagory where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showMessageDialog(null, "Information delete ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Information not delete ");
            Logger.getLogger(DaoCatagoy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<String> getAllCatagoryName() {
        List<String> list;
        list = new ArrayList<>();
        sql = "select*from catagory";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public int getIdByNameCatagory(String CatagoryName) {

        sql = "select id from catagory where name=?";

        int id = 0;

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, CatagoryName);
            rs = ps.executeQuery();

            while (rs.next()) {

                id = rs.getInt("id");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCatagoy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    public void save(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
