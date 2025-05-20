package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private int accountNumber;
    private double balance;

    public CreditCard(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge (double amount){
        balance += amount;
    }
    public void pay (double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}
