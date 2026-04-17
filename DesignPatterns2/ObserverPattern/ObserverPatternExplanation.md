# Observer Pattern (Stock Alert Example)

## What problem it solves
When one object changes state and many other objects need updates, we should avoid tight coupling.
Observer pattern creates a **one-to-many** relationship:
- One **subject** (observable) keeps state.
- Many **observers** subscribe for notifications.

## Mapping with your code
- **Subject interface:** `StocksObservable`
- **Concrete subject:** `IphoneObservableImpl`
- **Observer interface:** `NotificationAlertObserver`
- **Concrete observers:** `EmailAlertObserver`, `MobileAlertObserver`
- **Client:** `Store` (wires all objects)

## How your flow works
1. In `Store`, observers are created and added to `iPhoneStockObservable`.
2. Initially stock is `0`.
3. `setStockCount(19)` is called.
4. In `IphoneObservableImpl`, if stock moved from `0` to `>0`, it calls `notifySubscribers()`.
5. Each observer receives `update()` and sends email/mobile alert.

## Why this is good design
- Subject does not know concrete observer types.
- New observer type can be added without changing subject code.
- Great for event-driven features like alerts, notifications, listeners.

## Interview Script (Simple words, 60-90 sec)
"In my Observer pattern example, I modeled iPhone stock alerts.
`IphoneObservableImpl` is the publisher, and users are subscribers.
When stock is out, nobody is notified. As soon as stock becomes available, the publisher notifies all registered observers.
Observers can be email or mobile, and each has its own update behavior.
This keeps code loosely coupled because the stock class only talks to the observer interface, not concrete classes.
So if tomorrow I add WhatsApp or push notification observer, I just add a new class and register it."

## Run it
From project root:
`javac DesignPatterns2/ObserverPattern/Observable/*.java DesignPatterns2/ObserverPattern/Observer/*.java DesignPatterns2/ObserverPattern/Store.java`

`java DesignPatterns2.ObserverPattern.Store`
