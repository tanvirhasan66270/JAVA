package dao;


import Service.DaoService;
import Model.Employee;
import Util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DaoEmployee implements DaoService<Employee> {

    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;

    public String sql;

    @Override
    public void save(Employee e) {
        sql = "insert into employee(name,salary,email) values(?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());

            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showMessageDialog(null, "Massage Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Massage Not Saved");

            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();
        sql = "select*from employee";
        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getString("email")
                );
                list.add(e);

            }
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(Employee e) {
        sql = "update employee set name=?,salary=?,email=? where id=?";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setInt(4, e.getId());
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(3, e.getEmail());

            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            JOptionPane.showMessageDialog(null, "Information Update ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Information Not Update ");

            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(int id) {
        try {
            sql = "delete from employee where id=?";

            ps = util.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Information delete ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Information not delete ");
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @Override
    public Employee findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
