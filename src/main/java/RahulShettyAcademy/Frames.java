package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//driver.findElement(By.cssSelector("frame[name='frame-middle']")).getText();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
		
	
	
		
	}

}
