package Package2.Collections.BankingTransactionSystem;

public class MainBank {
    public static void main(String[] args) {

        BankSystem bank = new BankSystem();

        bank.addAccount(new Account(101));
        bank.addAccount(new Account(102));

        bank.addTransaction(new Transaction(1, 101, 500));
        bank.addTransaction(new Transaction(2, 999, 300));
        bank.addTransaction(new Transaction(3, 102, 700));

        bank.processTransactions();
        bank.showAllTransactions();

        bank.rollback();
        bank.showAllTransactions();
    }
}
