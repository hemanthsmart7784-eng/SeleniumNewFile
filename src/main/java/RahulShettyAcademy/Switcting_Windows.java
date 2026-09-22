package RahulShettyAcademy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switcting_Windows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();//We use .getWindowHandles() to switch windows
		Iterator<String>it = windows.iterator();
		String Parentwindow = it.next();  // it will grap parent window at index 0
		String Childwindow = it.next();   // it will grap parent window at index 1
		driver.switchTo().window(Childwindow); // here swicthing to child window
		String s = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(s); // for this line we will get output as "Please email us at mentor@rahulshettyacademy.com with below template to receive response"
		String emailid = s.split("at")[1].trim().split(" ")[0];//here it will trim and will give us exact emailid
		System.out.println(emailid);
		driver.switchTo().window(Parentwindow); // again we are spliting to parent window
		driver.findElement(By.id("username")).sendKeys(emailid);
		
		
	}
}
