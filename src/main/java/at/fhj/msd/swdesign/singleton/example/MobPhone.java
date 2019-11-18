package at.fhj.msd.swdesign.singleton.example;

public class MobPhone {

    public static void main(String[] args) {

        MobPhoneComponent network = new MobPhoneComponent("Network");
        MobPhoneComponent display = new MobPhoneComponent("Display");
        MobPhoneComponent gps = new MobPhoneComponent("GPS");

        display.use();
        network.use();
        display.use();
        gps.use();
        display.use();
        display.use();
        display.use();

    }
}
