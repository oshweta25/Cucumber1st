package salesforce.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
// Or you can say * to import all import io.cucumber.java.en.
//import io.cucumber.java.en.*

public class LoginFeature {
	
	WebDriver driver;
	
	@Given("As a user I should be able to launch the app/application")
	public void as_a_user_i_should_be_able_to_launch_the_application() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}

	@When("As a user I should be able to enter user credential(s)")
	public void as_a_user_i_should_be_able_to_enter_user_credentials() {
	    
//		driver.findElement(By.id("username")).sendKeys("oshweta@mycompany.com");
//		driver.findElement(By.id("password")).sendKeys("123");
		//driver.findElement(By.id("Login")).click();
	}

	@When("user enters {string} and blank {string} and clicks login")
	public void user_enters_username_and_blank_password_and_clicks_login(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();

		System.out.println( "Entered Username = " + username + " Entered Password = " + password );
	
	}

	@Then("User should be able to see error message about wrong credentials")
	public void user_should_be_able_to_see_error_message_about_wrong_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@Then("User should not be allowed to login")
	public void user_should_not_be_allowed_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@When("User enters incorrect {string} and valid {string} and clicks login")
	public void user_enters_incorrect_username_and_valid_password_and_clicks_login(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();

		System.out.println( "Entered Username = " + username + " Entered Password = " + password );
	
	}

	@Then("User should be able to see error message for wrong credentials")
	public void user_should_be_able_to_see_error_message_for_wrong_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid {string} and {string} and clicks login")
	public void user_enters_valid_usernmane_and_password_and_clicks_login(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();

		System.out.println( "Entered Username = " + username + " Entered Password = " + password );
	
	}

	@Then("User should be able to see the home page of the application")
	public void user_should_be_able_to_see_the_home_page_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@Given("User is inside Home Page, and should able to see usermenu dropdown")
	public void user_is_inside_home_page_and_should_able_to_see_usermenu_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@When("user click on user menu drop down")
	public void user_click_on_user_menu_drop_down() {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to see options profile, etc")
	public void user_should_be_able_to_see_options_profile_etc() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
