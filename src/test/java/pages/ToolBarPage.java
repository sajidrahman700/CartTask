package pages;

import org.openqa.selenium.By;

public class ToolBarPage extends BasePage{
	
	public By shoppingCart = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/counterIcon\"]");
	public By cartCounterText = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/counterText\"]");
	public By searchBar = By.xpath("//*[@content-desc=\"Search\"]");
	public By accountOption = By.xpath("//*[@content-desc=\"Account\"]");
	public By moreOption = By.xpath("//*[@content-desc=\"More\"]");
	

}
