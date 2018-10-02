import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_01
{

    public WebDriver driver;
    public String currentURL = "https://www.google.com";

    @BeforeTest()
    public void preConditionOfSuite()
    {
        String pathChromeDriver = System.getProperty("user.dir") + "//datafiles//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChromeDriver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void openGoogle()
    {
        driver.get("https://www.google.com");

        // verifying current url
        Assert.assertEquals(driver.getCurrentUrl(), currentURL, "Expected URL is [" + currentURL + "], but Actual URL is [" + driver.getCurrentUrl() + "]");

    }

    @AfterTest
    public void postConditions() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
