package at.fhj.msd.swdesign.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {


    private  List<Observer> observers;


    public ConcreteSubject() {

        observers = new ArrayList<>();

    }

    public void someOperation() {

        System.out.println(" something is going on, and then all observers are notified");

        //       update all obbservers
        notifyObservers();

    }



    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        for (Observer o : observers) {
            o.update();
        }


    }
}
