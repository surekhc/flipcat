package stepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import mainTest.java;

public class Flip {

    @Given("^I launch flipcart login url$")
    public void i_launch_flipcart_login_url() throws Throwable {
        mainTest.login();
    }

    @When("^I input (.+) id and (.+)$")
    public void i_input_id_and(String username, String password) throws Throwable {
        mainTest.inputCredentails();
    }

    @Then("^I am able to successfully land home page$")
    public void i_am_able_to_successfully_land_home_page() throws Throwable {
        mainTest.homepageDisplayed();
    }

}

