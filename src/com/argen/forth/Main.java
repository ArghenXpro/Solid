package com.argen.forth;

public class Main {
    public static void main(String[] args) {
        CardPayment paypal = new PayPalPayment();
        ShoppingCart cart = new ShoppingCart(paypal);
        cart.checkout(100.0); // Вывод: Paying with PayPal card: $100.0

    }
}