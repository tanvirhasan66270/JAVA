
package Extra;

import java.util.Scanner;


public class NgPg {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
           System.out.println("Input Number:");
        int input=s.nextInt();
        int sum=0;
        
        while(input>=0){
        sum=sum+input;
            System.out.println("Input Number:");
            input=s.nextInt();
        }System.out.println(sum);
    }
    
}
