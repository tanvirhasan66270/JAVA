package bankBalance;

public class BankBalance {

    public static void main(String[] args) {
        ChackBalanceHW C = new ChackBalanceHW();

        C.setBalance(50000);
        System.out.println("first Balance:" + C.getBalance());
        C.setDeposit(6000);
        System.out.println("After Deposit: " + C.getDeposit());
        C.setWithdraw(5000);
        System.out.println("After Withdraw:" + C.getWithdraw());
        System.out.println("Remaining Balance: " + C.getMainBalance());

    }

}
