package restAssuredTests;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class FinalGetRequest {

    // Beşinci Get Sorgusu.
    // Get Sorgusu ile elde edilen değer kullaniliyor.

    @Test
    public void getRequest5(){

        RestAssured.baseURI = "http://usersdemo.herokuapp.com";

        RequestSpecification httpRequests=RestAssured.given();
        Response response = httpRequests.request(Method.GET,"/api/unknown");

        JsonPath jsonPath=response.jsonPath();
        Integer totalPages2 = jsonPath.get("total_pages");

        System.out.println("İki Farklı Response'dan alinan değerler karşılaştırılıyor..."+"\n");

        System.out.println("/api/unknown : " + totalPages2);
        System.out.println("/api/users?page=2 : " + FourthGetRequest.sendInfo());

        if(totalPages2==FourthGetRequest.sendInfo()){
            System.out.println("Total Pages Değerleri Aynı.");
        }
        else {
            System.out.println("Total Pages Değerleri Aynı Değil !!");
        }

    }
}
