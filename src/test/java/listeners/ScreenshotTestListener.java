package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotTestListener implements ITestListener {

    @Override
    public void onTestFailure (ITestResult testResult) {
        System.out.printf("We've got screenshot, because %s failed.\n", testResult.getMethod().getMethodName());

    }
}
