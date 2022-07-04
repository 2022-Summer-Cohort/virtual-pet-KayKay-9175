package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet!");
        System.out.println("Press 1 to feed/charge all");
        System.out.println("Press 2 to give water. ");
        System.out.println("Press 3 to bathe all. ");
        System.out.println("Press 4 to play with all the animals. ");
        System.out.println("Press 5 to chose a pet. ");
        System.out.println("Press 6 to show stats.");
        System.out.println("Press 7 to admit a pet.");
        VirtualPetShelter shelter = new VirtualPetShelter();
        int keyPress;

        do {
            keyPress = input.nextInt();

            switch (keyPress) {
                case 1:
                    shelter.feedChargeAll();

                    System.out.println("美味しい Yummy! You feed all the pets! ");
                    break;

                case 2:
                    shelter.giveWaterOilAll();
                    System.out.println("ありがとう Thank you! You gave water/oil to all the pets!");
                    break;

                case 3:
                   shelter.cleanAll();
                    System.out.println("綺麗 I'm so clean! ");
                    break;

                case 4:
                   shelter.haveFun();
                    System.out.println("楽しい I had so much fun! ");
                    break;
                case 5:
                    System.out.println("Enter name of pet you would like to play with");
                    System.out.println("Kitsune the Fox");
                    System.out.println("Ume the Kappa");
                    System.out.println("Chika the Robotic Fox");
                    System.out.println("Maiki the Robotic Kappa");
                    String name = input.nextLine();
                    shelter.findPetByName(name);
                    System.out.println("You picked" + name);
                    break;
                case 6:
                    shelter.showStatusForAll();
                    break;
                case 7:
                    System.out.println("What's the name of your new pet?");
                    String pet = input.nextLine();
                    System.out.println("What type of pet is it? ");
                    System.out.println("1. Organic?");
                    System.out.println("2. Robotic?");
                    String newPetType = input.nextLine();




                default:
                    System.out.println("Please pick from the list above");
            }
            shelter.tickAll();

        } while(true);



    }
    }






















