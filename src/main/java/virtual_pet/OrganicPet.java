package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    private int hunger;

    private int hygiene;

    private int thirst;

    private int fun;


    public OrganicPet(String name, String petType, int hunger, int hygiene, int thirst, int fun) {
        super(name, petType);
        this.hunger = hunger;
        this.hygiene = hygiene;
        this.thirst = thirst;
        this.fun = fun;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHygiene() {
        return hygiene;
    }

    public int getThirst() {
        return thirst;
    }

    public int getFun() {
        return fun;
    }


    public void tick() {
        hunger--;
        thirst--;
        hygiene--;
        fun--;
    }

    public void showStatus() {
        System.out.println("Hunger:" + hunger);
        System.out.println("Hygiene:" + hygiene);
        System.out.println("Thirst:" + thirst);
        System.out.println("Fun:" + fun);
    }

    public void feed() {
        hunger += 4;
    }

    public void water() {
        thirst += 4;
    }

    public void nasty() {
        hygiene += 4;
    }

    public void boredom() {
        fun += 4;
    }




}
