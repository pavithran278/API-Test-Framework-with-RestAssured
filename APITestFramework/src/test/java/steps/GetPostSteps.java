package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import util.ReadEndPoint;
import util.ReadJsonString;
import util.RestAssuredExtension;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GetPostSteps {

    private static Response response;
    public static String SearchEndpoint = ReadEndPoint.getValue("search");
    public static String RegistrationEndpoint = ReadEndPoint.getValue("Registration");

    @Then("verify {string} value is {int}")
    public void checkValueIs(String Key, int value) throws Throwable {
        assertEquals(value, response.getBody().jsonPath().get(Key));
    }

    @Given("for the {string} {string}")
    public void performGETOperationFor(String parameter, String value) throws Throwable {
        response = RestAssuredExtension.GetOps(SearchEndpoint, parameter, value);
    }

    @When("the GET request returns status {int}")
    public void theGETRequestReturnsStatus(int status) throws Throwable {
        assertEquals(response.getStatusCode(), status);
    }

    @Given("for {string} with EmailId {string} create registration as {string} {string}")
    public void forWithEmailidCreateRegistrationAs(String Name, String EmailId, String UserName, String Password) {
        JSONObject Json = new JSONObject();
        Json.put("FirstName", Name.split(" ")[0]);
        Json.put("LastName", Name.split(" ")[1]);
        Json.put("UserName", UserName);
        Json.put("Password", Password);
        Json.put("Email", EmailId);
        response = RestAssuredExtension.PostOps(RegistrationEndpoint, Json.toString());
    }

    @Then("verify response with {string} as {string} or {string} as {string}")
    public void verifyResponseWithAsOrAs(String SuccessCode, String ExpectedSuccessValue, String FailureCode, String ExpectedFailureValue) {

        HashMap<String, String> jsonResponse = response.jsonPath().get("$");
        if (jsonResponse.containsKey(SuccessCode)) {
            assertEquals(jsonResponse.get(SuccessCode), ExpectedSuccessValue);
        } else if (jsonResponse.containsKey(FailureCode)) {
            assertEquals(jsonResponse.get(FailureCode), ExpectedFailureValue);
        } else {
            assertFalse(true);
        }
    }

    @Given("for given {string} create registration")
    public void forGivenCreateRegistration(String jsonFile) {
        String Json = ReadJsonString.getJsonString(jsonFile);
        response = RestAssuredExtension.PostOps(RegistrationEndpoint, Json);

    }

}
