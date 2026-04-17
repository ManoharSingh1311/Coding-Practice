# Strategy Pattern (Payment Example)

## What problem it solves
When one behavior has multiple algorithms (UPI, card, wallet, etc.), avoid `if-else` chains in one class.
Strategy pattern lets us choose behavior at runtime by plugging in different strategy objects.

## Mapping with your code
- **Strategy interface:** `PaymentStrategy`
- **Concrete strategies:** `UpiPayment`, `CreditCardPayment`
- **Context:** `CheckOutService`
- **Client:** `ShoppingService`

## How your flow works
1. `ShoppingService` creates `CheckOutService`.
2. It sets strategy using `checkout.setPaymentStrategy(new UpiPayment())`.
3. `checkout.checkout(499_00L)` delegates to `paymentStrategy.pay(...)`.
4. Payment logic is executed by selected strategy class.

## Why this is good design
- No large conditional blocks for payment type.
- Easy to add new payment mode by creating a new strategy class.
- Context (`CheckOutService`) stays clean and focused on orchestration.

## Interview Script (Simple words, 60-90 sec)
"In my Strategy pattern example, checkout supports multiple payment methods.
Instead of putting all payment logic in one class with if-else, I created a common interface `PaymentStrategy`.
Each payment mode, like UPI or Credit Card, has its own class implementing that interface.
`CheckOutService` is the context that uses whichever strategy is set at runtime.
So behavior changes without modifying checkout code, which follows Open/Closed principle and makes testing easier."

## Run it
From project root:
`javac DesignPatterns2/StrategyPattern/*.java`

`java DesignPatterns2.StrategyPattern.ShoppingService`
