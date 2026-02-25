/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.model.User;
import pos.util.DbUtil;

/**
 *
 * @author Dell
 */
public class UserDao {
    DbUtil util=new DbUtil();
    PreparedStatement ps;
    Resultset rs;
    
    
    
    String sql="";
    
    
    public void saveUser(User user){
   
        sql="insert into user(userName,password,phoneNumber) values(?,?,?)";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getPhoneNumber());
           
            ps.executeUpdate();
            ps.close();
           
            util.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
 
}
}
