package com.data;

class BankAccount {
    private String accountHolder;
    private double balance;

    // Static variables
    static int totalAccounts = 0;
    static double totalBalance = 0;

    // Constructor to create a new account
    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;

        // Update static variables
        totalAccounts++;
        totalBalance += initialDeposit;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        totalBalance += amount;  // Update total balance for all accounts
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Static method to display total accounts and balance
    public static void displayBankSummary() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Balance in Bank: $" + totalBalance);
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 1500);
        BankAccount acc3 = new BankAccount("Charlie", 2000);

        // Display account details
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        acc3.displayAccountInfo();

        // Display bank summary (static method call)
        BankAccount.displayBankSummary();

        // Alice deposits more money
        acc1.deposit(500);

        // Display updated bank summary
        BankAccount.displayBankSummary();
    }
}

