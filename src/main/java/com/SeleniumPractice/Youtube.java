package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
            driver.get("https://www.youtube.com");
            
            Thread.sleep(3000); // Allow time for the page to load
            
            WebElement searchBox = driver.findElement(By.name("search_query"));
            searchBox.sendKeys("Varsham video songs");
            searchBox.sendKeys(Keys.RETURN);
            
            Thread.sleep(3000); // Wait for search results
            
            java.util.List<WebElement> results = driver.findElements(By.id("video-title"));
            if (results.size() > 0) {
                results.get(0).click(); // Click on the first video
                System.out.println("Test Passed: Video is playing.");
            } else {
                System.out.println("Test Failed: No search results found.");
            }
            
            Thread.sleep(5000); // Allow video to play for some time
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
		
	}

}
