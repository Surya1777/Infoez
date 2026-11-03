package runner;


import org.junit.AfterClass; 
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import base.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/java/features",
    glue = "steps",
    tags = "@automation",
    dryRun = false,
    monochrome = true,
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/Cucumber.json",
    }
)

public class Testrunner extends Baseclass {

    @BeforeClass
    public static void setup() {
        browserLaunch();
        maximize();
    }

    @AfterClass
    public static void end() {
        //driver.quit();
    }
}