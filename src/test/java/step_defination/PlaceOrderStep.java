package step_defination;


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
	public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() throws IOException {
		String[][] data = CheckoutBillingAddressPage.getData("src\\test\\java\\resources\\NopStationCart.csv");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.firstNameInputField, data[1][0]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.lastNameInputField, data[1][1]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.emailInputField, data[1][2]);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.countrySelectField);
		checkoutBillingAddressPage.scrollInToViewAppium(data[1][3]);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.chooseCountry_Bangladesh);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.stateSelectField);
		checkoutBillingAddressPage.scrollInToViewAppium(data[1][4]);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.chooseState_Dhaka);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.companyInputField, data[1][5]);
		checkoutBillingAddressPage.scrollInToViewAppium("Fax");
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.cityInputField, data[1][6]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.streetAddressInputField, data[1][7]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.streetAddress2InputField, data[1][8]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.postalCodeInputField, data[1][9]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.phoneNumberInputField, data[1][10]);
		checkoutBillingAddressPage.writeOnAElement(checkoutBillingAddressPage.faxInputField, data[1][11]);
		checkoutBillingAddressPage.clickOnElement(checkoutBillingAddressPage.continueButton);
	    
	}

	@Then("Mike select Next Day Air as shipping method and click continue")
	public void mike_select_as_shipping_method_and_click_continue() {
		
		try {
			checkoutShippingPage.clickOnElement(checkoutShippingPage.nextDayAirOption);
		    checkoutShippingPage.scrollInToViewAppium("The two day air shipping");
		    checkoutShippingPage.clickOnElement(checkoutShippingPage.continueButton);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	    
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
		Assert.assertEquals(orderConfirmPage.getMsgSubString(), "Your order has been successfully processed!\n");


	}

}
