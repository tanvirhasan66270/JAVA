package pos;

import java.util.Scanner;
import pos.dao.UserDao;
import pos.model.User;

public class POS {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input Name: ");
        String name1 = s.nextLine();

        System.out.println("Input Password: ");
        String password1 = s.nextLine();

        System.out.println("Input number: ");
        String number1 = s.nextLine();

        for (int i = 1; i <= 2; i++) {

            User u = new User(name1, password1, number1);
            System.out.println("Input Name: ");
            name1 = s.nextLine();
            System.out.println("Input Password: ");
            password1 = s.nextLine();
            System.out.println("Input number: ");
            number1 = s.nextLine();

            UserDao dao = new UserDao();
            dao.saveUser(u);
            
        }
    }

}
