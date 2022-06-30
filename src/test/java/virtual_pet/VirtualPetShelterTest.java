package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    @Test
    public void petIsAddedToVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void removePetWhenAdopted() {
//Assignment
        VirtualPetShelter underTest = new VirtualPetShelter();
//        Action
        underTest.adoptPet(toString());
//        Assertion
        assertEquals(2, underTest.shelter.size());
    }

    @Test
    public void addPetWhenAdmitted(VirtualPet pet) {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(pet);
        assertEquals(4, underTest.shelter.size());
    }

    @Test
    public void shouldFeedChargeAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedChargeAll();
        assertEquals(8, underTest.pet.feed);
    }

    @Test
    public void shouldWaterOilAllPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.giveWaterOilAll();
        assertEquals(8, getThirst());
    }

    @Test
    public void shouldCleanAllPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.cleanAll();
        assertEquals(8, underTest.getHygiene());
    }
    @Test
    public void shouldHaveFunAll() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.haveFun();
        assertEquals(8, underTest. ());

    }
    }

