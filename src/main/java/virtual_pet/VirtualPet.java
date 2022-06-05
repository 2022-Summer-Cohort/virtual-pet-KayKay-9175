package virtual_pet;

public class VirtualPet {

    private String name;

    private int hunger;

    private int hygiene;

    private int thirst;

    private int fun;

    public VirtualPet(String name, int hunger, int hygiene, int thirst, int fun) {
        this.name = name;
        this.hunger = hunger;
        this.hygiene = hygiene;
        this.thirst = thirst;
        this.fun = fun;
    }

    public String getName() {
        return name;
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


        if (hunger < 5) {
            System.out.println("Kame is hungry. Feed the guy!");


        }
        if (thirst < 5) {
            System.out.println("Kame is thirsty. Get him some water!");
        }

        if(hygiene < 5) {
            System.out.println("Kame stinks! Bathe him! ");
        }

        if (fun < 5) {
            System.out.println("Kame is bored. Play with him!");
        }

        }

    public void feed() {hunger += 4;}
    public void water() {thirst += 4;}
    public void nasty() {hygiene += 4;}
    public void boredom() {fun += 4;}
    public void greeting() {
        System.out.println("Hi, nice to meet you! My name is " + name + " the turtle! Please take care of me! ");
    }
    public void showStatus() {
        System.out.println("Kame's Hunger:" + hunger);
        System.out.println("Kame's Hygiene:" + hygiene);
        System.out.println("Kame's Thirst:" + thirst);
        System.out.println("Kame's Fun:" + fun);
    }
}