package com.mycompany.account;

public class Account {

    public static void main(String[] args) {
           AccountDetails b=new AccountDetails();
          b.setDeposit(500);

          
          b.deposit();
           System.out.println("Ballance: "+b.getBalance());
           
           
           b.setWidrow(200);
           b.withdrow();
           System.out.println("Ballance than withdrow: "+b.getBalance());
            
            
            
    }
}
