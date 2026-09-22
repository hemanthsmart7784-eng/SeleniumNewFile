package RahulShettyAcademy;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] iteamsNeeded = { "Tomato", "Potato", "Mushroom", "Corn" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			List allIteamsNeeded = Arrays.asList(iteamsNeeded);
			if (allIteamsNeeded.contains(name)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// System.out.println( driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).getText());
				Thread.sleep(1000);
			}
		}
		
	}

}
