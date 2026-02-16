package com.gla.accessmodifier;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    void display() {
        System.out.println("Account No: " + accountNumber); // public
        System.out.println("Holder: " + accountHolder);     // protected
        System.out.println("Balance: " + getBalance());     // private via getter
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("ACC123", "Suhani", 10000);
        s.deposit(2000);
        s.display();
    }
}

