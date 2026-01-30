package com.mycompany.username;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input username: ");
        String username = input.nextLine();

        if (username .equals("tanvir")) {
            System.out.println("input password: ");
           String password = input.nextLine();
            if (password .equals("123456")) {
                System.out.println("Welcome  Tanvir");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("Incorrect userName");
        }
    }
}
