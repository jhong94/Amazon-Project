package Automation.bdd.stepDefinitions;

import Automation.pages.ProductSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSearchSteps extends ProductSearchPage {
    @Given("^the user is on Amazon$")
    public void the_user_is_on_Amazon() {
        goToAmazon();
    }

    @When("^user selects Computers and enters Keyboard$")
    public void user_selects_Computers_and_enters_Keyboard() {
        deptComp();
    }

    @Then("^the user clicks on the search button$")
    public void the_user_clicks_on_the_search_button() {
    }

    @Then("^items from that department are shown in the results page$")
    public void items_from_that_department_are_shown_in_the_results_page() {
    }

    @When("^user selects Handmade and enters Wallets$")
    public void user_selects_Handmade_and_enters_Wallets() {
    }

}
