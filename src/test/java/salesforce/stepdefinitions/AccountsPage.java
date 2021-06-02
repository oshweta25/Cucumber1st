package salesforce.stepdefinitions;

import io.cucumber.java.en.*;

public class AccountsPage {
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		System.out.println("Home page");
	}

	@When("user clicks on the accounts page")
	public void user_clicks_on_the_accounts_page() {
		System.out.println("Click on Accounts ");	
	}

	@Then("user should be able to see accounts page")
	public void user_should_be_able_to_see_accounts_page() {
		System.out.println("On Accounts Page");
	}

	@Given("user is on the accounts page")
	public void user_is_on_the_accounts_page() {
		System.out.println("On Accounts Page");
	}

	@When("user clicks on the new button")
	public void user_clicks_on_the_new_button() {
	    System.out.println("Clicks on new Button");
	}

	@When("user should see new account edit page")
	public void user_should_see_new_account_edit_page() {
	    System.out.println("New Account edit page ");
	}

	@When("user should be able to enter details on all fields")
	public void user_should_be_able_to_enter_details_on_all_fields() {
	    System.out.println("Enter Details ");
	}

	@Then("user should see the new accounts page with account details")
	public void user_should_see_the_new_accounts_page_with_account_details() {
	    System.out.println("New Accounts page");
	}
}
