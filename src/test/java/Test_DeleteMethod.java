import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_DeleteMethod {
	
	@Test
	public void test01()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RestAssured.given().when().delete().then().log().all().statusCode(204);
	}

}
