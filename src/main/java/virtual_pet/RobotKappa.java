package virtual_pet;

public class RobotKappa extends RoboticPet implements Walking{


    public RobotKappa(String name, String petType, int batteryLevel, int oilLevel, int play, int clean) {
        super(name, petType, batteryLevel, oilLevel, play, clean);


    }

    @Override
    public void walk() {

    }
}

