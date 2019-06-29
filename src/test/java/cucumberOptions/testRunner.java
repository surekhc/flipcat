package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", monochrome=true,
        glue="stepDefinition", tags="@SortByLowPriceAndOrder",
		plugin= {"pretty","html:target/cucumber"})
public class testRunner {

}
