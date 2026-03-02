package dao;

import Model.Catagory;
import Model.DaoService;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class DaoCatagoy implements DaoService<Catagory> {

    DbUtil util = new DbUtil();
    private PreparedStatement ps;
    private ResultSet rs;

    String sql = "";

    @Override
    public void save(Catagory e) {
        sql = "insert into tanvir(name)values(?)";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Catagory findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
