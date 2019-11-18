package at.fhj.msd.swdesign.observer;

public class ObserverMain {

    public static void main(String[] args) {


        Observer firstObserver = new ConcreteObserver("First");
        Observer secondObserver = new ConcreteObserver("Second");
        Observer thirdObserver = new ConcreteObserver("Third");


        Subject subject = new ConcreteSubject();

        subject.attach(firstObserver);
        subject.attach(thirdObserver);

        subject.notifyObservers();

    }
}
