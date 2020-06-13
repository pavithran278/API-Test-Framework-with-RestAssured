package steps;

import cucumber.api.java.Before;
import util.ReadEndPoint;
import util.RestAssuredExtension;

public class TestHook {
    @Before
    public void TestSetup(){
//        String URI = ReadEndPoint.getValue("URI");
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
    }
}
