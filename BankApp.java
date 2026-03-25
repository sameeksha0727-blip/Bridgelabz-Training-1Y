package Q10;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
