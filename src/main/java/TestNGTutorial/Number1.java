package TestNGTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Number1 {
	
@Parameters({"URL"})
@Test	
public void num1(String urlname) {
	System.out.println("hello");
	System.out.println(urlname);
}
}
