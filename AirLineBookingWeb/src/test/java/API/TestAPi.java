package API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestAPi {
	String URL="https://randomuser.me/api";
	 @Test	
	 public void getManPassengerInfoRequest() {
			Response response= RestAssured.get(URL+"/?gender=male");
			System.out.println("Response Body: "+ response.getBody().asString());
			System.out.println("Status code is: "+ response.getStatusCode());
			System.out.println("Response time is: "+response.getTime());
			int statusCode=response.getStatusCode();
			Assert.assertEquals(statusCode, 200);
		}
	 
	 @Test	
	 public void getOldPassengerInfoRequest() {
			Response response= RestAssured.get(URL+"?age=67");
			System.out.println("Response Body: "+ response.getBody().asString());
			System.out.println("Status code is: "+ response.getStatusCode());
			System.out.println("Response time is: "+response.getTime());
			int statusCode=response.getStatusCode();
			Assert.assertEquals(statusCode, 200);
		}
}
