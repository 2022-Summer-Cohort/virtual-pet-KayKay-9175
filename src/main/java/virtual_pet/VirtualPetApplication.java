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
        System.out.println("Press 8 to walk pet ");
        System.out.println("Press 9 to adopt a pet ");
        VirtualPetShelter shelter = new VirtualPetShelter();
        int keyPress;

        do {
            keyPress = input.nextInt();

            switch (keyPress) {
                case 1:
                    input.nextLine();
                    shelter.feedChargeAll();
                    System.out.println("美味しい Yummy! You feed all the pets! ");
                    break;

                case 2:
                    input.nextLine();
                    shelter.giveWaterOilAll();
                    System.out.println("ありがとう Thank you! You gave water/oil to all the pets!");
                    break;

                case 3:
                    input.nextLine();
                   shelter.cleanAll();
                    System.out.println("綺麗 It's good to be clean! ");
                    break;

                case 4:
                    input.nextLine();
                   shelter.haveFun();
                    System.out.println("楽しい I had so much fun! ");
                    break;

                case 5:
                    input.nextLine();
                    System.out.println("Enter name of pet you would like to play with");
                    System.out.println("Kitsune the Fox");
                    System.out.println("Ume the Kappa");
                    System.out.println("Chika the Robotic Fox");
                    System.out.println("Maiki the Robotic Kappa");
                    String name = input.nextLine();
                    shelter.findPetByName(name);
                    System.out.println("You picked" + "" + name+ "! Have fun!");
                    break;
                case 6:
                    input.nextLine();
                    shelter.showStatusForAll();
                    break;
                case 7:
                    input.nextLine();
                    System.out.println("What's the name of your new pet?");
                    String newName = input.nextLine();
                    System.out.println("What type of pet is it? ");
                    input.nextLine();
                    System.out.println("1. Organic?");
                    System.out.println("2. Robotic?");
                    input.nextLine();
                    System.out.println("Congrats! " + newName + " is now part of the shelter!");
                    break;
                case 8:
                    input.nextLine();
                    System.out.println("Thank you for the walk!");
                    break;
                case 9:
                    input.nextLine();
                    System.out.println("Which pet do you want to adopt?");
                    System.out.println("Kitsune the Fox");
                    System.out.println("Ume the Kappa");
                    System.out.println("Chika the Robotic Fox");
                    System.out.println("Maiki the Robotic Kappa");
                    String name1 = input.nextLine();
                    shelter.findPetByName(name1);
                    System.out.println("You adopted " + "" +  name1 + "! Please take care of your pet!");
                    break;



                default:
                    System.out.println("Please pick from the list above");
            }
            shelter.tickAll();

        } while(true);



    }
    }






















