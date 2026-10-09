package test_project;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Test_Project {
//
//    public static void main(String[] args) {
//
//       Scanner s=new Scanner(System.in);
//        System.out.println("Input Number: ");
//        
//        int input=s.nextInt();
//        int count=0;
//        
//        int sum=0;
//        for(int i=1;i< input;i++){
//        
//        if(input % i ==0){
//        count++;
//        }
//        }if(count==2){
//            System.out.println(input+"it's Prime Number");
//        }
//        else{System.out.println("Not prime Number");}
//
//    }
    
    

//    public static void main(String[] args) {
//        
//        Scanner s=new Scanner(System.in);
//        System.out.println("Input size: ");
//        
//        int el=s.nextInt();
//        int array[]=new int[el];
//        
//        for(int i=0;i<el;i++){
//            System.out.println((i+1)+" Number: ");
//            array[i]=s.nextInt();
//        
//        }
//        
//        
//        
////     double array[]={54,6,8,78,26,3,6.94,99};
//     
//     double max=array[0];
//     double min=array[0];
//     
//        for (double number : array) {
//           if (number >= max){
//            max=number;}
//            
//        }
//        for (double d : array) {
//            if(min>= d){
//            min=d;
//            }
//            
//        }   System.out.println(max);
//        System.out.println(min);
//     
//    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Input Number:");
        
        int number=s.nextInt();
        
        int count=0;
        
        for(int i=1;i<number;i++){
        
        
            if(number % i==0){
            
               count++;
            }
            
        }if(number == 2){
                System.out.println("It Prime number");
            }else{System.out.println("Not");}
    }
}
