package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.name("search_query")).sendKeys("video songs");
		 Thread.sleep(2000);
		 driver.findElement(By.name("search_query")).submit();
		 Thread.sleep(2000);
		driver.navigate().to("https://chatgpt.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.className("placeholder")).sendKeys("write a simple java program");
		 Thread.sleep(2000);
		driver.navigate().back();
		 Thread.sleep(2000);
		driver.quit();
	}

}
