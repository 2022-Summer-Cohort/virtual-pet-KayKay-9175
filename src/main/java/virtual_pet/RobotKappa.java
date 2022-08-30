package virtual_pet;

public class RobotKappa extends VirtualKappa implements RoboticPet {
    public RobotKappa(String virtualPetName) {
        super(virtualPetName, "Robot Kappa");
        this.maintenanceLevel = 25;
    }

    @Override
    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    @Override
    public int oilRobotPet() {
        maintenanceLevel -= 35;
        if (maintenanceLevel < 0) {
            maintenanceLevel = 0;
        }
        return maintenanceLevel;
    }

    @Override
    public void tick() {
        maintenanceLevel += 5;
        boredomLevel += 5;
        if (happinessLevel <= 30) {
            healthLevel -= 5;
        }
        if (maintenanceLevel >= 50) {
            healthLevel -= 5;
        }
        if (happinessLevel >= 75) {
            healthLevel += 5;
        }
        if (healthLevel > 100) {
            healthLevel = 100;
        }
        if (healthLevel < 0) {
            healthLevel = 0;
        }
    }
}
