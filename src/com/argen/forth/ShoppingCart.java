package com.argen.forth;
public class ShoppingCart {
    private CardPayment payment;

    public ShoppingCart(CardPayment payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        payment.payWithCard(amount);
    }
}