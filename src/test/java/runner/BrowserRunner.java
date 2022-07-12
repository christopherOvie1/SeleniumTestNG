package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		
		features= "/src/main/java/com/webdriver/browserfunction/BrowserFunction.feature",
		glue= "com.api.webdriver.stepDef"
		)
public class BrowserRunner extends AbstractTestNGCucumberTests{

}
