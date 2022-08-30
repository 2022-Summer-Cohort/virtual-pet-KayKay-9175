package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    public void createVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void shouldBeAbleToAddAPetToTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet1 = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet1);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet1));
        assertTrue(virtualPets.containsValue(testPet2));
        assertTrue(virtualPets.containsValue(testPet3));
        assertTrue(virtualPets.containsValue(testPet4));
    }

    @Test
    public void shouldReturnSpecificPetGivenItsName() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        underTest.addPetToShelter(testPet);
        String test = "Maiki";
        assertEquals(testPet, underTest.returnSpecificPetGivenItsName(test));
    }

    @Test
    public void shouldBeAbleToRemoveAPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet));
        assertTrue(virtualPets.containsValue(testPet2));
        underTest.removePetFromShelter(testPet2);
        assertFalse(virtualPets.containsValue(testPet2));
    }

    @Test
    public void collectionShouldReturnAllPetsInShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotKappa("Mizu");
        VirtualPet testPet3 = new RobotFox("Kamina");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Collection<VirtualPet> petCollection = underTest.getVirtualPetCollection();
        assertTrue(petCollection.contains("Maiki"));
        assertTrue(petCollection.contains("Mizu"));
        assertFalse(petCollection.contains("Kamina"));
    }

    @Test
    public void walkAllDogsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.walkAllFoxAtOnce();
        assertEquals(0, testPet.getBoredomLevel());
        assertEquals(0, testPet2.getBoredomLevel());
        assertEquals(15, testPet3.getBoredomLevel());
    }

    @Test
    public void playAllCatsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.playWithAllKappaAtOnce();
        assertEquals(15, testPet.getBoredomLevel());
        assertEquals(15, testPet2.getBoredomLevel());
        assertEquals(0, testPet3.getBoredomLevel());
        assertEquals(0, testPet4.getBoredomLevel());
    }

    @Test
    public void waterShouldWaterAllOrganicPetsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.waterAllOrganicPetsAtOnce();
        assertEquals(0, ((OrganicFox) testPet).getThirstLevel());
        assertEquals(0, ((OrganicKappa) testPet3).getThirstLevel());
    }

    @Test
    public void feedAllOrganicPetsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.feedAllOrganicPetsAtOnce();
        assertEquals(0, ((OrganicFox) testPet).getHungerLevel());
        assertEquals(0, ((OrganicKappa) testPet3).getHungerLevel());
    }

    @Test
    public void cleanAllOrganicDogCagesAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        ((OrganicFox) testPet).cageDirtiness = 30;
        underTest.cleanAllOrganicFoxCagesAtOnce();
        assertEquals(0, ((OrganicFox) testPet).getCageDirtiness());
    }

    @Test
    public void oilAllRobotAnimalsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicFox("Maiki");
        VirtualPet testPet2 = new RobotFox("Kamina");
        VirtualPet testPet3 = new OrganicKappa("Umi");
        VirtualPet testPet4 = new RobotKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        testPet2.maintenanceLevel = 50;
        testPet4.maintenanceLevel = 50;
        underTest.oilALlRobotsAtOnce();
        assertEquals(15, ((RobotFox) testPet2).getMaintenanceLevel());
        assertEquals(15, ((RobotKappa) testPet4).getMaintenanceLevel());
    }

    @Test
    public void tickShouldTickForAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new RobotFox("Kamina");
        VirtualPet testPet2 = new OrganicKappa("Mizu");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.tickForAllPetsAtOnce();
        assertEquals(20, testPet.getBoredomLevel());
        assertEquals(30, ((RobotFox) testPet).getMaintenanceLevel());
        assertEquals(20, ((OrganicKappa) testPet2).getThirstLevel());
        assertEquals(20, ((OrganicKappa) testPet2).getHungerLevel());
        assertEquals(20, testPet2.getBoredomLevel());
    }

}
