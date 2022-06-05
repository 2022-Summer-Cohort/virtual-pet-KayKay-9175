package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        VirtualPet kameTurtle = new VirtualPet("Kame", 8, 6, 7, 9);
        Scanner input = new Scanner(System.in);
        kameTurtle.greeting();
        int keyPress;
        System.out.println("Press 5 to check status. Press 1 to feed. Press 2 to give water. " +
                "Press 3 to bathe. Press 4 to play");
        while (true) {
            kameTurtle.showStatus();

            keyPress = input.nextInt();


            switch (keyPress) {
                case 1:
                    kameTurtle.feed();
                    break;

                    case 2:
                    kameTurtle.water();
                    break;

                case 3:
                    kameTurtle.nasty();
                    break;

                case 4:
                    kameTurtle.boredom();
                break;
            }

            if (keyPress == 1) {
                System.out.println("美味しい Yummy! ");

            }
            if (keyPress == 2) {
                System.out.println("ありがとう Thank you! ");
            }
            if (keyPress == 3) {
                System.out.println("綺麗 I'm so clean! ");
            }
            if (keyPress == 4) {
                System.out.println("楽しい I had so much fun! ");

            }
            kameTurtle.tick();
        }
    }
}





















