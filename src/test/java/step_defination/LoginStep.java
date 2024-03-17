package step_defination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ToolBarPage;

public class LoginStep {
	
	HomePage homePage = new HomePage();
	ToolBarPage toolBarPage =  new ToolBarPage();
	AccountPage accountPage = new AccountPage();
	LoginPage loginPage = new LoginPage();
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		homePage.clickOnElement(homePage.privacyAcceptButton);
		toolBarPage.clickOnElement(toolBarPage.accountOption);
		accountPage.clickOnElement(accountPage.accountInfo);
	
	}

	@When("User enter email on the Email Field")
	public void user_enter_email_on_the_email_field() {
		loginPage.writeOnAElement(loginPage.email, "thank@gmail.com");
	   
	}

	@When("User enter password on the password Field")
	public void user_enter_password_on_the_password_field() {
		loginPage.writeOnAElement(loginPage.password, "12345678");
	   
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		loginPage.clickOnElement(loginPage.loginButton);
	   
	}

	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
		Assert.assertTrue(homePage.getElement(homePage.ourCategories).isDisplayed());
	   
	}

	@Then("User should still on the login page")
	public void user_should_on_the_login_page() {
		Assert.assertTrue(loginPage.getElement(loginPage.newCustomerOption).isDisplayed());
	    
	}
	
	@When("User enter {string} on the Email Field")
	public void user_enter_on_the_email_field(String string) {
		loginPage.writeOnAElement(loginPage.email, string);
	    
	}

	@When("User enter {string} on the password Field")
	public void user_enter_on_the_password_field(String string) {
		loginPage.writeOnAElement(loginPage.password, string);
	   
	}
	
	

}
