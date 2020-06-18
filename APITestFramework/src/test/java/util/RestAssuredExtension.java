package util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import steps.TestHook;

import static io.restassured.RestAssured.given;

public class RestAssuredExtension extends TestHook {
    static RequestSpecification Request;
    static Response response;

    public RestAssuredExtension() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setContentType(ContentType.JSON);
        RequestSpecification requestSpec = builder.build();
        Request = given().spec(requestSpec);
    }

    public static Response GetOps(String url, String parameter, String value) {
        Request.queryParam(parameter, value);
        response = Request.get(url);
        return response;
    }

    public static Response PostOps(String registrationEndpoint, JSONObject json) {
        Request.body(json.toJSONString());
        response = Request.post(registrationEndpoint);
        return response;
    }

    public static Response PostOps(String registrationEndpoint, String json) {
        Request.body(json);
        response = Request.post(registrationEndpoint);
        return response;
    }
}
