package testRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/feature_Files"},
glue= {"stepDefinationFile"},
plugin= {"pretty","html:target/SwaglabReport.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
