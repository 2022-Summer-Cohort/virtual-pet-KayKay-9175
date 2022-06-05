package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("Sora", 6, 7,10, 9));
        shelter.add(new VirtualPet("Ume", 8, 4, 6, 3));
        shelter.add(new VirtualPet("Chika",10, 7, 7, 5));
    }

    public void admitPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void feedAll() {
        for(VirtualPet pet: shelter){
            pet.feed();
        }


    }
}
