package at.fhj.msd.swdesign.observer;

public class ObserverMain {

    public static void main(String[] args) {



        MyObserverClass myObserverClass = new MyObserverClass();
        ConcreteObserver concreteObserver = new ConcreteObserver("Foo");


        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(myObserverClass);
        subject.attach(concreteObserver);





        subject.foo();



    }
}
