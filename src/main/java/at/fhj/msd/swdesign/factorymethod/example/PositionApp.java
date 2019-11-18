package at.fhj.msd.swdesign.factorymethod.example;

import java.util.Scanner;

public class PositionApp {

    private Scanner scanner = new Scanner(System.in);
    private AbstractLocationProvider locationProvider;


    public void selectProvider() {

        System.out.println("select location provider (g/n)");
        String in = scanner.nextLine();
        if (in.equalsIgnoreCase("g")) {
            locationProvider = LocationProviderFactory.createLocationProvider(LocationProviderFactory.GPS_PROVIDER);
        } else {
            if (in.equalsIgnoreCase("n")) {
                locationProvider = LocationProviderFactory.createLocationProvider(LocationProviderFactory.NETWORK_PROVIDER);
            } else {
                selectProvider();
            }
        }
    }

    public static void main(String[] args) {
        PositionApp positionApp = new PositionApp();
        positionApp.selectProvider();
    }
}
