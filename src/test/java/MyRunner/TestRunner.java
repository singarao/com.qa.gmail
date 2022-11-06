package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\singaraomaddineni\\Desktop\\Automation\\com.qa.gmail\\src\\test\\resources\\features\\launchMultipleBrowsers.feature",
		glue= {"tests"},
		monochrome=true)
public class TestRunner {

}
