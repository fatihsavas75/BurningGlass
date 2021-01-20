package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        glue = "stepDefinitions",
        features = "src/test/resources/features",
        tags = "@smoke",
        dryRun = false
)
public class CukesRunner {
}
