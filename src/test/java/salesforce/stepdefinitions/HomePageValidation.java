package salesforce.stepdefinitions;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class HomePageValidation {
	@Given("User is in homepage, user should be able to see usermenu dropdown option")
	public void user_is_in_homepage_user_menu_should_be_able_to_see_usermenu_dropdown_option() {
	}

	@When("user should be able to click on usermenu")
	public void user_should_be_able_to_click_on_usermenu() {
	}

//	@Then("User menu should contain options {string}")
//	public void user_menu_should_contain_options(String string) {
//	}
	
	//To show data table use, above function is being done again in a different way
	@Then("User menu should contain UsermenuOptions")
	public void user_menu_should_contain_options(DataTable table) {
		
		List<String> UsermenuOptions = table.asList();
		
		for( String s:UsermenuOptions ) {
			System.out.println(s);
		}		
	}


	@When("User should be able to click on {string} from the usermenu")
	public void user_should_be_able_to_click_on_from_the_usermenu(String string) {
	}

	@Then("User should be able to see profile page")
	public void user_should_be_able_to_see_profile_page() {
	}

	@When("User should be able to click on edit button")
	public void user_should_be_able_to_click_on_edit_button() {
	}

	@Then("user should be able to see edit profile pop up window")
	public void user_should_be_able_to_see_edit_profile_pop_up_window() {
	}

	@When("user shoud be able to click on about tab")
	public void user_shoud_be_able_to_click_on_about_tab() {
	}

	@When("user should be able to enter lastname and click on saveall button")
	public void user_should_be_able_to_enter_lastname_and_click_on_saveall_button() {
	}

	@Then("user should be able to see profile page with changed last name")
	public void user_should_be_able_to_see_profile_page_with_changed_last_name() {
	}
}
