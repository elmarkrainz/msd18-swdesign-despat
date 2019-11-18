package at.fhj.msd.swdesign.singleton.example;

public class DeviceBattery {

    private int powerPercentage = 100;

    public int getPowerPercentage() {
        if (powerPercentage > 0) {
            powerPercentage= powerPercentage-10;
        }
        return powerPercentage;
    }



//--- refactor to singleton


    private static DeviceBattery deviceBattery;

   private DeviceBattery() {
        powerPercentage = 100;
    }


    public static DeviceBattery getInstance() {
        if (deviceBattery== null){
            deviceBattery = new DeviceBattery();
        }
        return deviceBattery;
    }


}
