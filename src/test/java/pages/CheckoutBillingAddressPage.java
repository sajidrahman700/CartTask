package pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;

public class CheckoutBillingAddressPage extends BasePage{
	
	public By firstNameInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFirstName\"]");
	public By lastNameInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etLastName\"]");
	public By emailInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etEmail\"]");
	public By countrySelectField = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/countrySpinner\"]");
	public By chooseCountry_Bangladesh = By.xpath("//*[@text=\"Bangladesh\"][1]");
	public By stateSelectField = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]");
	public By chooseState_Dhaka = By.xpath("//*[@text=\"ঢাকা\"]");
	public By companyInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCompanyName\"]");
	public By cityInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etCity\"]");
	public By streetAddressInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress\"]");
	public By streetAddress2InputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2\"]");
	public By postalCodeInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etZipCode\"]");
	public By phoneNumberInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etPhone\"]");
	public By faxInputField = By.xpath("//android.widget.EditText[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/etFax\"]");
	public By continueButton = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"]");

	@SuppressWarnings("resource")
	public static String[][] getData(String filePath)throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        String line;
	        int rowCount = 0;
	        int colCount = 0;

	        
	        while ((line = reader.readLine()) != null) {
	            rowCount++;
	            String[] columns = line.split(",");
	            colCount = Math.max(colCount, columns.length);
	        }

	        String[][] data = new String[rowCount][colCount];
	        reader = new BufferedReader(new FileReader(filePath));
	        int row = 0;

	        while ((line = reader.readLine()) != null) {
	            String[] columns = line.split(",");
	            for (int col = 0; col < columns.length; col++) {
	                data[row][col] = columns[col];
	            }
	            row++;
	        }

	        reader.close();
	        return data;
	    }


	
	

}
