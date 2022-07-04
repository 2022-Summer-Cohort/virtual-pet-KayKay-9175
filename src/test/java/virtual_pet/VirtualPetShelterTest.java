package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void removePetWhenAdopted() {

        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.adoptPet(toString());
        assertEquals(4, underTest.shelter.size());
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
        assertEquals(7, underTest.feedChargeAll());
        underTest.feedChargeAll();
    }

    @Test
    public void shouldWaterOilAllPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertEquals(5, underTest.giveWaterOilAll());
        underTest.giveWaterOilAll();

    }
    @Test
    public void shouldCleanAllPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        assertEquals(5, underTest.cleanAll());
        underTest.cleanAll();
    }
}
