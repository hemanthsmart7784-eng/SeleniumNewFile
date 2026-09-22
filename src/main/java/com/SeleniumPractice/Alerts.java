package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		//Alerts
		driver.findElement(By.id("alertBox")).click(); //Clicking "click me" option
		System.out.println(driver.switchTo().alert().getText()); //switching to check alerts and printing alert message
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // Accepting the alerts
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
				
		//Confirm box
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(1000);
		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();	
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Prompt
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Hi Hemanth Accept");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(1000);

		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Hi Hemanth go");
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());

		driver.quit();
	}

}
