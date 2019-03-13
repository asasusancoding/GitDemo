package cucumberoptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
	features= "src/test/java/featurefile",
			glue="stepDefinitions")

public class testrunner {

}
