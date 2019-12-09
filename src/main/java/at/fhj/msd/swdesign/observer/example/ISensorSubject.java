package at.fhj.msd.swdesign.observer.example;

public interface ISensorSubject {

    void attach (SensorListener listener);

    void remove (SensorListener listener);

    void notifyObservers();
}





















   /* void attach(SensorListener listener);

    void remove(SensorListener listener);

    void notifyObservers();
}
*/