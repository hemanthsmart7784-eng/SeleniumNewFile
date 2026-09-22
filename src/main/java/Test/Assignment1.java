package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.linkText("Register Now!")).click();
			
			driver.findElement(By.name("username")).sendKeys("a123");
			driver.findElement(By.name("password")).sendKeys("a123");
			driver.findElement(By.name("repeatedPassword")).sendKeys("a123");
		
			driver.findElement(By.name("account.firstName")).sendKeys("Hem");
			driver.findElement(By.name("account.lastName")).sendKeys("G");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
			//selecting dogs
			driver.findElement(By.cssSelector("img[src='../images/sm_dogs.gif']")).click();
			driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=K9-RT-01']")).click();
			driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-28']")).click();
			
			//selecting birds
			driver.findElement(By.cssSelector("img[src='../images/sm_birds.gif']")).click();
			driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=AV-CB-01']")).click();
			driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-18']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrderForm=']")).click();
			System.out.println("Successfully selected dog and bird");
			driver.close();
			
	}

}
