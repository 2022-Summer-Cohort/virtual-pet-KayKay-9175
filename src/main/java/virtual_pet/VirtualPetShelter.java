package virtual_pet;

import java.util.ArrayList;

class VirtualPetShelter {

    public ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new OrganicFox("Kitsune", 7, 5, 6, 6));
        shelter.add(new OrganicKappa("Ume", 5, 9, 9, 4));
        shelter.add(new RobotFox("Chika", 6, 6, 5, 7));
        shelter.add(new RobotKappa("Maiki", 8, 7, 5, 8));
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


    public void feedChargeAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).recharge();
            }
        }

    }


    public void giveWaterOilAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).water();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oil();
            }
        }
    }

    public void cleanAll() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).nasty();
            }
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).fresh();
            }
        }
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
















