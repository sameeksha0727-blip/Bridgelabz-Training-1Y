public class CurrentAccount extends Account {

    public CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }
}
