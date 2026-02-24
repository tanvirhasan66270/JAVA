package bankBalance;

public class ChackBalanceHW {

    private double balance;
    private double withdraw;
    private double deposit;
    private double  mainBalance;

    public ChackBalanceHW() {
    }

    public ChackBalanceHW(double balance, double withdraw, double deposit) {
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdraw() {
        return balance = balance - withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw; 
        System.out.println("Withdraw Balance: "+withdraw);

    }

    public double getDeposit() {
        return balance=balance+deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        System.out.println("Deposit Balance: "+deposit);
    }

    public double getMainBalance() {
        return mainBalance=balance;
    }

    public void setMainBalance(double mainBalance) {
        this.mainBalance = mainBalance;
    }
    

}
