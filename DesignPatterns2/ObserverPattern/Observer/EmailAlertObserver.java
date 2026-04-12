package DesignPatterns2.ObserverPattern.Observer;

import DesignPatterns2.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
   String emailId;
   StocksObservable observable;
   public void EmailAlertObserver(String emailId, StocksObservable observable){
    this.emailId = emailId;
    this.observable = observable;
   }
   @Override
   public void update(){
        sendMail(emailId, "product is in stock, hurry up!");
   }
   public void sendMail(String emailId, String msg){
        System.out.println("mail sent to "+ emailId);
   }
}
