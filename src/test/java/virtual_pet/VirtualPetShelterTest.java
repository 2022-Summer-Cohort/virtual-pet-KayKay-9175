package virtual_pet;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Assertions;
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
    public void addPetWhenAdmitted() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet();
        assertEquals(4, underTest.shelter.size());
    }

    @Test
    public void shouldFeedAllOrganicPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("X");
        underTest.feedAll();
        assertEquals(8, pet.getHunger());
    }

    @Test
    public void shouldWaterAllOrganicPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("X");
        underTest.giveWater();
        assertEquals(8, pet.getThirst());
    }

    @Test
    public void shouldCleanAllPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet pet = new VirtualPet("X");
        underTest.cleanAll();
        assertEquals(8, pet.getHygiene());
    }

    @Test
    public void shouldChargeFoxRobot() {
        RobotFox underTest = new RobotFox("Chika", 6, 6);
        underTest.recharge();
        assertEquals(10, underTest.getBatteryLevel());

    }

    @Test
    public void shouldChargeKappaRobot() {
        RobotKappa underTest = new RobotKappa("Maiki", 8, 7);
        underTest.recharge();
        assertEquals(10, underTest.getBatteryLevel());

    }

    @Test
    public void shouldGiveOilToAllRoboticPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.giveOil();
        assertEquals(10, underTest.getOilLevel());
    }
}
