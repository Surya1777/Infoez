package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page {

	WebDriver driver; 
	WebDriverWait wait;

	public page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[text()='Infoez'])[1]")
	public WebElement Homepage;
	
	@FindBy(xpath = "(//button[text()='Sign in'])[1]")
	public WebElement signinBtn;
	
	@FindBy(id = "email" )
	public WebElement Email;
	
	@FindBy(id = "password")
	public WebElement Password;
	
	@FindBy(xpath = "(//button[text()='Sign in'])[2]")
	public WebElement Signin;
	
	@FindBy(xpath = "//div[text()='Welcome back!']")
	public WebElement Welcomeback;
	
	@FindBy(xpath = "//a[text()='Explore']")
	public WebElement Explore;
	
	@FindBy(xpath = "//a[text()='Near me']")
	public WebElement Nearme;
	
	@FindBy(xpath = "(//a[text()='How it works'])[2]")
	public WebElement Howitswork;
	
	@FindBy(xpath = "(//a[text()='Pricing'])[1]")
	public WebElement Pricing;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/form/div[1]/input")
	public WebElement Searchbox;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/form/div[2]/input")
	public WebElement LocationSearchbox;
	
	@FindBy(xpath = "//button[text()='Search']")
	public WebElement Searchbutton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[1]/button")
	public WebElement Category;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[2]/button")
	public WebElement sortby;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[3]/button")
	public WebElement minrating;
	
	@FindBy(xpath = "//h3[text()='Ledger & Co.']")
	public WebElement Businesscard;
	
	@FindBy(xpath = "(//button[@data-state='closed'])[3]")
	public WebElement Sendenquiryoption;
	
	@FindBy(xpath = "//input[@data-testid='enquiry-name']")
	public WebElement SendenquiryName;
	
	@FindBy(xpath = "//input[@data-testid='enquiry-email']")
	public WebElement SendenquiryEmail;
	
	@FindBy(xpath = "//input[@data-testid='enquiry-phone']")
	public WebElement Sendenquiryphone;
	
	@FindBy(xpath = "//textarea[@data-testid='enquiry-message']")
	public WebElement Sendenquirymsg;
	
	@FindBy(xpath = "//button[text()='Send enquiry']")
	public WebElement Sendenquirybutton;
	
	@FindBy(xpath = "//button[@data-testid='favorite-toggle-btn-b954ecea-04ab-4a36-9f42-b0ea181a48a2']")
	public WebElement save;
	
	@FindBy(xpath = "//button[@data-testid='claim-business-btn']")
	public WebElement claims;
	
	@FindBy(xpath = "//textarea[@data-testid='claim-reason']")
	public WebElement claimsreason;
	
	@FindBy(xpath = "//input[@data-testid='claim-proof']")
	public WebElement claimsproof;
	
	@FindBy(xpath = "//button[text()='Submit claim']")
	public WebElement claimssubmit;
	
	@FindBy(xpath = "//*[@id=\"radix-:r6c:\"]/button/svg")
	public WebElement closebutton;
	
	@FindBy(xpath = "//button[@data-testid='write-review-btn']")
	public WebElement Reviewbutton;
	
	@FindBy(xpath = "//div[@data-testid='review-star-rating']")
	public WebElement Reviewrating;
	
	@FindBy(xpath = "//textarea[@data-testid='review-comment']")
	public WebElement Reviewcomment;
	
	@FindBy(xpath = "//button[text()='Post review']")
	public WebElement Reviewpostbutton;
	
	@FindBy(xpath = "(//button[@data-state='closed'])[1]")
	public WebElement Usermenu;
	
	@FindBy(xpath = "//div[@data-testid='menu-enquiries']")
	public WebElement MyEnquiries;
	
	@FindBy(xpath = "//div[@data-testid='menu-notifications']")
	public WebElement Notifications;
	
	@FindBy(xpath = "//div[@data-testid=\"menu-favorites\"]")
	public WebElement favorite;
	
	
	 public WebElement getEmail() {
	        return Email;
	    }
	 
     public WebElement getPassword() {
	        return Password;
	    }

     public WebElement getSigninButton() {
	        return Signin;
     }
     
     public WebElement getExplore() {
    	 return Explore;
     }
     
     public WebElement getNearme() {
    	 return Nearme;
     }
    
     public WebElement getHowitsworks() {
    	 return Howitswork;
     }
     
     public WebElement getPricing() {
    	 return Pricing;
     }
     
     public WebElement getSearchbox() {
    	 return Searchbox;
     }
     
     public WebElement getSearchbox1() {
    	 return LocationSearchbox;
     } 
     
     public WebElement getSearchbutton() {
    	 return Searchbutton;
     }
     
     public WebElement getCategory() {
    	 return Category;
     }
     
     public WebElement getSortby() {
    	 return sortby;
     }
     
     public WebElement getMinrating() {
    	 return minrating;
    	 
     }
     
     public WebElement getBusinesscard() {
    	 return Businesscard;
     }
     
     public WebElement getSendenquiry() {
    	 return Sendenquiryoption;
     }
     
     public WebElement getSendenquiryName() {
    	 return SendenquiryName;
     }
     
     public WebElement getSendenquiryEmail() {
    	 return SendenquiryEmail;
     }
     
     public WebElement getSendenquiryphone() {
    	 return Sendenquiryphone;
     }
     
     public WebElement getSendenquiryMsg() {
    	 return Sendenquirymsg;
     }
     
     public WebElement getSendenquirybutton() {
    	 return Sendenquirybutton;
     }
     public void clickExplore() {
         wait.until(ExpectedConditions.elementToBeClickable(Explore)).click();
     }
     
     public void clickNearme() {
         wait.until(ExpectedConditions.elementToBeClickable(Nearme)).click();     
     }
     
     public void clickHowitsworks() {
         wait.until(ExpectedConditions.elementToBeClickable(Howitswork)).click();
     }
     public void clickPricing() {
         wait.until(ExpectedConditions.elementToBeClickable(Pricing)).click();    
     }
      
     public boolean isHomePageDisplayed(){

          return Signin.isDisplayed();
     }

}