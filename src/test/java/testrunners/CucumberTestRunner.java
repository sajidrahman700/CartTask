package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "step_defination",
        plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/"}
        )


public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	    @DataProvider(parallel = false)
	    @Override
	    public Object[][] scenarios(){
	        return super.scenarios();
	    }

	

}
