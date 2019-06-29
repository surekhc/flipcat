package cucumberOptions;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition", tags = "@SampleTest")


public class testRunner {

}
