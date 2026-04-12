package DesignPatterns2.ObserverPattern.Observer;

import DesignPatterns2.ObserverPattern.Observable.StocksObservable;

/**
 * Observer interface (the "Subscriber" side of Observer pattern).
 * <p>
 * Interview angle: The subject ({@link StocksObservable}) does not know concrete classes like
 * {@link EmailAlertObserver}—only this interface. New notification channels = new implementors,
 * without changing the observable code (Open/Closed Principle).
 * <p>
 * We pass the {@link StocksObservable} into {@code update} so each observer can <em>pull</em>
 * whatever state it needs (e.g. {@link StocksObservable#getStockCount()}). Alternative is
 * <em>push</em>, where the subject passes values directly into {@code update(int stock, ...)}.
 */
public interface NotificationAlertObserver {

    /**
     * Called by the subject when something interesting happens (here: stock went from 0 to &gt; 0).
     *
     * @param observable the subject that changed; observers read current state from it (pull model)
     */
    void update(StocksObservable observable);
}