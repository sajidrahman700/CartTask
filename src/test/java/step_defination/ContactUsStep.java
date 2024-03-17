package step_defination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;
import pages.MorePage;
import pages.ToolBarPage;

public class ContactUsStep {
	
	HomePage homePage = new HomePage();
	ToolBarPage toolBarPage =  new ToolBarPage();
	MorePage morePage = new MorePage();
	ContactUsPage contactUsPage = new ContactUsPage();
	
	@Given("User is on the More Page")
	public void user_is_on_the_more_page() {
		homePage.clickOnElement(homePage.privacyAcceptButton);
		toolBarPage.clickOnElement(toolBarPage.moreOption);
	   
	}

	@Given("User click on the Contact Us option")
	public void user_click_on_the_contact_us_option() {
	    morePage.clickOnElement(morePage.contactUs);
	}

	@When("User enter name on the name input field")
	public void user_enter_name_on_the_name_input_field() {
		contactUsPage.writeOnAElement(contactUsPage.nameField, "Sajid Rahman");
	    
	}

	@When("User enter email on the email input field")
	public void user_enter_email_on_the_email_input_field() {
		contactUsPage.writeOnAElement(contactUsPage.emailField, "Hello@gmail.com");
	    
	}

	@When("User enter their enquiry on the enquiry input field")
	public void user_enter_their_enquiry_on_the_enquiry_input_field() {
		contactUsPage.writeOnAElement(contactUsPage.enquiryField, "Thank You");
	}

	@Then("User click on the submit button")
	public void user_click_on_the_submit_button() throws InterruptedException {
		contactUsPage.clickOnElement(contactUsPage.submitButton);
		Thread.sleep(2000);
		Assert.assertEquals(contactUsPage.getElementText(contactUsPage.enquiryField), "Enter your enquiry.");

	}

}
