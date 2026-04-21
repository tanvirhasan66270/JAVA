/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evdexam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Admin
 */
public class EvdExam {
    
    static PreparedStatement ps;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       // saveTeachir("Emon", "BBA", "2028-04-12", 3000.0);
       // saveTeachir("Mahbub", "BA", "2024-04-12", 60000.0);
        showAll();
        System.out.println("-------------------------------------");
        UpdateTeachir("Emran", "Sir", "2027-04-12", 12000.0, 6);
        showAll();
                System.out.println("-------------------------------------");

        delete(6);
        showAll();
    }
    
    public static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jeestore";
        String userName = "root";
        String password = "1234";
        String drive = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(drive);
            con = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EvdExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void saveTeachir(String employeeName, String designation, String joiningDate, double salary) {
        
        String saveSql = "insert into employee(employeeName,designation,joiningDate,salary) values(?,?,?,?)";
        
        try {
            ps = getCon().prepareStatement(saveSql);
            
            ps.setString(1, employeeName);
            ps.setString(2, designation);
            ps.setDate(3, Date.valueOf(joiningDate));
            ps.setDouble(4, salary);
            
            int sou = ps.executeUpdate();
            ps.close();
            getCon().close();
            if (sou > 0) {
                System.out.println("Save");
            } else {
                System.out.println("Not Save");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EvdExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showAll() {
        String showSql = "select * from employee";
        
        try {
            ps = getCon().prepareStatement(showSql);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                System.out.println("Name: " + rs.getInt("id") + " " + " Emolpyee Name: " + rs.getString("employeeName") + " " + " Qualification: "+rs.getString("designation")+" Joining Date: " + rs.getString("joiningDate") + " " + " Salary :" + rs.getDouble("salary"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EvdExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void UpdateTeachir(String employeeName, String designation, String joiningDate, double salary, int id) {
        
        String saveSql = "update employee set employeeName=?,designation=?,joiningDate=?,salary=? where id=?";
        
        try {
            ps = getCon().prepareStatement(saveSql);
            
            ps.setString(1, employeeName);
            ps.setString(2, designation);
            ps.setDate(3, Date.valueOf(joiningDate));
            ps.setDouble(4, salary);
            ps.setInt(5, id);
            
            int sou = ps.executeUpdate();
            ps.close();
            getCon().close();
            if (sou > 0) {
                System.out.println("Update Successfully");
            } else {
                System.out.println("NUpdate not Successfully");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EvdExam.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public static void delete(int id) {
        String deleteSql="delete from employee  where id=?";
        
        try {
            ps = getCon().prepareStatement(deleteSql);
            
            ps.setInt(1, id);
            
            int sou = ps.executeUpdate();
            ps.close();
            getCon().close();
            if (sou > 0) {
                System.out.println("Delete Successfull");
            } else {
                System.out.println("Delete not Successfull");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EvdExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
