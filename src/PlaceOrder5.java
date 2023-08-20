import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PlaceOrder5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://petstore.swagger.io";
		String resp = given().log().all().header("Content-Type", "application/json").
		when().log().all().get("v2/store/order/7").then().assertThat().statusCode(200).extract().response().asString();
	
		
		System.out.println(resp);
		JsonPath js =new JsonPath(resp);
		//System.out.println(js.getInt("id"));

		int id = js.get("petId");
	    if(id==111)
	    	System.out.println("petid is correct");
	    Assert.assertEquals(id, 111);
		
	}

}
