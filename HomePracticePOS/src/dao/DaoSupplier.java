/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Service.DaoService;
import Model.Supplier;
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
public class DaoSupplier implements DaoService<Supplier> {

    DbUtil util = new DbUtil();
    private PreparedStatement ps;
    private ResultSet rs;

    String sql;

    @Override
    public void save(Supplier e) {
        sql = "insert into supplier(supplierName,supplierCell,contactParson,contactParsonCell,Address) values(?,?,?,?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getCell());
            ps.setString(3, e.getContactParsonName());
            ps.setString(4, e.getContactParsonCell());
            ps.setString(5, e.getAddress());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Object Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Object not Saved");

            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Supplier> findAll() {

        List<Supplier> list = new ArrayList<>();
        sql = "select*from supplier";

        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Supplier s = new Supplier(
                        rs.getInt("id"),
                        rs.getString("supplierName"),
                        rs.getString("supplierCell"),
                        rs.getString("contactParson"),
                        rs.getString("contactParsonCell"),
                        rs.getString("Address")
                );
                list.add(s);

            }
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(Supplier e) {
        sql = "update supplier set supplierName=?,supplierCell=?,contactParson=?,contactParsonCell=?,Address=? where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getCell());
            ps.setString(3, e.getContactParsonName());
            ps.setString(4, e.getContactParsonCell());
            ps.setString(5, e.getAddress());
            ps.setInt(6, e.getId());
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showInternalMessageDialog(null, "Input Update");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Input not Update");
            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Supplier findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        sql = "delete from supplier where id=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showMessageDialog(null, "supplier Delete");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "supplier not Delete");

            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String> getAllSupplierName() {
        List<String> list = new ArrayList<>();
        sql = "select * from supplier";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("supplierName"));
            }
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    
    public  int getIdByNameSupplier(String supplierName){
    sql="select id from supplier where supplierName=?";
    
    int id=0;
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, supplierName);
            rs=ps.executeQuery();
            while(rs.next()){
            
                id=rs.getInt("id");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    
    }
}
