import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
    public void onTestStart(ITestResult iTestResult)
    {
        System.out.println("I am in onTestStart method...");
    }

    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println("I am in onTestSuccess method...");
    }

    public void onTestFailure(ITestResult iTestResult)
    {
        System.out.println("I am in onTestFailure method...");

    }

    public void onTestSkipped(ITestResult iTestResult)
    {
        System.out.println("I am in onTestSkipped method...");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult)
    {
        System.out.println("I am in onTestFailedButWithinSuccessPercentage method...");
    }

    public void onStart(ITestContext iTestContext)
    {
        System.out.println("I am in onStart method...");
    }

    public void onFinish(ITestContext iTestContext)
    {
        System.out.println("I am in onFinish method...");
    }
}
