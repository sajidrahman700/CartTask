package pages;

import org.openqa.selenium.By;

public class checkoutPaymentPage extends BasePage {
	public By check_MoneyOrder = By.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[3]");
	public By continueButton = By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]");
	

}
