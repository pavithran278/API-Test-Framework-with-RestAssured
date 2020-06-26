package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failedTest.txt",
        glue = {"steps"},
        plugin = {"json:target1/Result.json",
                "rerun:target1/failedTest.txt"},
        monochrome = true
)

public class TestRunnerFailed {
}
