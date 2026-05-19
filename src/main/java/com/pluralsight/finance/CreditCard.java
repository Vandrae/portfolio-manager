package com.pluralsight.finance;

import com.pluralsight.assets.Valuable;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    @Override
    public double getValue() {
        return 0;
    }

    //constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
