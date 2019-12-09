package at.fhj.msd.swdesign.observer.example;

public class SensorLogger implements SensorListener {
    @Override
    public void sensorDataChanged() {
        System.out.println("log sensor date to file");
    }
}
