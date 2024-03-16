package pages;

import org.openqa.selenium.By;

public class CheckoutBillingAddressPage extends BasePage{
	
	public By firstNameInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFirstName\"]");
	public By lastNameInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etLastName\"]");
	public By emailInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]");
	public By countrySelectField = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/countrySpinner\"]");
	public By chooseCountry_Bangladesh = By.xpath("//android.widget.ListView/android.widget.TextView[9]");
	public By stateSelectField = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]");
	public By chooseState_Dhaka = By.xpath("//android.widget.ListView/android.widget.TextView[2]");
	public By companyInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCompanyName\"]");
	public By cityInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCity\"]");
	public By streetAddressInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress\"]");
	public By streetAddress2InputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2\"]");
	public By postalCodeInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etZipCode\"]");
	public By phoneNumberInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etPhone\"]");
	public By faxInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFax\"]");
	public By continueButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"]");
	
	

}
