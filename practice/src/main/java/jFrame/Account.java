package jFrame;





public class Account {
    private double withdraw;
    private double deposit;
    private double MainBalance;

    public Account() {
    }

    public Account(double withdraw, double deposit, double balance) {
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.MainBalance = balance;
    }

    public double getWithdraw() {
        return MainBalance=MainBalance-withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return MainBalance+=deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return MainBalance;
    }

    public void setBalance(double balance) {
        this.MainBalance = balance;
    }
    
    
    
}
