package virtual_pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    private final PrintStream standardOut = System.out;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void greetingShouldReturnStatus() {
        VirtualPet underTest = new VirtualPet("Kame", 8, 6, 7, 9);
        String expectedOutput = "Hi, nice to meet you! My name is Kame the turtle! Please take care of me!";
        underTest.greeting();
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    void hungerLevelShouldGoToWhenFeed() {
        VirtualPet underTest = new VirtualPet("Kame", 8, 6, 7, 9);
        underTest.feed();
        underTest.tick();
        assertEquals(11, underTest.getHunger());
    }

    @Test
    void thirstLevelShouldGoToWhenDrink() {
        VirtualPet underTest = new VirtualPet("Kame", 8, 6, 7, 9);
        underTest.water();
        underTest.tick();
        assertEquals(10, underTest.getThirst());
    }

    @Test
    void hygieneLevelShouldGoToWhenClean() {
        VirtualPet underTest = new VirtualPet("Kame", 8, 6, 7, 9);
        underTest.nasty();
        underTest.tick();
        assertEquals(9, underTest.getHygiene());
    }

    @Test
    void funLevelShouldGoToWhenPlay() {
        VirtualPet underTest = new VirtualPet("Kame", 8, 6, 7, 9);
        underTest.boredom();
        underTest.tick();
        assertEquals(12, underTest.getFun());
    }
}

