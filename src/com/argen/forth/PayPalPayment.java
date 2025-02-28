package com.argen.forth;

public class PayPalPayment implements CardPayment {
    @Override
    public void payWithCard(double amount) {
        System.out.println("Paying with PayPal card: $" + amount);
    }

    // Этот метод не обязателен, но добавлен для полноты
    public void payWithBankTransfer(double amount) {
        throw new UnsupportedOperationException("Bank transfer not supported in PayPal");
    }
}