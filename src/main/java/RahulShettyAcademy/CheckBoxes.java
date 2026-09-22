package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		System.out.println("First one:"+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		
//		//To count number of check boxes present
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		Assert.assertEquals(6, 6);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Thread.sleep(2000);
		driver.close();
	}

}
