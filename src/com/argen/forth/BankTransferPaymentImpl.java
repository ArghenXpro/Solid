package com.argen.forth;

public class BankTransferPaymentImpl implements BankTransferPayment {
    @Override
    public void payWithBankTransfer(double amount) {
        System.out.println("Paying with Bank Transfer: $" + amount);
    }
}
