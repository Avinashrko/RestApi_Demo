import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PlaceOrder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			RestAssured.baseURI = "https://petstore.swagger.io/v2/store/order";
			Response resp = given().log().all().header("Content-Type","application/json")
					.body("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"petId\": 8989,\r\n"
					+ "  \"quantity\": 0,\r\n"
					+ "  \"shipDate\": \"2023-03-15T09:21:50.970Z\",\r\n"
					+ "  \"status\": \"placed\",\r\n"
					+ "  \"complete\": true\r\n"
					+ "}").
			when().log().all().post().
			then().assertThat().statusCode(200).extract().response();
			//JsonPath js = new JsonPath(resp);

			System.out.println(resp.getStatusCode()+" "+resp.getTime());

	}

}
