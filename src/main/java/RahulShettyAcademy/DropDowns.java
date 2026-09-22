package RahulShettyAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Thread.sleep(1000);
		Select drop = new Select(StaticDropdown);
		drop.selectByValue("USD");
		Thread.sleep(1000);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("AED");
		System.out.println(drop.getFirstSelectedOption().getText());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click(); // we can
		// also write this as parent to child traverse

		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[role='presentation'] a"));
		for (WebElement op : options) {
			if (op.getText().equalsIgnoreCase("india")) {
				op.click();
				System.out.println(op.getText());
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
