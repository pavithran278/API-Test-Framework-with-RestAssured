package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/feature",
        glue= {"stepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)

public class TestRunner {
}
