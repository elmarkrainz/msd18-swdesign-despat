package at.fhj.msd.swdesign.singleton.example;

public class DeviceBattery {

    private int powerPercentage = 100;

    public int getPowerPercentage() {
        if (powerPercentage > 0) {
            powerPercentage= powerPercentage-10;
        }
        return powerPercentage;
    }
}
