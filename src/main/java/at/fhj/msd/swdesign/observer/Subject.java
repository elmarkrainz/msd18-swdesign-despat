package at.fhj.msd.swdesign.observer;

public interface Subject {

    void attach(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
