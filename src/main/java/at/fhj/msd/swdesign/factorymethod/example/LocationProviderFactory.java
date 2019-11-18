package at.fhj.msd.swdesign.factorymethod.example;

public class LocationProviderFactory {


    public static final String GPS_PROVIDER = "gps";
    public static final String NETWORK_PROVIDER = "network";


    public static AbstractLocationProvider createLocationProvider(String type) {

        AbstractLocationProvider locationProvider = null;

        switch (type) {
            case GPS_PROVIDER:
                locationProvider = new GPSProvider();
                break;
            case NETWORK_PROVIDER:
                locationProvider = new NetworkProvider();
                break;
            default:
        }
        return locationProvider;
    }
}