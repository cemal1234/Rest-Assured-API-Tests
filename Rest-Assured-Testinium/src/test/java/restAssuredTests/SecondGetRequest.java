package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class SecondGetRequest {

    // İkinci Get Sorgusu.

    @Test
    public void getRequest2(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        given()

                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .log().all();

    }
}
