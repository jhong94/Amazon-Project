package Automation.bdd.stepDefinitions;

import Automation.pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends SignInPage {

    @Given("^the user is on the Amazon home page$")
    public void the_user_is_on_the_Amazon_home_page()  {
        goToAmazon();
    }

    @When("^the user clicks on the sign in button$")
    public void the_user_clicks_on_the_sign_in_button()  {
        signInBtn();
    }

    @When("^enters the correct credentials$")
    public void enters_the_correct_credentials()  {
        enterCreds();
    }

    @Then("^the user successfully signs in and is redirected back to the home page$")
    public void the_user_successfully_signs_in_and_is_redirected_back_to_the_home_page()  {
        verifyPage();
    }

    @When("^enters the incorrect credentials$")
    public void enters_the_incorrect_credentials()  {
        wrngCreds();
    }

    @Then("^the user is not able to sign in$")
    public void the_user_is_not_able_to_sign_in()  {
        verifyWrngCreds();
    }
}
