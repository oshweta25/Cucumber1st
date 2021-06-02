Feature: Accounts Page

Scenario: Validate accounts tab
Given user is on the homepage 
When user clicks on the accounts page
Then user should be able to see accounts page

Scenario: Validate accounts page with account details
Given user is on the accounts page
When user clicks on the new button 
And user should see new account edit page
And user should be able to enter details on all fields
Then user should see the new accounts page with account details