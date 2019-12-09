package at.fhj.msd.swdesign.observer.example;

public class SensorApp {

    public static void main(String[] args) {

        SensorSubject sensor = new SensorSubject();

        SensorLogger logger = new SensorLogger();

        sensor.attach(logger);

        sensor.collectSensorData();
    }
}
