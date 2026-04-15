package DesignPatterns2.StrategyPattern;

/** Context: uses a strategy; does not branch on payment type. */
public class CheckOutService 
{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(long amountInPaise) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment method selected");
        }
        paymentStrategy.pay(amountInPaise);
    }
}