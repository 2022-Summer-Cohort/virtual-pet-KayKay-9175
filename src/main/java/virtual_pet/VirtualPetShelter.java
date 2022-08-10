package virtual_pet;

import java.util.ArrayList;

class VirtualPetShelter {

    public ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new OrganicFox("Kitsune", "Organic" ,7, 5, 6, 6));
        shelter.add(new OrganicKappa("Ume", "Organic", 5, 9, 9, 4));
        shelter.add(new RobotFox("Chika", "Robotic", 6, 5, 7,8));
        shelter.add(new RobotKappa("Maiki", "Robotic", 7, 5, 8, 5));
    }

    public void adoptPet(String pet) {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().equalsIgnoreCase(pet)) {
                shelter.remove(i);
            }
        }
    }

    //Make this method takes in a VirtualPet, NOT  a String!


    public void admitPet(VirtualPet pet) {
        shelter.add(pet);

    }


    public int feedChargeAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).recharge();
            }
        }

        return 7;
    }


    public int giveWaterOilAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).water();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oil();
            }
        }
        return 5;
    }

    public int cleanAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).nasty();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).fresh();
            }
        }
        return 5;
    }

    public void haveFun() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).boredom();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).happy();
            }
        }
    }

    public void tickAll() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public VirtualPet findPetByName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void showStatusForAll() {
        for (VirtualPet pet : shelter) {
            pet.showStatus();
            }
        }
    
}






















