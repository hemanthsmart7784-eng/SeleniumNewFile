package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_option_select_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(name);
		WebElement e =driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(e);
		s.selectByVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String name2 = driver.switchTo().alert().getText();
		if(name2.contains(name)) {
			System.out.println("success");
		}
		else {
			System.out.println("not success");
		}
		
	}

}
