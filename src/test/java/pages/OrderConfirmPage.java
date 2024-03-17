package pages;

import org.openqa.selenium.By;

public class OrderConfirmPage extends BasePage {
	
	public By confirmButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/checkoutButton\"]");
	public By popUpMsg = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_text_message\"]");
	public By orderDetails = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_button_negative\"]");

	public String getMsgSubString() {
		String text = getElementText(popUpMsg);
		String substring = text.substring(0, text.indexOf("Order Number"));
		return substring;

	}
}
