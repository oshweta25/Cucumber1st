Feature: Login functionality

Background:
Given As a user I should be able to launch the application
When As a user I should be able to enter user credentials 


Scenario: Validate login with error message
And user enters "oshweta@mycompnay.com" and blank "" and clicks login
Then User should be able to see error message about wrong credentials
But User should not be allowed to login

Scenario: Validate login with wrong username
And User enters incorrect "oshweta@mycompany.com" and valid "headache1234" and clicks login
Then User should be able to see error message for wrong credentials

Scenario: Validate login with valid credentials
And User enters valid "oshweta@mycompnay.com" and "headache1234" and clicks login
Then User should be able to see the home page of the application

#Scenario: Validate usermenu dropdown
#Given User is inside Home Page, and should able to see usermenu dropdown
#When user click on user menu drop down
#Then user should be able to see options profile, etc