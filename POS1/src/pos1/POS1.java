/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos1;

import pos.dao.UserDao;
import pos.model.User;


public class POS1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        User u=new User("Badrul","1234");
        UserDao dao=new UserDao();
        dao.saveUser(u);
    }
    
}
