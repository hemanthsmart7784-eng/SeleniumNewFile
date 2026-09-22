package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XML3 {


    @Test
    public void S1() {
        System.out.println("S2");
    }
    
    @Parameters({"URL"})
    @Test
    public void S2(String urlname) {
        System.out.println(urlname);
    }

    
    @Test
    public void S3() {
        System.out.println("Before Test");
    }
    @Test
    public void S4() {
        System.out.println("After Test");
    }

    //class
    @BeforeClass
    public void S5() {
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    
    //method
    @BeforeMethod
    public void S6() {
        System.out.println("Before Method");
    }    
    @AfterMethod
    public void S7() {
        System.out.println("After Method");
    }

    
    @Test
    public void S8() {
        System.out.println("Test Case 1");
    }
    @Test
    public void S9() {
        System.out.println("Test Case 2");
    }



  

}
