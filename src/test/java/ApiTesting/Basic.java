package ApiTesting;


import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Basic {

	public static void main(String[] args) {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String res = given().log().all().header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"id\": 11,\r\n"
				+ "    \"name\": \"Rakesh Dhawan Latest123\",\r\n"
				+ "    \"email\": \"lld_rakesh_dhawan@cassin.test\",\r\n"
				+ "    \"gender\": \"male\",\r\n"
				+ "    \"status\": \"active\"\r\n"
				+ "}").when().post("/users")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		System.out.println("thisssss"+res);
		JsonPath js = new JsonPath (res);
		String email=js.get("email");
		System.out.println("email is : "+email);
		
	}

	

}

