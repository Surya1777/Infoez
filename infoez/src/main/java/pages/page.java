package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseclass;

public class page extends Baseclass {

	//WebDriver driver; 
	WebDriverWait wait;

	public page() {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[text()='Infoez'])[1]")
	public WebElement Homepage;
	
	@FindBy(xpath = "(//button[text()='Sign in'])[1]")
	public WebElement signinBtn;
	
	@FindBy(id = "email" )
	private WebElement Email;
	
	public String setEmail() {
		//Email = email;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return(String) js.executeScript("return arguments[0].validationMessage;", getEmail());
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "password")
	private WebElement Password;
	
	
	public String setPassword(WebElement password) {
	//	Password = password;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return(String) js.executeScript("return arguments[0].validationMessage;", getPassword());
	
	}

	@FindBy(xpath = "(//button[text()='Sign in'])[2]")
	public WebElement Signin;
	
	@FindBy(xpath = "//li[@data-type='success']")
	public WebElement Welcomeback;
	
	@FindBy(xpath = "//a[@data-testid='nav-explore']")
	public WebElement Explore;
	 
	@FindBy(xpath = "//div[text()='Explore']")
	public WebElement Explorecnfrm;
	
	public WebElement getExplorecnfrm() {
		return Explorecnfrm;
	}

	public String setExplorecnfrm(WebElement explorecnfrm) {
		Explorecnfrm = explorecnfrm;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return(String) js.executeScript("return arguments[0].validationMessage;", getExplorecnfrm());
	}

	@FindBy(xpath = "//a[text()='Near me']")
	public WebElement Nearme;
	
	@FindBy(xpath = "//div[text()='Nearby']")
	public WebElement NearBycnfrm;
	
	@FindBy(xpath = "(//a[text()='How it works'])[2]")
	public WebElement Howitswork;
	
	@FindBy(xpath = "//h1[text()='How Infoez works']")
	public WebElement HowInfoezwork;
	
	@FindBy(xpath = "(//a[text()='Pricing'])[1]")
	public WebElement Pricing;
	
	@FindBy(xpath = "//div[text()='Pricing']")
	public WebElement Pricingcnfrm;
	
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
	
	@FindBy(xpath = "(//h3[text()='Kiaq Technology'])[1]")
	public WebElement Businesscard;
	
	@FindBy(xpath = "//p[text()='Software Company']")
	public WebElement Businesscardcnfrm;
	
	@FindBy(xpath = "//button[@data-testid=\"open-enquiry-btn\"]")
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
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[4]/button[2]")
	public WebElement save;
	
	@FindBy(xpath = "//button[@data-testid='claim-business-btn']")
	public WebElement claims;
	
	@FindBy(xpath = "//textarea[@data-testid='claim-reason']")
	public WebElement claimsreason;
	
	@FindBy(xpath = "//input[@data-testid='claim-proof']")
	public WebElement claimsproof;
	
	@FindBy(xpath = "//button[text()='Submit claim']")
	public WebElement claimssubmit;
	
	@FindBy(xpath = "//span[text()='Close']")
	public WebElement closebutton;
	
	@FindBy(xpath = "(//button[@type='button'])[8]")
	public WebElement Reviewbutton;
	
	@FindBy(xpath = "//div[@data-testid='review-star-rating']")
	public WebElement Reviewrating;
	
	@FindBy(xpath = "//textarea[@data-testid='review-comment']")
	public WebElement Reviewcomment;
	
	@FindBy(xpath = "//button[text()='Post review']")
	public WebElement Reviewpostbutton;
	
	@FindBy(xpath = "//button[@data-testid='tab-about']")
	public WebElement About;
	
	@FindBy(xpath = "//button[@data-testid='tab-services']")
	public WebElement Services;
	
	@FindBy(xpath = "//button[text()='Use my location']")
	public WebElement Usemylocation;
	
	@FindBy(xpath = "//a[text()='Start exploring']")
	public WebElement Startexploring;
	
	@FindBy(xpath = "//a[text()='List your business']")
	public WebElement ListyourBusiness;
	
	@FindBy(xpath = "//button[@data-testid='role-business']")
	public WebElement Rolebutton;
	
	@FindBy(xpath = "//input[@data-testid='register-name']")
	public WebElement BusinessReg;
	
	@FindBy(xpath = "//input[@data-testid='register-email']")
	public WebElement BusinessRegEmail;
	
	@FindBy(xpath = "//input[@data-testid='register-phone']")
	public WebElement BusinessRegPhn;
	
	@FindBy(xpath = "//input[@data-testid='register-password']")
	public WebElement BusinessRegPW;
	
	@FindBy(xpath = "//button[text()='Create account']")
	public WebElement BusinessRegCreate;
	
	@FindBy(xpath = "(//button[text()='Choose plan'])[2]")
	public WebElement Chooseplan;
	
	@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	public WebElement Usermenu;
	
	@FindBy(xpath = "//div[@data-testid='menu-profile']")
	public WebElement Profile;
	
	@FindBy(xpath = "//input[@data-testid='profile-name']")
	public WebElement Profilename;
	
	@FindBy(xpath = "//input[@data-testid='profile-phone']")
	public WebElement Profilephone;
	
	@FindBy(xpath = "//input[@data-testid='profile-avatar']")
	public WebElement ProfileURL;
	
	@FindBy(xpath = "//button[@data-testid='profile-save-btn']")
	public WebElement Profilesavebtn;
	
	@FindBy(xpath = "//div[@data-testid=\"menu-reviews\"]")
	public WebElement Myreviews;
	
	@FindBy(xpath = "//button[@data-testid='delete-review-428bdf9c-e9ac-431c-b283-f7bb39aea05f']")
	public WebElement Reviewsdeletebuton;
	
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