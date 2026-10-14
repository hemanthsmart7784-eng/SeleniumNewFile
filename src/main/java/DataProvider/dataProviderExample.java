package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {

	@DataProvider(name="data")
	public Object[][] getData() {
		return new Object[][] {{"a","1"},{"b","2"},{"c","3"}};
	}
	@Test(dataProvider="data")
	public void mytest(String str1,String str2) {
		System.out.println(str1+" "+str2);
		
	}
}
