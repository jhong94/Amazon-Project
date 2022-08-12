package Automation.bdd.stepDefinitions;

import Automation.pages.NewAddressPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAddressSteps extends NewAddressPage {
    @Given("^the user is on the Amazon home page and signed in$")
    public void the_user_is_on_the_Amazon_home_page_and_signed_in() {
        goToAmazon();
    }

    @When("^the user clicks adds a new address$")
    public void the_user_clicks_adds_a_new_address()  {
        clickAdd();
    }

    @When("^enters a valid address$")
    public void enters_a_valid_address()  {
        addressInfo();
    }

    @Then("^the user has successfully added a new address$")
    public void the_user_has_successfully_added_a_new_address()  {
        verifyPage();
    }

    @When("^enters an invalid address$")
    public void enters_an_invalid_address() {
        fakeAddress();
    }

    @Then("^the user gets a prompt$")
    public void the_user_gets_a_prompt()  {
        fakeVerify();
    }

}
