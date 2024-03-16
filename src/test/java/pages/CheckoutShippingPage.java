package pages;

import org.openqa.selenium.By;

public class CheckoutShippingPage extends BasePage{
	
	public By nextDayAirOption = By.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]");
	public By continueButton = By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]");

}
