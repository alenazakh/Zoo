package CreatureTest;

import listeners.ScreenshotTestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.zoo.bird.Birds;
import org.zoo.bird.Chicken;
import org.zoo.bird.Flamingos;
import org.zoo.bird.Stork;

import static org.testng.Assert.*;

@Listeners(ScreenshotTestListener.class)
public class BirdTest {

    String test = "test";

    @DataProvider(name = "allKindOfBirds")
    public Object[][] setAllKindOfBirds() {
        Chicken currentChicken = new Chicken();
        Flamingos currentFlamingo = new Flamingos();
        Stork currentStork = new Stork();
        return new Object [][] {
                {currentChicken},
                {currentFlamingo},
                {currentStork}
        };
    }

    @Test(groups = "positive", dataProvider = "allKindOfBirds")
    public void constructorBirdslTest (Birds anyBird) {
        String categoryAnyBird = anyBird.category;
        assertFalse(categoryAnyBird.isEmpty());
    }

    @Test (groups = "positive", dataProvider = "allKindOfBirds")
    public void breatheBirdsTest (Birds anyBird) {
        String breatheAnyBird = anyBird.breathe(test);
        assertEquals(breatheAnyBird, "breathe the air");
    }

    @Test (groups = "positive", dataProvider = "allKindOfBirds")
    public void moveBirdsTest (Birds anyBird) {
        String moveAnyBird = anyBird.move(test);
        assertTrue(moveAnyBird.startsWith("fly"));
    }

}
