package restAssuredTests;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class FourthGetRequest {

    // Dördüncü Get Sorgusu.

    @Test
    public void getRequest4(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        RequestSpecification httpRequests=RestAssured.given();
        Response response = httpRequests.request(Method.GET,"/api/users?page=2");

        JsonPath jsonPath=response.jsonPath();
        Integer totalPages1 = jsonPath.get("total_pages");
        System.out.println("Total Pages : " + totalPages1);

    }

    public static Integer sendInfo(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        RequestSpecification httpRequests=RestAssured.given();
        Response response = httpRequests.request(Method.GET,"/api/users?page=2");

        JsonPath jsonPath=response.jsonPath();
        Integer firstPageTotal = jsonPath.get("total_pages");
        return firstPageTotal;
    }
}
