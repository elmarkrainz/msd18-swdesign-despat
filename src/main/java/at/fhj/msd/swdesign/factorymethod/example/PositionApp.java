package at.fhj.msd.swdesign.factorymethod.example;

import java.util.Scanner;

public class PositionApp {

    private Scanner scanner = new Scanner(System.in);

    // field locationProvider =???


    public void selectProvider() {

        System.out.println("select location provider (g/n)");

        String in = scanner.nextLine();
        if (in.equalsIgnoreCase("g")) {

            //  locationProvider =???

        } else {
            if (in.equalsIgnoreCase("n")) {

                //locationProvider =???

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
