package Package2.Collections.BankingTransactionSystem;

public class Transaction {
    int txnId;
    int accountId;
    double amount;

    public Transaction(int txnId, int accountId, double amount) {
        this.txnId = txnId;
        this.accountId = accountId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TxnID: " + txnId + " | Acc: " + accountId + " | Amount: " + amount;
    }
}
