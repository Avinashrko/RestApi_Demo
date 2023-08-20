import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PlaceOrder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://petstore.swagger.io";
		String resp = given().log().all().header("Content-Type", "application/json").
		when().log().all().get("v2/store/order/6").then().assertThat().statusCode(200).extract().response().asString();
	
		System.out.println(resp);

	}

}
