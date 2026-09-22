package com.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.joran.action.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/client");

        driver.findElement(By.xpath("//input[@placeholder='email@example.com']")).sendKeys("hemanthgundepalli@selenium.com");
		driver.findElement(By.xpath("//input[@formcontrolname='userPassword']")).sendKeys("Hemanth@123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));

        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        WebElement product = products.stream().filter(p -> p.findElement(By.cssSelector("b"))
                        .getText().equalsIgnoreCase("iphone 13 pro")).findFirst().orElse(null);
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
        
      //for second item
        WebElement product2 = products.stream().filter(p -> p.findElement(By.cssSelector("b"))
                .getText().equalsIgnoreCase("ZARA COAT 3")).findFirst().orElse(null);

        if (product != null) {

            WebElement addToCart =
                    product.findElement(By.cssSelector(".card-body button:last-of-type"));
            
            //for second item
            WebElement addToCart2 =
                    product2.findElement(By.cssSelector(".card-body button:last-of-type"));

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".toast-container")));

            try {
                wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
                
              //for second item
                wait.until(ExpectedConditions.elementToBeClickable(addToCart2)).click();
            } catch (Exception e) {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].click();", addToCart);
                
              //for second item
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].click();", addToCart2);
            }

        } else {
            System.out.println("Product not found");
        }
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
        	    By.cssSelector(".ngx-spinner-overlay")));
        
        //driver.findElement(By.cssSelector("[routerlink*='cart']")).click();  (I have wrote this)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
        WebElement cart = driver.findElement(By.cssSelector("[routerlink*='cart']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cart);

        
       List<WebElement> cartProduct =  driver.findElements(By.cssSelector(".cartSection h3"));
     Boolean B=  cartProduct.stream().anyMatch(p->p.getText().equalsIgnoreCase("iphone 13 pro"));
       Assert.assertTrue(B);
     
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
       WebElement checkout = driver.findElement(By.cssSelector(".totalRow button"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkout);

//       Actions a= new Actions(driver);  (I have wrote this)
//       a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//       
//       driver.findElement(By.xpath("//button[contains(@class, 'ta-item')][2]")).click();
       
       WebElement country = driver.findElement(By.cssSelector("input[placeholder='Select Country']"));
       country.click();
       new Actions(driver).sendKeys(country, "india").perform();
       WebElement option = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'ta-item')][2][contains(.,'India')]")));
       ((JavascriptExecutor)driver).executeScript("arguments[0].click();", option);

     //  driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();   (I have wrote this)
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));
       WebElement placeOrder = driver.findElement(By.cssSelector(".btnn.action__submit"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeOrder);

       
     //  String S= driver.findElement(By.cssSelector(".hero-primary")).getText();   (I have wrote this)
       String S = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".hero-primary"))).getText();
       Assert.assertTrue(S.equalsIgnoreCase("Thankyou for the order.") );
       System.out.println(S);
      // driver.close();
       
}
    }
