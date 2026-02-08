package com.mycompany.account;

public class AccountDetails {

    private double accNo;

    private double balance;

    private double deposit;

    private double widrow;

    public double getAccNo() {
        return accNo;
    }

    public void setAccNo(double accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWidrow() {
        return widrow;
    }

    public void setWidrow(double widrow) {
        this.widrow = widrow;
    }
    
     public double deposit() {
     balance += deposit;
     return balance;
     }

    public double withdrow() {

        if (balance >= widrow) {

            balance = balance - widrow;
        } else {
            System.out.println("Insufficient Ballance");
        }

        return balance;
    }

}
