package virtual_pet;

import java.util.Random;

public abstract class RoboticPet extends VirtualPet  {

protected String name;
    private int batteryLevel;

    private int oilLevel;

    private int play;

    private int clean;

    public RoboticPet(String name, String petType, int batteryLevel, int oilLevel, int play, int clean) {
        super(name, petType);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.play = play;
        this.clean = clean;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getPlay() {
        return play;
    }

    public int getClean() {
        return clean;
    }

    public void recharge() {
        batteryLevel += 4;
    }
    public void oil() {oilLevel += 4; }

    public void happy() {play +=4;}

    public void fresh() {clean +=4;}

    public void showStatus() {
        System.out.println("Battery Level:" + batteryLevel);
        System.out.println("Oil Level:" + oilLevel);
        System.out.println("Hygiene" + clean);
        System.out.println("Fun:" + play);
    }


    @Override
    public void tick() {
        oilLevel--;
        batteryLevel--;
        play--;
    }
    public abstract void createPet();
}




