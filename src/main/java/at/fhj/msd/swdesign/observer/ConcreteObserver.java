package at.fhj.msd.swdesign.observer;

public class ConcreteObserver implements Observer {

    private  String observerName;

    public  ConcreteObserver(String name){
        observerName= name;
    }

    @Override
    public void update() {
        System.out.println(".. Observer: "+ observerName +" was notified");
    }
}
