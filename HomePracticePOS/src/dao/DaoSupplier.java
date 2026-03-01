/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.DaoService;
import Model.Supplier;
import Util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Dell
 */
public class DaoSupplier implements DaoService<Supplier> {
    DbUtil util=new DbUtil();
    private PreparedStatement ps;
    private ResultSet rs;
    
    String sql;

    @Override
    public void save(Supplier e) {
     sql="insert into supplier(supplierName,supplierCell,contactParson,contactParsonCell,Address) values(?,?,?,?,?)";
     
        try {
            ps=util.getCon().prepareStatement(sql);
             ps.setString(1, e.getName());
             ps.setString(2, e.getCell());
             ps.setString(3, e.getContactParsonName());
             ps.setString(4, e.getContactParsonCell());
             ps.setString(5, e.getAddress());
             ps.executeUpdate();
             ps.close();
             util.getCon().close();
             
             JOptionPane.showMessageDialog(null, "Object Saved");
        } catch (SQLException ex){
                         JOptionPane.showMessageDialog(null, "Object not Saved");

            Logger.getLogger(DaoSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    @Override
    public List<Supplier> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Supplier findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   
}
