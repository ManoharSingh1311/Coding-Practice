package DesignPatterns2.ObserverPattern.Observer;

import DesignPatterns2.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
   String userName;
   StocksObservable observable;
   public MobileAlertObserver(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
   }
   @Override
   public void update(){
    sendMsgOnMobile(userName, "Product is in stock, hurry up!");
   }
   public void sendMsgOnMobile(String userName, String ms){
    System.out.println("Message sen to "+ userName);
   }
}
