package at.fhj.msd.swdesign.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList;

    public ConcreteSubject (){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer o: observerList) {
            o.update();
        }

    }
}
