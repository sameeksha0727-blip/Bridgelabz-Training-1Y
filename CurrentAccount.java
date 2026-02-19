package banking;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}

