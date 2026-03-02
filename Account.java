public class Account {

    protected String accountNumber;
    protected double balance;
    static String bankName = "National Bank";

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0;
    }
}
