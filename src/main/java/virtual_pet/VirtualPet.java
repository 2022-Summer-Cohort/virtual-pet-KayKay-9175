package virtual_pet;

import java.util.Random;

public abstract class VirtualPet{
    protected String name;


    public VirtualPet(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }


    public abstract void showStatus();
    public abstract void tick();


}