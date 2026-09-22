package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testing {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // If needed, set driver path:
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomePageHeading() {
        driver.get("https://the-internet.herokuapp.com/");

        // Verify URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://the-internet.herokuapp.com/",
                "Home page URL is incorrect");

        // Verify main heading text
        WebElement heading = driver.findElement(By.tagName("h1"));
        String headingText = heading.getText();
        Assert.assertEquals(headingText, "Welcome to the-internet",
                "Home page heading text is incorrect");
    }

    @Test
    public void verifyABTestingLink() {
        driver.get("https://the-internet.herokuapp.com/");

        // Click on "A/B Testing" link
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();

        // Verify we navigated to A/B Testing page by checking the <h3> text
        WebElement subHeading = driver.findElement(By.tagName("h3"));
        String subHeadingText = subHeading.getText();
        Assert.assertEquals(subHeadingText, "A/B Test Control",
                "A/B Testing page heading is incorrect");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

