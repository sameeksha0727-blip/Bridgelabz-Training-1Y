package Package2.Collections.BankingTransactionSystem;

import java.util.*;

public class BankSystem {

    List<Transaction> allTransactions = new ArrayList<>();
    Queue<Transaction> pendingQueue = new LinkedList<>();
    Set<Account> validAccounts = new HashSet<>();
    Stack<Transaction> rollbackStack = new Stack<>();

    public void addAccount(Account acc) {
        validAccounts.add(acc);
    }

    public void addTransaction(Transaction t) {
        pendingQueue.add(t);
    }

    public void processTransactions() {
        System.out.println("\nProcessing Transactions:");

        while (!pendingQueue.isEmpty()) {
            Transaction t = pendingQueue.poll();

            Account temp = new Account(t.accountId);

            if (validAccounts.contains(temp)) {
                allTransactions.add(t);
                rollbackStack.push(t);
                System.out.println("Success: " + t);
            } else {
                System.out.println("Invalid Account: " + t);
            }
        }
    }

    public void rollback() {
        if (!rollbackStack.isEmpty()) {
            Transaction t = rollbackStack.pop();
            allTransactions.remove(t);
            System.out.println("Rolled back: " + t);
        }
    }

    public void showAllTransactions() {
        System.out.println("\nAll Transactions:");
        for (Transaction t : allTransactions) {
            System.out.println(t);
        }
    }
}
