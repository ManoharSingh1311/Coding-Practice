package DesignPatterns2.StrategyPattern;

public class ShoppingService {
    public static void main(String[] args) {
        CheckOutService checkout = new CheckOutService();
        checkout.setPaymentStrategy(new UpiPayment());
        checkout.checkout(499_00L); // e.g. rupees in paise
        }
}
