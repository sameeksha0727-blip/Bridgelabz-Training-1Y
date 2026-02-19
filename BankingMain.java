package banking;

import java.util.*;

public class BankingMain {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Suhani", 20000));
        accounts.add(new CurrentAccount(102, "Rahul", 15000));

        for (BankAccount acc : accounts) {
            System.out.println("Interest: " + acc.calculateInterest());
        }
    }
}

