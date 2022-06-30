package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Virtual Pet!");
        VirtualPetShelter shelter = new VirtualPetShelter();

        int keyPress;

        do {
            System.out.println("Press 1 to feed/charge all. Press 2 to give water. " +
                    "Press 3 to bathe all. Press 4 to play with all the animals. Press 5 to chose a pet. " +
                    "Press 6 to show stats.");
            keyPress = input.nextInt();


            switch (keyPress) {
                case 1:
                    shelter.feedChargeAll();
                    System.out.println("美味しい Yummy! ");
                    break;

                case 2:
                    shelter.giveWaterOilAll();
                    System.out.println("ありがとう Thank you! ");
                    break;

                case 3:
                   shelter.cleanAll();
                    System.out.println("綺麗 I'm so clean! ");
                    break;

                case 4:
                   shelter.haveFun();
                    System.out.println("楽しい I had so much fun! ");
                case 5:
                    System.out.println("Enter name of pet you would like to play with.");
                    System.out.print("Kitsune the Fox");
                    System.out.println("Ume the Kappa");
                    System.out.println("Chika the Robotic Fox");
                    System.out.println("Maiki the Robotic Kappa");
                    String name = input.nextLine();
                    shelter.findPetByName(name);
                case 6:
                    shelter.showStatusForAll();

                case 7:
                    VirtualPet newPet = createPet();
                    shelter.admitPet(newPet);
                    System.out.println("You have added a new pet to the shelter");
                default:
                    System.out.println("Please pick from the list above");
            }
            shelter.tickAll();

        } while(true);



    }
    }






















