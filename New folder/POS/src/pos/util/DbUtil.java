package pos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DbUtil {
private Connection con=null;
private String url="jdbc:mysql://localhost:3306/jeestore?zeroDateTimeBehavior=CONVERT_TO_NULL";
private String username="root";
private String password="1234";
private String drive="com.mysql.cj.jdbc.Driver";

public Connection getCon(){

    try {
        Class.forName(drive);
        con=DriverManager.getConnection(url, url, password);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, "11", ex);
    } catch (SQLException ex) {
        Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, "12", ex);
    }
        
    return con;
}

  

}
