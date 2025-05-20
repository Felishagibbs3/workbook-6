package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw (double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
