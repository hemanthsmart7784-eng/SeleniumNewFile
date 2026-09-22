package RahulShettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//up to login page
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.id("password")).sendKeys("learning");
//		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("okayBtn")).click();
//		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
//		Select s=new Select(options);
//		s.selectByValue("consult");
//		driver.findElement(By.id("terms")).click();
//		driver.findElement(By.id("signInBtn")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		//after logged in
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		List<WebElement> items = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<items.size();i++) {
			items.get(i).click();
			Thread.sleep(1000);
			
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		
	}

}
