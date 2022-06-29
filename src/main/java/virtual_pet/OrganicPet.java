package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    protected int hunger;

    protected int hygiene;

    protected int thirst;

    protected int fun;

    public OrganicPet(String name, int hunger, int hygiene, int thirst, int fun) {
        super(name);
        this.hunger = hunger;
        this.hygiene = hygiene;
        this.thirst = thirst;
        this.fun = fun;
    }

}

