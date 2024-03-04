import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test_GetMethod {
	
	@Test
	public void test01()
	{
		Response response=RestAssured.get("https://reqres.in/api/users?page=26");
		System.out.println("Response Code:" +  response.getStatusCode());
		System.out.println("Response Body:" + response.getBody());
		System.out.println("Response Time:" + response.getTime());
		System.out.println("Response Header:" + response.getHeader("Content-Type"));
		
		
		int expectedStatuscode=200;
		int statuscode=response.getStatusCode();
		Assert.assertEquals(expectedStatuscode, statuscode);
	}
	
	@Test
	public void test02()
	{
		baseURI="https://reqres.in/api/users";
		given().queryParam("page", "2").when().get().then().statusCode(200);
		
	}
}

