package CreatureTest;

import listeners.ScreenshotTestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.zoo.fish.Fishes;
import org.zoo.fish.GoldFish;
import org.zoo.fish.Sturgeon;

import static org.testng.Assert.*;

@Listeners(ScreenshotTestListener.class)
public class FishTest {

    String test = "test";

    @DataProvider(name = "allKindOfFish")
    public Object[][] setAllKindOfFish() {
        Sturgeon currentSturgeon = new Sturgeon();
        GoldFish currentGoldFish = new GoldFish();
        return new Object [][] {
                {currentSturgeon},
                {currentSturgeon}
        };
    }

    @Test(groups = "positive", dataProvider = "allKindOfFish")
    public void constructorBirdslTest (Fishes anyFish) {
        String categoryAnyFish = anyFish.category;
        assertFalse(categoryAnyFish.isEmpty());
    }

    @Test (groups = "positive", dataProvider = "allKindOfFish")
    public void breatheBirdsTest (Fishes anyFish) {
        String breatheAnyFish = anyFish.breathe(test);
        assertEquals(breatheAnyFish, "get oxygen from the water");
    }

    @Test (groups = "positive", dataProvider = "allKindOfFish")
    public void moveFishTest (Fishes anyFish) {
        String moveAnyFish = anyFish.move(test);
        assertTrue(moveAnyFish.startsWith("swim"));
    }

}
