@automation
Feature: infoez web application

Scenario: Login page
Given User launches the browser
When User open the infoez application
And User enters valid Email and Password
And User clicks the Signin button
Then Login page should be displayed

Scenario: Verify home page menu navigation
Given   User is on home page
When   User clicks Explore 
And User clicks Nearme 
And User clicks Howitsworks 
Then  User clicks pricing 

Scenario: Search for a Business 
Given  User clicks Explore
When  User enter valid business in the search box 
And User enter valid Location in the search box
And User clicks the Search button
Then search results should be displayed

Scenario: Verify open business  
Given User is on home page
When  User is on Explore 
And  User clicks business card 
Then results should be displayed  

Scenario: Verify the send enquiry
Given User clicks Send enquiry  
When  User enters valid enquiry 
And User clicks send enquiry button 
And User Clicks usermenu
And User clicks Myenquiries 
Then Enquiry send successfully   

Scenario: Verify the save
Given User is on Explore
When User clicks business card
And User clicks save 
And User Clicks usermenu 
And User clicks favorite 
Then results should be displayed

Scenario: Verify the Claims
Given User is on Explore
When User clicks business card
When User Clicks Claims  
And User enter valid Reason 
And User enter valid URL 
And User clicks Submit button 
And User clicks Close button
Then results should be displayed

Scenario: Verify the Reviews
Given User is on Explore
When  User clicks business card
When User clciks write a review
And User enter Rating and Comment 
And User clicks Post review
Then results should be displayed










