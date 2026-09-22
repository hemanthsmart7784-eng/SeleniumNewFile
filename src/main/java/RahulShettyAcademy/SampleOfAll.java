package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleOfAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Hemanth");
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("Hemanth Gundepalli");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hemanthgmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hema.@.");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select abc = new Select(drop);
		abc.selectByVisibleText("Female");
		driver.findElement(By.name("bday")).sendKeys("10-11-1998");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/a/following-sibling::strong")).getText());
		String string = driver.findElement(By.className("alert")).getText();
		System.out.println(string);
		Thread.sleep(3000);
		driver.close();
	}

}
