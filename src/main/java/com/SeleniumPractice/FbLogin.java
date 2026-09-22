package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {

	public static void main(String []args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		WebElement usernametxt = driver.findElement(By.id("email"));
		usernametxt.sendKeys("9100357740");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Hemanth@7784");
		Thread.sleep(3000);
		//driver.findElement(By.className("_9lsb _9ls8")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);

	}
}
