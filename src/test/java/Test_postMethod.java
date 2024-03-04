import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_postMethod {
	
	@Test
	public void test01()
	{
		JSONObject jsondata=new JSONObject();
		jsondata.put("name", "tanuja");
		jsondata.put("job", "QA");
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RestAssured.given().header("Content-type", "application/json").contentType(ContentType.JSON).body(jsondata.toJSONString()).
		when().post().
		then().statusCode(201).log().all();
}
}