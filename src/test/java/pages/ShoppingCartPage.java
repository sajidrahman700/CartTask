package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{
	
	public By checkoutButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut\"]");
	public By checkoutAsGuestButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout\"]");
	

}
