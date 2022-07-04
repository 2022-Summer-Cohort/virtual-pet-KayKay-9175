package virtual_pet;

import java.util.Random;

public abstract class VirtualPet{
    protected String name;

    protected String petType;


    public VirtualPet(String name, String petType) {
        this.name = name;
        this.petType = petType;

    }

    public VirtualPet() {

    }


    public String getName() {
        return name;
    }

    public String getPetType() {
        return petType;
    }

    public abstract void showStatus();

    public abstract void createPet();
    public abstract void tick();


}