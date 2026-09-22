package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement courseElement = driver.findElement(By.id("course"));
		Select S = new Select(courseElement); //Object and key letter Select
		
		List<WebElement> options = S.getOptions();  //to print all options in dropdown
		for(WebElement P : options) {
		
			System.out.println(P.getText());
			
		}
		
		S.selectByIndex(3);
		Thread.sleep(2000);
		S.selectByValue("js");
		Thread.sleep(2000);
		S.selectByVisibleText("Dot Net");
		Thread.sleep(2000);

		
		
		//multiselect dropdown
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver2=new ChromeDriver();
		//driver2.manage().window().maximize();
		//driver2.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement courseElement2 = driver.findElement(By.id("ide"));
		Select S2 = new Select(courseElement2); //Object and key letter Select
		
		List<WebElement> options2 = S2.getOptions();  //to print all options in dropdown
		for(WebElement P : options2) {
		
			System.out.println(P.getText());
			
		}
		S2.selectByIndex(0);
		Thread.sleep(2000);
		S2.selectByValue("ij");
		Thread.sleep(2000);
		S2.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		S2.deselectByIndex(1);
		Thread.sleep(2000);
		
		List<WebElement> idedrop = S2.getAllSelectedOptions();
		for(WebElement ideprint : idedrop) {
			System.out.println(ideprint.getText());
		}
		driver.quit();
	}

}
