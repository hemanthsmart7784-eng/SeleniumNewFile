package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String day = "10";
		String month = "NOV";
		String year = "1998";

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		for(int i=0;i<3;i++) {
			driver.findElement(By.cssSelector("button[class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']")).click();

		}
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.cssSelector("abbr[aria-label='November 1998']")).click();
		driver.findElement(By.cssSelector("abbr[aria-label='November 10, 1998']")).click();
	}
}
