package TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintingOnlyRequiredTestcases {
	@Test(groups= {"Smok"})
	public void num1() {
		System.out.println("num1");
	}
	
	@Test
	public void num2() {
		System.out.println("num2");
	}
	
	@BeforeTest(groups= {"Smok"})
	public void num3() {
		System.out.println("num3");
	}
	
	@Test(groups= {"Smok"})
	public void num4() {
		System.out.println("num4");
	}
}
