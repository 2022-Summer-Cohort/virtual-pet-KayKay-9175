package virtual_pet;
public class OrganicKappa extends VirtualKappa implements OrganicPet {

    public OrganicKappa(String virtualPetName) {
        super(virtualPetName, "Organic Kappa");
        this.hungerLevel = 15;
        this.thirstLevel = 15;
    }

    @Override
    public int feedOrganicPet() {
        hungerLevel = hungerLevel - 30;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    @Override
    public int giveOrganicPetWater() {
        thirstLevel = thirstLevel - 30;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    @Override
    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public int cleanOrganicFoxCage() {
        return 0;
    }

    @Override
    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;
        if (happinessLevel <= 30) {
            healthLevel -= 5;
        }
        if (hungerLevel >= 50) {
            healthLevel -= 5;
        }
        if (thirstLevel >= 50) {
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



