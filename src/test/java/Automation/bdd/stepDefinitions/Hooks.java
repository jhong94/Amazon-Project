package Automation.bdd.stepDefinitions;

import Automation.utils.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

public class Hooks extends TestBase {
    @Before
    public void beforeScenario() throws MalformedURLException, InterruptedException {
        createDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }
        tearDown();
    }

}