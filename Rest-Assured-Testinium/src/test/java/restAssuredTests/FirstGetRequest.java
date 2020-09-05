package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstGetRequest {

    // İlk Get Sorgusu.

    @Test
    public void getRequest1(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        given()

        .when()
                .get("/api/users?page=2")
        .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("page",equalTo(2))
                .assertThat().body("total",equalTo(12))
                .log().all();

    }
}
