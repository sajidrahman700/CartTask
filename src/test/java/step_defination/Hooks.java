package step_defination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utilities.DriverSetup.openABrowser;
import static utilities.DriverSetup.quiteBrowser;

import java.net.MalformedURLException;

public class Hooks {
	 @Before
	    public void startBrowser() throws MalformedURLException{
	        openABrowser();
	    }

	    @After
	    public void closeBrowser(Scenario scenario){
	        quiteBrowser(scenario);
	    }

}
