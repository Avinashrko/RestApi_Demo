import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PlaceOrder {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://petstore.swagger.io/v2/store/order";
		String resp = given().log().all().header("Content-Type","application/json")
				.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"petId\": 8989,\r\n"
				+ "  \"quantity\": 0,\r\n"
				+ "  \"shipDate\": \"2023-03-15T09:21:50.970Z\",\r\n"
				+ "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}").
		when().log().all().post().
		then().assertThat().statusCode(200).extract().asString();
		
		JsonPath js = new JsonPath(resp);
      System.out.println(js.getString("petId"));
	}

}
