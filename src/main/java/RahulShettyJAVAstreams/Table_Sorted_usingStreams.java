package RahulShettyJAVAstreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Table_Sorted_usingStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opening browser and getting page
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//clicking header to give sorted order
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capturing all webelements into List
		List<WebElement>elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capturing text of all webelements into new original list
		List<String>originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//original list sorting using streams
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//compare two lists using assertions
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		//find pri ce of beans
		List<String> price= elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getVeggies(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));//
		
		List<String> pricesss;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		pricesss = rows.stream().filter(s-> s.getText().contains("Rice"))

		.map(s -> getVeggies(s)).collect(Collectors.toList());


		pricesss.forEach(a -> System.out.println(a));

		if(pricesss.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(pricesss.size()<1);



		}


		
	

	private static String getVeggies(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
