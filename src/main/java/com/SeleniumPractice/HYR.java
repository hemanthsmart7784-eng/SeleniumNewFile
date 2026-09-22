package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYR {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Hemanth");
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.id("lastName"));
		Lname.sendKeys("Gundepalli");
		Thread.sleep(2000);

		driver.findElement(By.id("malerb")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		
		WebElement hindi = driver.findElement(By.id("hindichbx"));
		hindi.click();
		Thread.sleep(2000);
		if(hindi.isSelected()) {
			hindi.click();
			Thread.sleep(2000);
		}
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9100357740");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("7784");
		Thread.sleep(2000);
		
		driver.findElement(By.id("registerbtn")).click();
		
		WebElement txt = driver.findElement(By.id("msg"));
		String S = txt.getText();
		System.out.println(S);
		Thread.sleep(2000);
		
		driver.findElement(By.id("navigateHome")).click();
}
}
