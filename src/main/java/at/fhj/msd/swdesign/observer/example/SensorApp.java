package at.fhj.msd.swdesign.observer.example;

public class SensorApp {

    public static void main(String[] args) {

        SensorSubject sensor = new SensorSubject();

        sensor.collectSensorData();
    }
}
