package step_defination;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutBillingAddressPage;
import pages.CheckoutPaymentPage;
import pages.CheckoutShippingPage;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.OrderConfirmPage;
import pages.PaymentInformationPage;
import pages.ProductDetailsPage;
import pages.ShoppingCartPage;
import pages.ToolBarPage;

public class PlaceOrderStep {
	HomePage homePage = new HomePage();
	ElectronicsPage electronicsPage = new ElectronicsPage();
	ProductDetailsPage productDetailsPage =  new ProductDetailsPage();
	ToolBarPage toolBarPage =  new ToolBarPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	CheckoutBillingAddressPage checkoutBillingAddressPage = new CheckoutBillingAddressPage();
	CheckoutShippingPage checkoutShippingPage = new CheckoutShippingPage();
	CheckoutPaymentPage checkoutPaymentPage = new CheckoutPaymentPage();
	PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
	OrderConfirmPage orderConfirmPage = new OrderConfirmPage();
	
	
	 @SuppressWarnings("resource")
	public static String[][] readCSVData(String filePath)throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader("src\\test\\java\\resources\\NopStationCart.csv"));
	        String line;
	        int rowCount = 0;
	        int colCount = 0;

	        
	        while ((line = reader.readLine()) != null) {
	            rowCount++;
	            String[] columns = line.split(",");
	            colCount = Math.max(colCount, columns.length);
	        }

	        String[][] data = new String[rowCount][colCount];
	        reader = new BufferedReader(new FileReader("src\\test\\java\\resources\\NopStationCart.csv"));
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

	
	
	
	@Given("product add to cart")
	public void product_add_to_cart() {
		homePage.clickOnElement(homePage.privacyAcceptButton);
		homePage.scrollInHorizontalAppium("Electronics");
		homePage.clickOnElement(homePage.electronicsOption);
		electronicsPage.scrollInToViewAppium("Mattress Bedroom");
		electronicsPage.clickOnElement(electronicsPage.MattressBedroom);
		productDetailsPage.scrollInToViewAppium("+");
		productDetailsPage.clickOnElement(productDetailsPage.plusButton);
		productDetailsPage.clickOnElement(productDetailsPage.addToCartButton);
	}
	
	@Given("Mike go to shopping cart by clicking top cart icon")
	public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() {
		toolBarPage.clickOnElement(toolBarPage.shoppingCart);
	
	}

	@When("Mike click checkout button from shopping cart page")
	public void mike_click_checkout_button_from_shopping_cart_page() {
		shoppingCartPage.clickOnElement(shoppingCartPage.checkoutButton);
	  
	}

	@When("Mike select checkout as guest from shopping cart page")
	public void mike_select_checkout_as_guest_from_shopping_cart_page() {
		shoppingCartPage.clickOnElement(shoppingCartPage.checkoutAsGuestButton);
	   
	}

	@Then("Mike input all the details in checkout billing details page and click continue")
	public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() {
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.firstNameInputField, "Sajid");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.lastNameInputField, "Rahman");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.emailInputField, "Hello@gmail.com");
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.countrySelectField);
		checkoutBillingAddressPage.scrollInToViewAppium("Bangladesh");
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.chooseCountry_Bangladesh);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.stateSelectField);
		checkoutBillingAddressPage.scrollInToViewAppium("ঢাকা");
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.chooseState_Dhaka);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.companyInputField, "Hello");
		checkoutBillingAddressPage.scrollInToViewAppium("Fax");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.cityInputField, "Dhaka");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.streetAddressInputField, "Road#12");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.streetAddress2InputField, "House#15");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.postalCodeInputField, "1209");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.phoneNumberInputField, "01200000000");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.faxInputField, "2307");
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.continueButton);
	    
	}

	@Then("Mike select Next Day Air as shipping method and click continue")
	public void mike_select_as_shipping_method_and_click_continue() {
		checkoutShippingPage.clickOnElement(checkoutShippingPage.nextDayAirOption);
		try {
		checkoutShippingPage.scrollInToViewAppium("The two day air shipping");
		}
		catch(Exception e) {
			
		}
		checkoutShippingPage.clickOnElement(checkoutShippingPage.continueButton);
	    
	}

	@Then("Mike select Check Money Order as payment method and click continue")
	public void mike_select_as_payment_method_and_click_continue() {
		checkoutPaymentPage.scrollInToViewAppium("PayPal Smart Payment Buttons");
		//checkoutPaymentPage.scrollInToViewAppium("Pay by cheque or money order");
		checkoutPaymentPage.clickOnElement(checkoutPaymentPage.check_MoneyOrder);
		//checkoutPaymentPage.scrollInToViewAppium("PayPal Smart Payment Buttons");
		checkoutPaymentPage.clickOnElement(checkoutPaymentPage.continueButton);
	    
	}

	@Then("Mike click next button on payment information page")
	public void mike_click_next_button_on_payment_information_page() {
		paymentInformationPage.clickOnElement(paymentInformationPage.nextButton);
		
	}

	@Then("Mike click confirm button to place the order")
	public void mike_click_confirm_button_to_place_the_order() {
		orderConfirmPage.clickOnElement(orderConfirmPage.confirmButton);
	    
	}

	@Then("Verify order place successfully with popup message Your order has been successfully processed!")
	public void verify_order_place_successfully_with_popup_message() {
		Assert.assertEquals(orderConfirmPage.getMsgSubString(), "Your order has been successfully processed!\r\n");


	}

}
