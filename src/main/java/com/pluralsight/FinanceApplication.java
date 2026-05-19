package com.pluralsight;

import com.pluralsight.assets.Valuable;
import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 123, 12500);
        Valuable account2 = new BankAccount("Gary", 456, 1500);

        account1.deposit(100);
        // no deposit method in Valuable aswell as account number requires a string
        account2.deposit(100);
    }
}
