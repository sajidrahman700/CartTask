package pages;

import org.openqa.selenium.By;

public class OrderConfirmPage extends BasePage {
	
	public By confirmButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"]");
	public By popUpMsg = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_text_message\"]");
	public By orderDetails = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_button_negative\"]");

}
