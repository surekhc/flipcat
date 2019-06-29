package stepDefinition;
import Automation.Flipcart.App;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class flipTest {

    @Given("^I launch flipcart login url$")
    public void i_launch_flipcart_login_url() throws Throwable {
    	App.launch();
    	
    }
    
    @When("^I input (.+) and (.+)$")
    public void i_input_id_and(String username, String password) throws Throwable {
    		App.inputCredentails(username,password);
    }
    
    @When("^I press on login button$")
    public void i_press_on_login_button() throws Throwable {
    	App.loginButton();
   
    }
    
    @When("^I search for the mobile brand as (.+)$")
    public void i_search_for_the_mobile_brand_as(String brand) throws Throwable {
    	App.inputMobileBrand(brand);
  
    }

    @Then("^I am able to successfully land home page$")
    public void i_am_able_to_successfully_land_home_page() throws Throwable {
    	App.homepageDisplayed();
   
    }
    
    @Then("^I am able to see the phones sorted by relevance$")
    public void i_am_able_to_see_the_apple_phones_sorted_by_relevance() throws Throwable {
    	App.phonedDisplayedByRelevance();
    }
    
    @When("^click on popularity sorting option$")
    public void click_on_popularity_sorting_option() throws Throwable {
    	App.sortByPopularity();

    }

    @Then("^I am able to view the items sorted by popularity$")
    public void i_am_able_to_view_the_items_sorted_by_popularity() throws Throwable {
    	App.displayPopularity();
    }
    
    @When("^click on high to low price sorting option$")
    public void click_on_high_to_low_price_sorting_option() throws Throwable {
    	App.sortByHighToLow();
     
    }

    @Then("^I am able to view the items sorted by highest price$")
    public void i_am_able_to_view_the_items_sorted_by_highest_price() throws Throwable {
    	App.displayHightoLow();
    }

    @When("^click on newest price sorting option$")
    public void click_on_newest_price_sorting_option() throws Throwable {
        App.sortByNewestFirst();
    }

    @Then("^I am able to view the items sorted by newest first$")
    public void i_am_able_to_view_the_items_sorted_by_newest_first() throws Throwable {
    	App.displayNewestFirst();
    }

    @When("^I click on low to high price sorting option$")
    public void click_on_low_to_high_price_sorting_option() throws Throwable {
    	App.sortByLowToHigh();
    	System.out.println("phones are sorted in the order of low to high price");
    }

    @When("^I select the phone for purchase$")
    public void i_select_the_phone_for_purchase() throws Throwable {
    	App.selectPhone();
    }

    @When("^I enter the (.+) for delivery$")
    public void i_enter_the_pincode_for_delivery(String pincode) throws Throwable {
    	App.enterPincode(pincode);
    }
    
    @Then("^verify if the mobile is available to get shipped in the area$")
    public void verify_if_the_mobile_is_available_to_get_shipped_in_the_area() throws Throwable {
    	App.verifyProductAvailability();
    }
}

