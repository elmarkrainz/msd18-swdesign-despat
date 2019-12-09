package at.fhj.msd.swdesign.observer.example;

public class SensorApp {

    public static void main(String[] args) {

        SensorListener sensorListener = new SensorLogger();


        SensorSubject sensor = new SensorSubject();

        sensor.attach(sensorListener);

        sensor.collectSensorData();
    }
}
