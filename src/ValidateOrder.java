import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://petstore.swagger.io";
		String resp = given().log().all().header("Content-Type", "application/json").
		when().log().all().get("v2/store/inventory").then().assertThat().statusCode(200).extract().response().asString();
	
		System.out.println(resp);

	}

}
