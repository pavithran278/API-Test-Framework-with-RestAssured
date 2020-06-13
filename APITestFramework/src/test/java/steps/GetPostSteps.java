package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import util.ReadEndPoint;
import util.RestAssuredExtension;

import static org.junit.Assert.assertEquals;

public class GetPostSteps {

    private static Response response;
    public static String SearchEndpoint=ReadEndPoint.getEndPoint("search");


    @Then("verify {string} value is {int}")
    public void checkValueIs(String Key, int value) throws Throwable {
        assertEquals(response.getBody().jsonPath().get(Key),value);
    }

    @Given("for the {string} {string}")
    public void performGETOperationFor(String parameter, String value) throws Throwable {
        response = RestAssuredExtension.GetOps(SearchEndpoint,parameter, value);
    }

    @When("the GET request returns status {int}")
    public void theGETRequestReturnsStatus(int status) throws Throwable {
        assertEquals(response.getStatusCode(),status);
    }

}
