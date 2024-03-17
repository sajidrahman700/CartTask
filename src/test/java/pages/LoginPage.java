package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public By email = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/loginEmailEditText\"]");
	public By password = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/loginPasswordEditText\"]");
	public By loginButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/loginButton\"]");
	
	public By newCustomerOption = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvNewCustomer\"]");

}
