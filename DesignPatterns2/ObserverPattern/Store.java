package DesignPatterns2.ObserverPattern;

import DesignPatterns2.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns2.ObserverPattern.Observable.StocksObservable;
import DesignPatterns2.ObserverPattern.Observer.EmailAlertObserver;
import DesignPatterns2.ObserverPattern.Observer.MobileAlertObserver;
import DesignPatterns2.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iPhoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver ob1 = new EmailAlertObserver(iPhoneStockObservable, "xyz1@gmail.com");
        NotificationAlertObserver ob2 = new EmailAlertObserver(iPhoneStockObservable, "xyz2@gmail.com");
        NotificationAlertObserver ob3 = new MobileAlertObserver(iPhoneStockObservable, "+1-555-xyz3");

        iPhoneStockObservable.add(ob1);
        iPhoneStockObservable.add(ob2);
        iPhoneStockObservable.add(ob3);
        iPhoneStockObservable.setStockCount(19);
    }
}