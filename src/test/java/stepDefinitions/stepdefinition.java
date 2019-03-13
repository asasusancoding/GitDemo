
package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition {

    @Given("^User is on Navigation Landing page$")
    public void user_is_on_navigation_landing_page() throws Throwable {
       System.out.println("Code is navigated");
    }

    @When("^User gave username and password and clicked$")
    public void user_gave_username_and_password_and_clicked() throws Throwable {
    	 System.out.println("Code is clicked");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("Code is populated");
    }

    @And("^Credit is created$")
    public void credit_is_created() throws Throwable {
    	 System.out.println("Code is created");
    }

}