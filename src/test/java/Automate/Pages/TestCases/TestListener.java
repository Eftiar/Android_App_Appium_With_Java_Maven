package Automate.Pages.TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Executing Test Case: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case " + result.getName() + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case " + result.getName() + " Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Not implemented
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not implemented
    }

    @Override
    public void onStart(ITestContext context) {
        // Not implemented
    }

    @Override
    public void onFinish(ITestContext context) {
        // Not implemented
    }
}
