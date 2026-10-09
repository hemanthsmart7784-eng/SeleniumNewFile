package ApiTesting;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ComplexJson {
	@Test
		public void complexJson() {
			JsonPath js= new JsonPath(PayloadForComplexJson.getpayload());
			int noOfCoures= js.getList("courses").size();
			System.out.println("noOfCourese :"+noOfCoures);
			int purchaseAmount = js.get("dashboard.purchaseAmount");
			System.out.println("purchaseAmount : "+purchaseAmount);
			String sample = js.get("courses[0].title");
			System.out.println("firstRowTitle : "+sample);
			System.out.println("Print All course titles and their respective Prices--------");
			for(int i=0;i<noOfCoures;i++) {
				String couseTitle = js.get("courses["+i+"].title");
				System.out.println(couseTitle);
				int coursePrice = js.get("courses["+i+"].price");
				System.out.println(coursePrice);
				System.out.println("---------------------");
				
			}
			for(int i=0;i<noOfCoures;i++) {
				String couseTitle = js.get("courses["+i+"].title");
				if (couseTitle.equals("RPA")) {
					int copies =  js.get("courses["+i+"].copies");
					System.out.println("copies by RPA "+copies);
					
				}
			}
			int allCrousePrices=0;
			for(int i=0;i<noOfCoures;i++) {
			 int crousePrices = js.getInt("courses["+i+"].price");
			 int crouseCopies = js.getInt("courses["+i+"].copies");
			 allCrousePrices =allCrousePrices +(crouseCopies*crousePrices);
				
			}
			System.out.println("allCrousePrices :"+allCrousePrices);
			Assert.assertEquals(purchaseAmount, allCrousePrices);;
		
		}

}
