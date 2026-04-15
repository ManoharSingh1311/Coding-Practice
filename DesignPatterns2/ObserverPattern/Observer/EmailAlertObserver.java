package DesignPatterns2.ObserverPattern.Observer;

import DesignPatterns2.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private final String emailId;
    private final StocksObservable observable;

    public EmailAlertObserver(StocksObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock, hurry up! Units: " + observable.getStockCount());
    }

    public void sendMail(String emailId, String msg) {
        System.out.println("mail sent to " + emailId + " — " + msg);
    }
}