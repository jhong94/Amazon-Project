package Automation.bdd.stepDefinitions;

import Automation.pages.SearchFilterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchResultFilterSteps extends SearchFilterPage {
    @Given("^user is on Amazon homepage$")
    public void user_is_on_Amazon_homepage()  {
        goToAmazon();
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void user_searches_for(String arg1)  {
        searchToothPks();
    }

    @When("^user clicks on sort by and selects price: low to high$")
    public void user_clicks_on_sort_by_and_selects_price_low_to_high() {
        filterBy();
    }

    @Then("^user should see the cheapest toothpicks$")
    public void user_should_see_the_cheapest_toothpicks() {
        verifyPage();
    }

}
