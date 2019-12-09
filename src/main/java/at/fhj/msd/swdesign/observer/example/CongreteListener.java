package at.fhj.msd.swdesign.observer.example;

public class CongreteListener implements SensorListener{
    @Override
    public void sensorDataChanged() {
        System.out.println("got Sensor infos");
    }
}
