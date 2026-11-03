package steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import base.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Stepdefination extends Baseclass{
	
	page p =new page(driver);
	

	@Given("User launches the browser")
	public void user_launches_the_browser() {
		
		  //browserLaunch();
	}
	@When("User open the infoez application")
	public void user_open_the_infoez_application() {
		Assert.assertTrue("Home page is not displayed",p.Homepage.isDisplayed());
		System.out.println(p.Homepage.isDisplayed());
	}
	
	 @And ("User enters valid Email and Password")
		public void user_enters_valid_Email_and_Password() throws InterruptedException {
		 Thread.sleep(2000);
		 click(p.signinBtn);
		 sendKeys(p.Email,"customer@infoez.com" );
		 sendKeys1(p.Password,"Customer@123");
	 }
	 
    @And("User clicks the Signin button")
     public void user_clicks_the_Signin_button() {
         click(p.Signin);
     }
     
	@Then("Login page should be displayed")
	public void login_page_should_be_displayed() {
		
		Assert.assertTrue(p.Homepage.isDisplayed());	  
	}
	
	@When("User is on home page")
	public void user_is_on_home_page() {
	    Assert.assertTrue(p.Homepage.isDisplayed());
	}
	
	@When("User clicks Explore")
	public void User_clicks_Explore() throws InterruptedException {
		 Thread.sleep(2000);
		click(p.Explore);
	
	}
	
	@When("User clicks Nearme")
	public void User_clicks_Nearme() {
		click(p.Nearme);
	}
	
	@When("User clicks Howitsworks")
	public void user_clicks_howitsworks() {
	   click(p.Howitswork);
	}
	
	@Then("User clicks pricing")
	public void user_clicks_pricing() {
		click(p.Pricing);
	   
	}

	@And("User enter valid business in the search box")
	public void user_enter_valid_business_in_the_search_box() {
	    
	    sendKeys(p.Searchbox,"Iron peak gym");
	}
	
	@And("User enter valid Location in the search box")
	public void user_enter_valid_location_in_the_search_box() {
	   
	    sendKeys(p.LocationSearchbox, "Bengaluru");
	}
	
	@When("User clicks the Search button")
	public void user_clicks_the_search_button() {
	   click(p.Searchbutton);
	}

	@Then("search results should be displayed")
	public void search_results_should_be_displayed() {
	}
	
	@When("User is on Explore")
	public void user_is_on_explore() {
		 
		click(p.Homepage);
	    click(p.Explore);
	}

	
	@When("User clicks business card")
	public void user_clicks_business_card() {
	    click(p.Businesscard);
	}
	@Then("results should be displayed")
	public void results_should_be_displayed() {
		 

	}
    
	@Given("User clicks Send enquiry")
	public void user_clicks_send_enquiry()  {
		 movetotheelement(p.Sendenquiryoption);
		 click(p.Sendenquiryoption);
	   }
	
	@Given("User enters valid enquiry")
	public void user_enters_valid_enquiry() {
		sendKeys(p.SendenquiryName,"Surya");
		sendKeys(p.SendenquiryEmail,"surya@gmail.com");
		sendKeys(p.Sendenquiryphone,"9988776655");
		sendKeys(p.Sendenquirymsg,"testing");
		
	}
	
	@Given("User clicks send enquiry button")
	public void user_clicks_send_enquiry_button() {
          click(p.Sendenquirybutton);
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
	}
	
	@When("User clicks Close button")
	public void user_clicks_close_button() {
	    movetotheelement(p.closebutton);  
		click(p.closebutton);
	}
    
	@When("User clciks write a review")
	public void user_clciks_write_a_review() {
	    movetotheelement(p.Reviewbutton);
		click(p.Reviewbutton);
	}
	
	@When("User enter Rating and Comment")
	public void user_enter_rating_and_comment() {
	    click(p.Reviewrating);
	}
	
	@When("User clicks Post review")
	public void user_clicks_post_review() {
	    click(p.Reviewpostbutton);
	}
}