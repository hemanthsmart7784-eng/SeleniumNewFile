package TestNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Script got passed somewhere");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Script got failedddddddd somewhere");
        //here we can write any code we want for example screenshot so that it will take error screenshot
    }
}
