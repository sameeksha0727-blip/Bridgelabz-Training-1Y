package Package2.Collections.BankingTransactionSystem;

public class Account {
    int accountId;

    public Account(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        return accountId == ((Account) o).accountId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(accountId);
    }
}
