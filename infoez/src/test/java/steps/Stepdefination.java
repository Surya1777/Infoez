package steps;

import static org.junit.Assert.assertTrue;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.Assert;

import base.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Stepdefination extends Baseclass {

	page p = new page();

	@Given("the user launch the application")
	public void the_user_launch_the_application() {
		// browserLaunch();
	}

	@When("the user click the profile button")
	public void the_user_click_the_profile_button() {

	}

	@When("the user click login or register button")
	public void the_user_click_login_or_register_button() {
		click(p.signinBtn);
	}

	@Given("the user enter username {string}")
	public void the_user_enter_username(String username) {
		sendKeys(p.getEmail(), username);

	}

	@Given("the user enter password {string}")
	public void the_user_enter_password(String password) {
		sendKeys(p.getPassword(), password);
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		click(p.Signin);
	}

	@Then("the user redirected the home page {string}")
	public void the_user_redirected_the_home_page(String HomePage) throws InterruptedException {
		switch (HomePage) {
		case "InValid1":
//		   String actual1 = getValidation(p.Email);
//		   Assert.assertEquals("Please include an '@' in the email address. 'cus123.com' is missing an '@'.", actual1);
//		   System.out.println(actual1);
			String message = p.setEmail();
			Assert.assertEquals(message, "Please fill out this field.");
			System.out.println(message);

			break;

		case "InValid2":
			String Message2 = p.setEmail();
			Assert.assertEquals(Message2, "Please include an '@' in the email address. '12345678' is missing an '@'.");
			System.out.println(Message2);

			break;

		case "InValid3":
			String Message3 = p.setEmail();
			Assert.assertEquals(Message3, "Please include an '@' in the email address. 'surya' is missing an '@'.");
			System.out.println(Message3);

			break;

		case "InValid4":
			String Message4 = p.setEmail();
			try {
			Assert.assertEquals(Message4,
					"Please include an '@' in the email address. 'aryagmail.com' is missing an '@'.");
			}catch(NoSuchElementException e) {
				System.out.println(Message4);
			}
			

			break;

	/*	case "InValid5":
			String Message5 = p.setEmail();
			Assert.assertEquals(Message5,
					"Please include an '@' in the email address. 'kishore@gmail.com' is missing an '@'.");
			System.out.println(Message5);

			break;*/

		case "Valid":
			Thread.sleep(5000);

		//	Assert.assertTrue("Not displayed", p.Welcomeback.isDisplayed());
			System.out.println(p.Welcomeback);
			break;
		default:
			throw new RuntimeException("Invalid log in");
		}
	}

	@When("User is on home page")
	public void user_is_on_home_page() {
		
		//Assert.assertTrue(p.Homepage.isDisplayed());
	}

	@When("User clicks Explore")
	public void User_clicks_Explore() throws InterruptedException {
		movetotheelement(p.Explore);
		click(p.Explore);
		Assert.assertTrue("Explore menu not Displayed",p.Explorecnfrm.isDisplayed());

	}

	@When("User clicks Nearme")
	public void User_clicks_Nearme() {
		click(p.Nearme);
	//	Assert.assertTrue("Nearme menu is not Displayed", p.NearBycnfrm.isDisplayed());
		
	}

	@When("User clicks Howitsworks")
	public void user_clicks_howitsworks() {
		click(p.Howitswork);
//		WebElement Message = p.HowInfoezwork;
		try {
	     Assert.assertTrue("How its works is not Displayed", p.HowInfoezwork.isDisplayed());
		}catch(NoSuchElementException e) {
		
		}
			
	}

	@Then("User clicks pricing")
	public void user_clicks_pricing() {
		click(p.Pricing);
		try {
		Assert.assertTrue("Pricing is not Displayed", p.Pricingcnfrm.isDisplayed());
		}catch(NoSuchElementException e) {

	}
	}

	@And("User enter valid business in the search box")
	public void user_enter_valid_business_in_the_search_box() {

		sendKeys(p.Searchbox, "Iron peak gym");
		
	}

	@And("User enter valid Location in the search box")
	public void user_enter_valid_location_in_the_search_box() {

		sendKeys(p.LocationSearchbox, "Bengaluru");
	}

	@When("User clicks the Search button")
	public void user_clicks_the_search_button() {
		click(p.Searchbutton);
		Assert.assertTrue("Searched business is not Displayed", p.Searchbox.isDisplayed());
	}

	@Then("search results should be displayed")
	public void search_results_should_be_displayed() {
	}

	@When("User is on Explore")
	public void user_is_on_explore() {
		click(p.Homepage);	
		movetotheelement(p.Explore);
		click(p.Explore);
	}

	@When("User clicks business card")
	public void user_clicks_business_card() {
		movetotheelement(p.Businesscard);
		click(p.Businesscard);
	}

	@Then("results should be displayed")
	public void results_should_be_displayed() {
		//movetotheelement(p.Businesscardcnfrm);
         //Assert.assertTrue("Businesspage is not diplayed", p.Businesscardcnfrm.isDisplayed());
	}
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    sendKeys(p.getEmail(), "customer@infoez.com");
	    sendKeys(p.getPassword(), "Customer@123");
	}
	@When("the user redirected the home page")
	public void the_user_redirected_the_home_page() {
	   
	}
	
	@Given("User clicks Send enquiry")
	public void user_clicks_send_enquiry() {
		movetotheelement(p.Sendenquiryoption);
		click(p.Sendenquiryoption);
	}

	@Given("User enters valid enquiry")
	public void user_enters_valid_enquiry() {
		sendKeys(p.SendenquiryName, "Surya");
		sendKeys(p.SendenquiryEmail, "surya@gmail.com");
		sendKeys(p.Sendenquiryphone, "9988776655");
		sendKeys(p.Sendenquirymsg, "testing");

	}

	@Given("User clicks send enquiry button")
	public void user_clicks_send_enquiry_button() {
		click(p.Sendenquirybutton);
		Assert.assertTrue("Send enquiry is not sended", p.Businesscardcnfrm.isDisplayed());
	}

	@When("User Clicks usermenu")
	public void user_clicks_usermenu() throws InterruptedException {
	Thread.sleep(5000);
		movetotheelement(p.Usermenu);
		click(p.Usermenu);
	}

	@When("User clicks Myenquiries")
	public void user_clicks_myenquiries() {
		click(p.MyEnquiries);
	}

	@Then("Enquiry send successfully")
	public void enquiry_send_successfully() {
         Assert.assertTrue("Enquiry is not sended", p.Businesscard.isDisplayed());
	}

	@When("User clicks save")
	public void user_clicks_save() {
		movetotheelement(p.save);
		click(p.save);
	}

	@When("User clicks favorite")
	public void user_clicks_favorite() {
		movetotheelement(p.favorite);
		click(p.favorite);
	}

	@When("User Clicks Claims")
	public void user_clicks_claims() {
		movetotheelement(p.claims);
		click(p.claims);
	}

	@When("User enter valid Reason")
	public void user_enter_valid_reason() {
		sendKeys(p.claimsreason, "This is our business");
	}

	@When("User enter valid URL")
	public void user_enter_valid_url() {
		sendKeys(p.claimsproof, "url");
	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() {
		click(p.claimssubmit);
		Assert.assertTrue("Claim not submitted", p.claims.isDisplayed());
	}

	@When("User clciks write a review")
	public void user_clciks_write_a_review() throws InterruptedException {

		movetotheelement(p.Reviewbutton);
		click(p.Reviewbutton);
	}

	@When("User enter Rating and Comment")
	public void user_enter_rating_and_comment() {
		click(p.Reviewrating);
		sendKeys(p.Reviewcomment, "Good");
	}

	@When("User clicks Post review")
	public void user_clicks_post_review() {

		click(p.Reviewpostbutton);
		Assert.assertTrue("Reviews is not post", p.Reviewbutton.isDisplayed());
	}

	@When("User clicks About")
	public void user_clicks_about() {
		movetotheelement(p.About);
		click(p.About);
		Assert.assertTrue("About is not displayed", p.About.isDisplayed());
	}

	@When("User clicks Services")
	public void user_clicks_services() {
		movetotheelement(p.Services);
		click(p.Services);
		Assert.assertTrue("Services is not displayed", p.Services.isDisplayed());
	}
	
	@When("User is on Nearme")
	public void user_is_on_nearme() {
		click(p.Homepage);
		movetotheelement(p.Nearme);
		click(p.Nearme);  
	    
	}

	@When("User clicks use my location")
	public void user_clicks_use_my_location() {
		movetotheelement(p.Usemylocation);
		click(p.Usemylocation);
	}

	@When("User clicks Start exploring")
	public void user_clicks_start_exploring() {
		click(p.Howitswork);
		click(p.Startexploring);

	}

	@When("User clicks List your business")
	public void user_clicks_list_your_business() {
		click(p.Howitswork);
		click(p.ListyourBusiness);
	}

	@When("User enters valid crendentials")
	public void user_enters_valid_crendentials() {

		sendKeys(p.BusinessReg, "Surya");
		sendKeys(p.BusinessRegEmail, "surya@gmail.com");
		sendKeys(p.BusinessRegPhn, "9988776655");
		sendKeys(p.BusinessRegPW, "123456");
		
		Assert.assertTrue("Create business is not displayed", p.BusinessReg.isDisplayed());

	}
	
	@When("User clicks create account")
	public void user_clicks_create_account() {
		// click(p.BusinessRegCreate);
	}

	@Given("User is on How its work")
	public void user_is_on_how_its_work() {
		Assert.assertTrue("How its work is not Displayed", p.Howitswork.isDisplayed());
		System.out.println(p.Howitswork.isDisplayed());
	}

	@Given("User is on pricing")
	public void user_is_on_pricing() {
		click(p.Homepage);
		movetotheelement(p.Pricing);
		click(p.Pricing);

	}
	
	@When("User clicks Choose the plan")
	public void user_clicks_choose_the_plan()  {
		click(p.Chooseplan);
	}
		
	@When("User Clicks profile")
	public void user_clicks_profile() {
		click(p.Profile);
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {
		sendKeys(p.Profilename, "Raja");
		sendKeys(p.Profilephone, "9715070856");
		sendKeys(p.ProfileURL, "890-09");

	}

	@When("User clicks savechanges")
	public void user_clicks_savechanges() {
		click(p.Profilesavebtn);
	}


	@When("User Clicks Myreview")
	public void user_clicks_myreview() {
	
		movetotheelement(p.Myreviews);
		click(p.Myreviews);
	}

	@When("User check and delete review")
	public void user_check_and_delete_review() {
		movetotheelement(p.Reviewsdeletebuton);
		click(p.Reviewsdeletebuton);
	}
}