package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class VirtualPetShelter {

    private Map<String, VirtualPet> virtualPets = new HashMap<>();


    public Map<String, VirtualPet> getVirtualPets() {
        return virtualPets;
    }

    public Collection getVirtualPetCollection() {
        return virtualPets.keySet();
    }

    public VirtualPet returnSpecificPetGivenItsName(String petsName) {
        return virtualPets.get(petsName);
    }

    public void addPetToShelter(VirtualPet petToAdd) {
        virtualPets.put(petToAdd.getVirtualPetName(),petToAdd);
    }

    public void removePetFromShelter(VirtualPet petToRemove) {
        virtualPets.remove(petToRemove.getVirtualPetName());
    }

    public void walkAllFoxAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof VirtualFox){
                pets.playWithPet();
            }
        }
    }

    public void playWithAllKappaAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof VirtualKappa){
                pets.playWithPet();
            }
        }
    }

    public void waterAllOrganicPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof OrganicPet){
                ((OrganicPet) pets).giveOrganicPetWater();
            }
        }
    }

    public void feedAllOrganicPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof OrganicPet){
                ((OrganicPet) pets).feedOrganicPet();
            }
        }
    }

    public void cleanAllOrganicFoxCagesAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            if (pets instanceof OrganicFox) {
                ((OrganicPet) pets).cleanOrganicFoxCage();
            }
        }


    }

    public void oilALlRobotsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof RoboticPet){
                ((RoboticPet) pets).oilRobotPet();
            }
        }
    }

    public void tickForAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.tick();
        }
    }
}






















