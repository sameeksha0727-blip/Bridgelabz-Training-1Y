package com.gla.HierarchicalInheritance;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accNo, double balance, double withdrawalLimit) {
        super(accNo, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;

    public FixedDepositAccount(String accNo, double balance, int tenure) {
        super(accNo, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Tenure: " + tenure + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("S101", 50000, 6.5);
        CheckingAccount c = new CheckingAccount("C101", 40000, 20000);
        FixedDepositAccount f = new FixedDepositAccount("F101", 100000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
