package at.fhj.msd.swdesign.observer;


public class SomeObserverClass implements Observer {

   // fields & methods

    @Override
    public void update() {
        System.out.println(" ich bin Observer, habe die Benachrichtigung bekommen..");
    }
}
