package e2e;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Pending;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

// runner class

@SuppressWarnings("serial")
@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
@Pending
public class testRunner extends PendingException{
	

	@Given("^Load the application and navigate to  Loginpage$")
	public void load_the_application_and_navigate_to_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Navigate to login page and enter incorrect \"(.*?)\" and \"(.*?)\" which are incorrect$")
	public void navigate_to_login_page_and_enter_incorrect_and_which_are_incorrect(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@Then("^User should not be logged in and error message should be displayed$")
	public void user_should_not_be_logged_in_and_error_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Load the application and navigate to Login page$")
	public void load_the_application_and_navigate_to_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Try with different \"(.*?)\" and \"(.*?)\" which are also incorrect$")
	public void try_with_different_and_which_are_also_incorrect(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^User should be restricted to login$")
	public void user_should_be_restricted_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I tried with correct \"(.*?)\" and \"(.*?)\"$")
	public void i_tried_with_correct_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be successfully logged in$")
	public void i_should_be_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}






