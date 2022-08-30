package virtual_pet;

public abstract class VirtualFox extends VirtualPet{
    public VirtualFox(String virtualPetName, String virtualPetDescription) {
        super(virtualPetName, virtualPetDescription);
    }

    public int playWithPet() {
        boredomLevel = 0;
        happinessLevel += 10;
        if (happinessLevel > 100) {
            happinessLevel = 100;
        }
        return boredomLevel;
    }
}
