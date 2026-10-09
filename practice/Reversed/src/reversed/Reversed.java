/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversed;

import java.util.Scanner;


public class Reversed {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      
//        int input=s.nextInt();
////        int number=122;
////        int save=number;
//        
//        for(int i=0;i<input;i++){
//           
//            int number=s.nextInt();
//            int save=number;
//            int reserve=0;
//            
//            while(number>0){
//            
//            int devien=number % 10;
//            
//            reserve=reserve * 10 + devien;
//            
//            number=number/10;
//            
//            }if( save == reserve){System.out.println("Its number true");}
//            else{System.out.println("Not true");}
//            
//            
//        }s.close();


//   while(s.hasNext()){
   
 int n=s.nextInt();
 int save=n;
 
 int re=0;
 
 while(n != 0){
     int devin=n%10;
     
     re=re*10+devin;
     
    n=n/10;
 }System.out.println(re);
   
   s.close();
   }
    }
 
//}
