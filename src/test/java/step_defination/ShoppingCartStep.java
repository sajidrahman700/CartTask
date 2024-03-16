package step_defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStep {
	
	@Given("Mike on home page after opening nopCart mobile app")
	public void mike_on_home_page_after_opening_nop_cart_mobile_app() {
	  
	}

	@When("Mike click {string} from {string} list from home page")
	public void mike_click_from_list_from_home_page(String string, String string2) {
	    
	}

	@And("Mike click to {string} product details page")
	public void mike_click_to_product_details_page(String string) {
	   
	}

	@And("Mike click plus button to increase Qty by {string}")
	public void mike_click_plus_button_to_increase_qty_by(String string) {
	    
	}

	@Then("Mike click add to cart button to add the product in his cart")
	public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() {
	    
	}

}
