import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    @BeforeTest
    public void necessaryPreStepsForStartTesting () {
        System.out.println("Necessary pre-steps before testing are processing.");
        System.out.println("-------------");
    }

    @AfterTest
    public void necessaryAfterStepsForStartTesting () {
        System.out.println("-------------");
        System.out.println("Testing is completed. Necessary actions are processing.");
    }

}
