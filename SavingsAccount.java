public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}
