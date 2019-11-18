package at.fhj.msd.swdesign.singleton.example;

public class MobPhoneComponent {

    private String name;
    private DeviceBattery battery;

    public MobPhoneComponent(String name) {
        this.name = name;
        battery = new DeviceBattery();

    }

    public void use() {
        System.out.println("using " + this.name + ", Battery:" + battery.getPowerPercentage());
    }

}
