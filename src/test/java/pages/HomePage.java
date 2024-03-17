package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
	public By privacyAcceptButton = By.xpath("//*[@text=\"I READ & I ACCEPT\"]");
	
	public By electronicsOption = By.xpath("//*[@text=\"Electronics\"]");
	
	public By ourCategories = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvTitle\" and @text=\"OUR CATEGORIES\"]");
	
	

}
