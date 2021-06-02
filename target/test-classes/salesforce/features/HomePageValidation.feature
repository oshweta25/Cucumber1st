Feature: Home Page Validation

Background:
Given User is in homepage, user should be able to see usermenu dropdown option 

Scenario: User Menu Drop Down
When user should be able to click on usermenu 
Then User menu should contain UsermenuOptions
|My Profile       |
|My Settings      |
|Developer Console|
|Logout           |



Scenario: Validate Myprofile option
When User should be able to click on "Myprofile" from the usermenu
Then User should be able to see profile page
When User should be able to click on edit button
Then user should be able to see edit profile pop up window
When user shoud be able to click on about tab
And user should be able to enter lastname and click on saveall button
Then user should be able to see profile page with changed last name




#how to do parameters:
#Examples: 
#|UsermenuOptions  |
#|Myprofile        |
#|Mysettings       |
#|Developer Console|
#|Logout           |
