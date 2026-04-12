package DesignPatterns2.ObserverPattern.Observable;

import DesignPatterns2.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
public class IphoneObservableImpl implements StocksObservable {

    private List<NotificationAlertObserver> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded){
        boolean wasOutOfStock = (stockCount == 0);

        stockCount += newStockAdded;

        if(wasOutOfStock && stockCount > 0){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}