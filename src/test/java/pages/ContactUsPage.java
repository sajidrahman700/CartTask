package pages;

import org.openqa.selenium.By;

public class ContactUsPage extends BasePage {
	
	public By nameField = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etName\"]");
	public By emailField = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]");
	public By enquiryField = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEnquiry\"]");
	public By submitButton = By.xpath("//*[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnSubmit\"]");

}
