package step_defination;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ToolBarPage;

public class ShoppingCartStep {
	
	HomePage homePage = new HomePage();
	ElectronicsPage electronicsPage = new ElectronicsPage();
	ProductDetailsPage productDetailsPage =  new ProductDetailsPage();
	ToolBarPage toolBarPage =  new ToolBarPage();
	
	
	@Given("Mike on home page after opening nopCart mobile app")
	public void mike_on_home_page_after_opening_nop_cart_mobile_app() {
		homePage.clickOnElement(homePage.privacyAcceptButton);
	}

	@When("Mike click electronics from OUR CATEGORIES list from home page")
	public void mike_click_from_list_from_home_page() {
		homePage.scrollInHorizontalAppium("Electronics");
		homePage.clickOnElement(homePage.electronicsOption);
	    
	}

	@And("Mike click to Mattress Bedroom product details page")
	public void mike_click_to_product_details_page() {
		electronicsPage.scrollInToViewAppium("Mattress Bedroom");
		electronicsPage.clickOnElement(electronicsPage.MattressBedroom);
	   
	}

	@And("Mike click plus button to increase Qty by 2")
	public void mike_click_plus_button_to_increase_qty_by() {
		productDetailsPage.scrollInToViewAppium("+");
		productDetailsPage.clickOnElement(productDetailsPage.plusButton);
		
	}

	@Then("Mike click add to cart button to add the product in his cart")
	public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() {
		productDetailsPage.clickOnElement(productDetailsPage.addToCartButton);
		productDetailsPage.waitForElementToBeClickable(toolBarPage.cartCounterText);
		Assert.assertEquals(toolBarPage.getElementText(toolBarPage.cartCounterText), "2");
	}

}
