package Automation.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = {"Automation.bdd.stepDefinitions"},
        features = "target/rerun.txt", //Cucumber picks the failed scenarios from this file
        plugin = {"pretty",
                "html:target/site/cucumber-party",
                "json:target/cucumber.json"
        }
)

public class FailedScenarios {
}
