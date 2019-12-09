package at.fhj.msd.swdesign.observer.example;


import java.util.ArrayList;
import java.util.List;

public class SensorSubject {



    public SensorSubject() {

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

                }

                System.out.println(" -- stop sensor");
            }

        });
        thread.start();

    }





}
