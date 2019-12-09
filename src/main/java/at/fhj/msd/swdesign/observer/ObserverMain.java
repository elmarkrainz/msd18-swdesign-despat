package at.fhj.msd.swdesign.observer;

public class ObserverMain {

    public static void main(String[] args) {


        ConcreteSubject subject = new ConcreteSubject();

        Observer anotherObserver = new AnotherObserver();
        Observer concreteObserver = new ConcreteObserver("name");


        subject.attach(anotherObserver);
        subject.attach(concreteObserver);
        subject.remove(concreteObserver);

        subject.someOperation();

    }
}















//   SomeObserverClass myObserverClass = new SomeObserverClass();
//   ConcreteObserver concreteObserver = new ConcreteObserver("Foo");

//     subject.attach(myObserverClass);
//    subject.attach(concreteObserver);
