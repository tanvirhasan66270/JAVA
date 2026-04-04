/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Service.DaoService;
import Model.Sales;
import Util.DbUtil;
import Util.SalesUtil;
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
public class DaoSales implements DaoService<Sales> {

    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    SalesUtil su=new SalesUtil();

    @Override
    public void save(Sales e) {
        sql = "insert into sales (productName,unitPrice,quantity,totalPrice,discount,actualPrice) values (?,?,?,?,?,?)";

        double totalPrice=su.getTotalPrice(e.getUnitPrice(), e.getQuantity());
        double discountAmount=su.getDiscountAmount(totalPrice, e.getDiscount());
        double actualPrice=su.getTotalPrice(totalPrice, discountAmount);
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getProductName());
            ps.setDouble(2, e.getUnitPrice());
            ps.setDouble(3, e.getQuantity());
            ps.setDouble(4, totalPrice);
            ps.setDouble(5, e.getDiscount());
            ps.setDouble(6, actualPrice);

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Sales Done");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sales Done");
            Logger.getLogger(DaoSales.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Sales> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Sales e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Sales findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
