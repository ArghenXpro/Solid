package com.argen;

abstract class BankAccount {
    protected String type;
    protected double balance;

    public BankAccount(String type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super("savings", balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% для сберегательного счёта
    }
}

class FixedAccount extends BankAccount {
    public FixedAccount(double balance) {
        super("fixed", balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.06; // 6% для фиксированного счёта
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super("current", balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // 1% для текущего счёта
    }
}

// Пример использования

