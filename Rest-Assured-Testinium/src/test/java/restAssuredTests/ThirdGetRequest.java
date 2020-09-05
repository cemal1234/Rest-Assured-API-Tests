package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ThirdGetRequest {

    // Üçüncü Get Sorgusu.

    @Test
    public void getRequest3(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        given()

                .when()
                .get("/api/users/23")
                .then()
                .statusCode(200) // Response 400 . Hata vermeli.
                .statusLine("HTTP/1.1 200 OK")
                .log().all();
    }
}
