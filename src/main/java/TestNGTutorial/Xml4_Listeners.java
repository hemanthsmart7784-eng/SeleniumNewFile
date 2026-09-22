package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Xml4_Listeners {

	@Test
    public void S1() {
        System.out.println("Test Case1: 1");
    }
	@Test
    public void S2() {
        System.out.println("Test Case2: 1 2");
        Assert.assertTrue(false);
    }
	@Test
    public void S3() {
        System.out.println("Test Case3: 1 2 3");
    }
	@Test
    public void S4() {
        System.out.println("Test Case4: 1 2 3 4");
    }
}
