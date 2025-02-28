package com.argen;

public class Main2 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount fixed = new FixedAccount(1000);
        BankAccount current = new CurrentAccount(1000);

        System.out.println("Savings interest: " + savings.calculateInterest());
        System.out.println("Fixed interest: " + fixed.calculateInterest());
        System.out.println("Current interest: " + current.calculateInterest());
    }
}
