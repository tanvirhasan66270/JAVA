/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution {



  public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
                    
                       
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            for(int j=0;j<n;j++){
                
                a = a+b;
               
                 System.out.println(a);
                  b = b*2;
                
            }
        }
        in.close();
    }
}
        
        


