package at.fhj.msd.swdesign.observer.example;


import java.util.ArrayList;
import java.util.List;

public class SensorSubject implements ISensorSubject {

    private List<SensorListener> listeners;

    public SensorSubject() {
        listeners = new ArrayList<>();
    }


    public void collectSensorData() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(" -- start Sensor");
                int i = 0;
                while (i < 5) {
                    i++;

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    notifyObservers();
                }

                System.out.println(" -- stop sensor");
            }

        });
        thread.start();

    }


    @Override
    public void attach(SensorListener listener) {
        listeners.add(listener);
    }

    @Override
    public void remove(SensorListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyObservers() {
        for (SensorListener l : listeners) {
            l.sensorDataChanged();
        }
    }
}
