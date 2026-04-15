package DesignPatterns2.ObserverPattern.Observer;

import DesignPatterns2.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
   String userName;
   StocksObservable observable;
   public MobileAlertObserver(StocksObservable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }
   @Override
   public void update(){
    sendMsgOnMobile("Manohar", "Product is in stock, hurry up!");
   }
   public void sendMsgOnMobile(String userName, String ms){
    System.out.println("Message sent to "+ userName);
   }
}
