/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

/**
  * @author Admin
 */
public class StudentDao {
   static DbUtil db=new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    
    public static int save(Student s) {
        sql="insert into student(name,email,fee) values(?,?,?)";
        
       try {
           ps=db.getCon().prepareStatement(sql);
       } catch (SQLException ex) {
           Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
}
