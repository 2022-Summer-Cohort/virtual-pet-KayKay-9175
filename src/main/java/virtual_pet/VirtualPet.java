package virtual_pet;

import java.util.Random;

public class VirtualPet{
    private String name;
    private int hunger;

    private int hygiene;

    private int thirst;

    private int fun;

    public VirtualPet(String name) {
        Random x = new Random();
        this.name = name;
        this.hunger = x.nextInt(10);
        this.hygiene = x.nextInt(10);
        this.thirst = x.nextInt(10);
        this.fun = x.nextInt(10);
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
            System.out.println(name + "is hungry. Feed the guy!");


        }
        if (thirst < 5) {
            System.out.println(name + "is thirsty. Get him some water!");
        }

        if(hygiene < 5) {
            System.out.println(name + "stinks! Bathe the pet! ");
        }

        if (fun < 5) {
            System.out.println(name + "is bored. Play with him!");
        }

        }

    public void feed() {hunger += 4;}
    public void water() {thirst += 4;}
    public void nasty() {hygiene += 4;}
    public void boredom() {fun += 4;}

    public void showStatus() {
        System.out.println("Hunger:" + hunger);
        System.out.println("Hygiene:" + hygiene);
        System.out.println("Thirst:" + thirst);
        System.out.println("Fun:" + fun);
    }
}