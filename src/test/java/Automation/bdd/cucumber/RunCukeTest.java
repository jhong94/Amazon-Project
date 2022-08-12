package Automation.bdd.cucumber;

import gherkin.formatter.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true, // display the console output in a proper readable format
        features = {"src/test/java/Automation/bdd/features"}, // the path of the feature file and runs in order
        glue = {"Automation.bdd.stepDefinitions"}, // the path of the step definition file
//        tags={"@Positive", "@Negative"}, //"@Positive", "@Regression, @SmokeTest"
        plugin = {
                "pretty",
                "html:output/cucumber",
                "json:output/cucumber/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:",
                "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class RunCukeTest {

}