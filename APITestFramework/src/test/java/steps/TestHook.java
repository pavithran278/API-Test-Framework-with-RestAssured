package steps;

import io.cucumber.java.Before;
import util.ReadEndPoint;
import util.RestAssuredExtension;

import java.net.URI;

public class TestHook {

    @Before
    public void TestSetup(){
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();

    }
}
