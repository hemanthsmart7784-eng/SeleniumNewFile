package RahulShettyAcademy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swicthing_windows_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();//We use .getWindowHandles() to switch windows
		Iterator<String>it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow); // switching to child window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3[text()='New Window']")).getText());
		driver.switchTo().window(parentwindow); // again // switching to parent window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3[text()='Opening a new window']")).getText());
		
	}
	
}
