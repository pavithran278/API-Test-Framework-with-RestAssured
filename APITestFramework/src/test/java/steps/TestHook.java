package steps;

import io.cucumber.java.Before;
import util.RestAssuredExtension;

public class TestHook {
    @Before
    public void TestSetup() {
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();

    }
}
