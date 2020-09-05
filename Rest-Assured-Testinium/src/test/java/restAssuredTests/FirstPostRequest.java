package restAssuredTests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FirstPostRequest {

    public static HashMap map = new HashMap();

    // İlk Post Sorgusu.

    @BeforeClass
    public void postdata(){
        map.put("name", RestUtils.getFirstEmail());
        map.put("job", RestUtils.getFirstPassword());

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";
        RestAssured.basePath = "/api/users";
    }
    @Test
    public void postRequest1(){

        given()
                .contentType("application/json")
                .body(map)
        .when()
                .post()
        .then()
                .statusCode(201)
                .log().all();
    }

}
