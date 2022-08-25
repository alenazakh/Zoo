package CreatureTest;

import listeners.ScreenshotTestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.zoo.animal.*;
import static org.testng.Assert.*;

@Listeners (ScreenshotTestListener.class)
public class AnimalTest {

    String test = "test";

    @DataProvider(name = "allKindOfAnimals")
    public Object[][] setAllKindOfAnimals() {
        Dog currentDog = new Dog();
        Cow currentCow = new Cow();
        Monkey currentMonkey = new Monkey();
        Whale currentWhale = new Whale();
        return new Object [][] {
            {currentDog},
            {currentCow},
            {currentMonkey},
            {currentWhale}
        };
    }

    @Test (groups = "positive", dataProvider = "allKindOfAnimals")
    public void constructorAnimalTest (Animals anyAnimal) {
        String categoryAniAnimal = anyAnimal.category;
        assertFalse(categoryAniAnimal.isEmpty());
    }

    @Test (groups = "positive", dataProvider = "allKindOfAnimals")
    public void breatheAnimalTest (Animals anyAnimal) {
        String breatheAnyAnimal = anyAnimal.breathe(test);
        assertEquals(breatheAnyAnimal, "breathe the air");
    }

    @Test (groups = "positive", dataProvider = "allKindOfAnimals")
    public void moveAnimalTest (Animals anyAnimal) {
        String moveAnyAnimal = anyAnimal.move(test);
        assertTrue(moveAnyAnimal.startsWith("walk"));
    }

    @Test (groups = "negative")
    public void someNegativeAnimalTest1 () {
        //System.out.println("Some negative animal test in process...");
        fail("Error is raised intentionally");
    }

    @Test (groups = "negative")
    public void someNegativeAnimalTest2 () {
        //System.out.println("Some negative animal test in process...");
        fail("Error is raised intentionally");
    }

    @Test (groups = "positive", dependsOnMethods = "someNegativeAnimalTest2", alwaysRun = true)    // added for trying dependsOnMethods
    public void somePositiveAnimalTest1 () {
        System.out.println("Some positive animal test in process, strict after someNegativeAnimalTest2 despite the result of it ...");
    }


    @Test (groups = "positive", enabled = false)    // doesn't run
    public void somePositiveAnimalTest2 () {
        System.out.println("Some positive animal test in process...");
    }


}
