package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");
     Thread.sleep(1000);
     driver.findElement(By.className("gLFyf")).sendKeys("hyr tutorials");
     Thread.sleep(3000);
     driver.findElement(By.className("gLFyf")).submit();
     Thread.sleep(1000);
     driver.navigate().to("https://www.youtube.com/watch?v=AlXdRMwILe0&list=PLz8gl4BEGkEFvaUosFYj3PUca2zrstNaD&index=12");
     Thread.sleep(1000);
     driver.navigate().to("https://www.youtube.com/shorts/EfPzH6gze10");
     Thread.sleep(1000);
     driver.navigate().back(); 
     Thread.sleep(1000);
     driver.navigate().refresh();
     Thread.sleep(1000);
     driver.navigate().forward();
     Thread.sleep(4000);
     
   driver.quit();
     

     }

}
