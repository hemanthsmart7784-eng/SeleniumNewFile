package RahulShettyAcademy;

import java.security.Key;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Child_Window_Titles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// getting all links present in the page
		System.out.println("Overall linke :" + driver.findElements(By.tagName("a")).size());
		
		// getting footer links only
		WebElement footersection = driver.findElement(By.id("gf-BIG"));
		System.out.println("Links in footer section :" + footersection.findElements(By.tagName("a")).size());
		
		// Now links present in vertical in footersection
		WebElement colomndriver = footersection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		// now links present in first colomn in footer section
		System.out.println("In footer section colomn1 :"+colomndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<colomndriver.findElements(By.tagName("a")).size();i++) {
			//to click the key control+enter so that window will open in new tab
			String control_Enter = Keys.chord(Keys.CONTROL,Keys.ENTER);
			colomndriver.findElements(By.tagName("a")).get(i).sendKeys(control_Enter);
		}
		Set<String>abc= driver.getWindowHandles();
		Iterator <String> it= abc.iterator();
		int i=1;
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println( i+":"+driver.getTitle());
			i++;
		}
	}

}
