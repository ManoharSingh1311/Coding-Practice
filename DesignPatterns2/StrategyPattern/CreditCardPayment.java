package DesignPatterns2.StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(long amountInRupees){
        System.out.println("Paid :"+ amountInRupees+" via credit card");
    }
}
