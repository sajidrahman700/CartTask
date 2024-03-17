package utilities;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;

public class DriverSetup {
	
private static final ThreadLocal<AndroidDriver>  LOCAL_BROWSER = new ThreadLocal<>();
    
    
    public static void setBrowser(AndroidDriver browser) {
        LOCAL_BROWSER.set(browser);
    }

    public static AndroidDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }


    public static AndroidDriver setUp() throws MalformedURLException{
    	    //File path = new File("src\\test\\java\\resources");
	        //File apk = new File(path, "nopstationCart.apk");
	        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	        //desiredCapabilities.setCapability("appium:deviceName", "local2");
	        desiredCapabilities.setCapability("appium:udid", "0666125197100696");
	        desiredCapabilities.setCapability("platformName", "android");
	        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
	        desiredCapabilities.setCapability("appium:appPackage", "com.nopstation.nopcommerce.nopstationcart");
	        desiredCapabilities.setCapability("appium:appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
	        //desiredCapabilities.setCapability("app", apk.getAbsolutePath());
	        URL url = new URL("http://127.0.0.1:4723");
	        return new AndroidDriver(url, desiredCapabilities);
	        
    }

    
    
    public static void openABrowser() throws MalformedURLException{
        AndroidDriver browser = setUp();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        setBrowser(browser);
    }

    
    public static void quiteBrowser(Scenario scenario){
    	takeScreenShotOnTestFailed(scenario);
        getBrowser().quit();
    }
    
    public static void takeScreenShotOnTestFailed(Scenario scenario) {
    	if (scenario.isFailed()){
            String name = scenario.getName().replaceAll(" ", "_");
            byte[] source =  ((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(source, "image/png", name);
        }
    	
    	
    	
    }
	

}
