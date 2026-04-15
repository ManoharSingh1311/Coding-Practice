package DesignPatterns2.StrategyPattern;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(long amountInPaise) {
        System.out.println("Paid " + amountInPaise + " via UPI");
    }
}