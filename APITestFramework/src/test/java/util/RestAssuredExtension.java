package util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import steps.TestHook;

import static io.restassured.RestAssured.given;

public class RestAssuredExtension extends TestHook {
    static RequestSpecification Request;
    public RestAssuredExtension() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setContentType(ContentType.JSON);
        RequestSpecification requestSpec=builder.build();
        Request = given().spec(requestSpec);
    }

    public static Response GetOps(String url,String parameter, String value){
        Response response;
        Request.queryParam(parameter,value);
        response=Request.get(url);
        return response;
    }
}
