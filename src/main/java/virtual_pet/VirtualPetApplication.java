package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet petOne = new OrganicFox("Maiki");
        VirtualPet petTwo = new OrganicFox("Kitsune");
        VirtualPet petThree = new RobotFox("Kamina");
        VirtualPet petFour = new RobotFox("Ryu");
        VirtualPet petFive = new OrganicKappa("Umi");
        VirtualPet petSix = new OrganicKappa("Nami");
        VirtualPet petSeven = new RobotKappa("Mizu");
        VirtualPet petEight = new RobotKappa("Sui");
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.addPetToShelter(petOne);
        petShelter.addPetToShelter(petTwo);
        petShelter.addPetToShelter(petThree);
        petShelter.addPetToShelter(petFour);
        petShelter.addPetToShelter(petFive);
        petShelter.addPetToShelter(petSix);
        petShelter.addPetToShelter(petSeven);
        petShelter.addPetToShelter(petEight);
        System.out.println("Welcome to the Virtual Pet Shelter!");
        while (true) {
            System.out.println("Current Status of all Pets in Shelter:");
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Hunger\t\t   |Thirst\t\t  |Boredom\t\t |Cage Dirtiness");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof OrganicFox) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((OrganicFox) virtualPet).getHungerLevel() + "\t\t\t " + ((OrganicFox) virtualPet).getThirstLevel() + "\t\t\t\t" +
                            virtualPet.getBoredomLevel() + "\t\t\t\t" + ((OrganicFox) virtualPet).cageDirtiness);
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Maintenance\t|Boredom");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof RobotFox) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((RobotFox) virtualPet).getMaintenanceLevel() + "\t\t\t " +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Hunger\t\t   |Thirst\t\t  |Boredom\t\t");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof OrganicKappa) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((OrganicKappa) virtualPet).getHungerLevel() + "\t\t\t " + ((OrganicKappa) virtualPet).getThirstLevel() + "\t\t\t\t" +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Maintenance\t|Boredom");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof RobotKappa) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((RobotKappa) virtualPet).getMaintenanceLevel() + "\t\t\t " +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("\nWhat would you like to do with the pets?\n");
            System.out.println("1: Feed all Organic Pets in Shelter.");
            System.out.println("2: Give Water to all Organic Pets in Shelter.");
            System.out.println("3: Oil(Maintenance) all Robot Pets in Shelter.");
            System.out.println("4: Play with all Kappa in the Shelter.");
            System.out.println("5: Walk all Foxes in the Shelter.");
            System.out.println("6: Clean all Organic Foxes' Cages.");
            System.out.println("7: Adopt a pet.");
            System.out.println("8: Admit a pet to the Shelter.");
            System.out.println("9: Quit.");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                petShelter.feedAllOrganicPetsAtOnce();
            }
            if (userChoice == 2) {
                petShelter.waterAllOrganicPetsAtOnce();
            }
            if (userChoice == 3) {
                petShelter.oilALlRobotsAtOnce();
            }
            if (userChoice == 4) {
                petShelter.playWithAllKappaAtOnce();
            }
            if (userChoice == 5) {
                petShelter.walkAllFoxAtOnce();
            }
            if (userChoice == 6) {
                petShelter.cleanAllOrganicFoxCagesAtOnce();
            }
            if (userChoice == 7) {
                System.out.println("\nYou would like to adopt a pet out of the shelter.\nThese are the pets eligible:");
                for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t|" + virtualPet.getVirtualPetDescriptor());
                }
                System.out.println("Please type in which pet to adopt:");
                String userAdoptionChoice = input.next();
                petShelter.removePetFromShelter(petShelter.returnSpecificPetGivenItsName(userAdoptionChoice));
                System.out.println(userAdoptionChoice + " has found a happy home!");
            }
            if (userChoice == 8) {
                System.out.println("\nYou would like to add a pet to the Shelter.\nPlease type in the name of the pet:");
                String userPetToAddName = input.next();
                input.nextLine();
                System.out.println("Please indicate what kind of Pet " + userPetToAddName + " is:");
                System.out.println("1: Organic Fox.");
                System.out.println("2: Robot Fox.");
                System.out.println("3: Organic Kappa.");
                System.out.println("4: Robot Kappa.");
                int userAdoptChoice = input.nextInt();
                if (userAdoptChoice == 1) {
                    VirtualPet userPetToAdd = new OrganicFox(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 2) {
                    VirtualPet userPetToAdd = new RobotFox(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 3) {
                    VirtualPet userPetToAdd = new OrganicKappa(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 4) {
                    VirtualPet userPetToAdd = new RobotKappa(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
            }
            if (userChoice == 9) {
                System.out.println("\nThanks for helping at the Shelter! Bye!");
                break;
            }
            petShelter.tickForAllPetsAtOnce();
        }
    }

}






















