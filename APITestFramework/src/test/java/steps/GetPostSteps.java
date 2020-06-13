package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import util.ReadEndPoint;
import util.RestAssuredExtension;

import static org.junit.Assert.assertEquals;

public class GetPostSteps {

    private static Response response;

    @Given("^Perform GET operation for \"([^\"]*)\" \"([^\"]*)\" to get \"([^\"]*)\"$")
    public void performGETOperationForToGet(String parameter, String value, String Path) throws Throwable {
        String Endpoint=ReadEndPoint.getEndPoint(Path);
        response = RestAssuredExtension.GetOps(Endpoint,parameter, value);
    }

    @Then("^Check \"([^\"]*)\" value is \"([^\"]*)\"$")
    public void checkValueIs(String Key, String value) throws Throwable {
        assertEquals(response.getBody().jsonPath().get(Key).toString(),value);
    }
}
