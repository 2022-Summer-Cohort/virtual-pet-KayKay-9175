package virtual_pet;

import java.util.ArrayList;

 class VirtualPetShelter {

    public ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new OrganicFox("Kitsune", 7, 5, 6, 6));
        shelter.add(new OrganicKappa("Ume", 5,9,9,4));
        shelter.add(new RobotFox("Chika", 6, 6));
        shelter.add(new RobotKappa("Maiki", 8, 7));
    }

    public void adoptPet(String pet) {
        for(int i=0;i<shelter.size();i++){
            if(shelter.get(i).getName().equalsIgnoreCase(pet)){
                shelter.remove(i);
            }
        }
    }

    //Make this method takes in a VirtualPet, NOT  a String!

    public void admitPet(VirtualPet pet) {
        shelter.add(pet);
    }


            public void feedAll() {
                for (VirtualPet pet : shelter) {
                    if (pet instanceof OrganicPet) {
                        pet.feed();
                    }
                }
            }


        public void giveWater() {
            for (VirtualPet pet : shelter) {
                if (pet instanceof OrganicPet) {
                    pet.water();
                }
            }
        }

        public void cleanAll() {
            for (VirtualPet pet : shelter) {
                pet.nasty();
            }
        }

        //Make sure the RoboticPet class extends VirtualPet
        public void giveOil(){
                for (VirtualPet pet: shelter) {
                    if(pet instanceof RoboticPet) {

                    }
                }
        }



 }




