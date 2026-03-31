/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.DaoService;
import Model.Product;
import Util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class DaoProduct implements DaoService<Product> {

    DbUtil util = new DbUtil();
    private PreparedStatement ps;
    private ResultSet rs;

    String sql = "";

    @Override
    public void save(Product e) {
        sql = "insert into product(id,name,price,quantity,supplierId,catagoryId) values (?,?,?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setDouble(2, e.getPrice());
            ps.setDouble(3, e.getQuantity());
            ps.setInt(4, e.getCatagoryId());
            ps.setInt(5, e.getSupplierId());

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Object Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Object not Saved");

            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        sql = "select*from product";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getDouble("quantity"),
                        rs.getInt("catagoryP"),
                        rs.getInt("supplierP")) {
                };

                list.add(p);
            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    @Override
    public void update(Product e) {
        sql = "update product from name=?,price=?,quantity=?,catagoryP=?,supplierP=? where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setDouble(2, e.getPrice());
            ps.setDouble(3, e.getQuantity());
            ps.setInt(4, e.getCatagoryId());
            ps.setInt(5, e.getSupplierId());
            ps.setInt(6, e.getId());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showInternalMessageDialog(null, "Input Update");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Input not Update");

            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        sql = "delete from product where id=? ";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showInternalMessageDialog(null, "Input delete");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Input not delete");

            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
