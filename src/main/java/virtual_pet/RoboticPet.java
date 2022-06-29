package virtual_pet;

public class RoboticPet extends VirtualPet  {


    private int batteryLevel;

    private int oilLevel;


    public RoboticPet(String name, int batteryLevel, int oilLevel) {
        super(name);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void recharge() {
        batteryLevel += 4;
    }
    public void oil() {oilLevel += 4; }

}
