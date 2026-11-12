@automation
Feature: infoez web application

Background:
Given the user launch the application 
When the user click the profile button
And the user click login or register button

@Login
Scenario Outline: To Verify the valid and invalid login functionality 
Given the user enter username "<username>"
And the user enter password "<password>"
And user click on login button  
Then the user redirected the home page "<HomePage>"

  Examples:
      |      username       |     password      |     HomePage   |
	  |                     | 34567             | InValid1       |
      |12345678             |12345678           | InValid2       |
      |surya                |11223344           | InValid3   	 |
      |aryagmail.com      	|arya123            | InValid4       |
     #|kishore@gmail.com    |kishore			| InValid5	     |
      |customer@infoez.com  |Customer@123       | Valid          |

@Menu
Scenario: Verify home page menu navigation
Given   User is on home page
When   User clicks Explore 
And User clicks Nearme 
And User clicks Howitsworks 
Then  User clicks pricing 

@Business
Scenario: Search for a Business 
Given  User clicks Explore
When  User enter valid business in the search box 
And User enter valid Location in the search box
And User clicks the Search button
Then search results should be displayed

Scenario: Verify Explore filter 
Given User is on Explore
Then Filter section should be displayed
And Category dropdown should be displayed
And Sort by dropdown should be displayed
And Min rating dropdown should be displayed
And Verified only checkbox should be displayed


@Businesscard
Scenario: Verify open business  
Given User is on home page
When  User is on Explore 
And  User clicks business card 
Then results should be displayed  

@Sendenquiry
Scenario: Verify the send enquiry
Given the user click login or register button 
When  User enters valid username and password
And user click on login button 
And the user redirected the home page
And  User clicks Explore 
And  User clicks business card 
And  User clicks Send enquiry  
And  User enters valid enquiry 
And User clicks send enquiry button 
And User Clicks usermenu
And User clicks Myenquiries 
Then Enquiry send successfully   

@save
Scenario: Verify the save
Given the user click login or register button 
When  User enters valid username and password
And user click on login button 
And the user redirected the home page
And  User is on Explore
And  User clicks business card
And User clicks save 
And User Clicks usermenu 
And User clicks favorite 
Then results should be displayed

@claims
Scenario: Verify the Claims
Given the user click login or register button 
When  User enters valid username and password
And user click on login button 
And the user redirected the home page
And User is on Explore
And  User clicks business card
And  User Clicks Claims  
And User enter valid Reason 
And User enter valid URL 
And User clicks Submit button 
Then results should be displayed

@Reviews
Scenario: Verify the Reviews
Given the user click login or register button 
When User enters valid username and password
And user click on login button 
And the user redirected the home page
And User is on Explore
And User clicks business card
And User clciks write a review
And User enter Rating and Comment 
And User clicks Post review
Then results should be displayed

@About
Scenario: Verify the About and services
Given User is on Explore
When  User clicks business card
When User clicks About 
And User clicks Services
Then results should be displayed 

@Nearme
Scenario: Verify the Nearme Use my location
Given the user click login or register button 
When User enters valid username and password
And user click on login button 
And the user redirected the home page
And  User is on Nearme
And User clicks use my location 
Then result should be displayed

@Howitswork
Scenario: Verify the How its work
Given User is on home page
When User clicks Howitsworks
And User clicks Start exploring 
And User clicks List your business 
And User enters valid crendentials 
#And User clicks create account
Then results should be displayed

@pricing
Scenario: Verify the Pricing
Given the user click login or register button 
When User enters valid username and password
And user click on login button 
And the user redirected the home page
And User is on pricing
When User clicks Choose the plan
Then results should be displayed

@Profile
Scenario: Verify the Profile
Given the user click login or register button 
When User enters valid username and password
And user click on login button 
And the user redirected the home page 
When User Clicks usermenu
And User Clicks profile 
And User enters valid credentials 
And User clicks savechanges 
Then results should be displayed

@Myreview
Scenario: Verify the My Review
Given the user click login or register button 
When User enters valid username and password
And user click on login button 
And the user redirected the home page 
When User Clicks usermenu
And User Clicks Myreview 
And User check and delete review 
Then results should be displayed
















