import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://petstore.swagger.io/v2/store/order/7";
		Response resp = given().log().all().header("Content-Type", "application/json").
		when().log().all().delete().then().assertThat().statusCode(200).extract().response();
	
		System.out.println(resp.getStatusCode());
	}

}
