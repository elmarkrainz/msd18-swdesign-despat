package at.fhj.msd.swdesign.observer;

public class ObserverMain {

    public static void main(String[] args) {



        SomeObserverClass myObserverClass = new SomeObserverClass();
        ConcreteObserver concreteObserver = new ConcreteObserver("Foo");


        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(myObserverClass);
        subject.attach(concreteObserver);





        subject.someOperation();



    }
}
