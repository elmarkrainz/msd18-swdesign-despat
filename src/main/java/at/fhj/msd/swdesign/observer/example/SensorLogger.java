package at.fhj.msd.swdesign.observer.example;

import at.fhj.msd.swdesign.observer.SomeObserverClass;

public class SensorLogger implements SensorListener {

    // some fields & Methods


    @Override
    public void sensorDataChanged() {

        System.out.println(".. got some data");
    }
}
