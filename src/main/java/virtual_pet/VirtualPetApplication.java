package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Virtual Pet! Choose a name by pressing these keys!");
        System.out.print("Press K for Kitsune the Fox. Press U for Ume the Kappa. Press C for Chika the Robotic Fox. Press M for Maiki the Robotic Kappa");
        String petChoice =  input.nextLine();
        //It doesn't know what 'pet' is.
        VirtualPet pet = new VirtualPet(petChoice);

        int keyPress;
        do {
            System.out.println("Press 5 to check status. Press 1 to feed. Press 2 to give water. " +
                    "Press 3 to bathe. Press 4 to play");
            keyPress = input.nextInt();


            switch (keyPress) {
                case 1:
                    pet.feed();
                    System.out.println("美味しい Yummy! ");
                    break;

                case 2:
                    pet.water();
                    System.out.println("ありがとう Thank you! ");
                    break;

                case 3:
                    pet.nasty();
                    System.out.println("綺麗 I'm so clean! ");
                    break;

                case 4:
                    pet.boredom();
                    System.out.println("楽しい I had so much fun! ");
                default:
                    System.out.println("Please pick from the list above");
            }
            pet.tick();

        } while(pet.getHunger() < 10 && pet.getThirst() < 10 && pet.getHygiene() < 10 && pet.getFun() < 10);



    }
    }






















