package Automation.bdd.stepDefinitions;

import Automation.pages.AddToCartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartSteps extends AddToCartPage {
    @Given("^a user is browsing on Amazon$")
    public void a_user_is_browsing_on_Amazon() {
        goToAmazon();
    }

    @When("^the user adds three items to cart to purchase later$")
    public void the_user_adds_three_items_to_cart_to_purchase_later()  {
        addBtlToCart();
        addChairToCart();
        addWatchToCart();
    }

    @Then("^the user decides to only get one item$")
    public void the_user_decides_to_only_get_one_item() {
    }

    @Then("^the user only has one item in the cart$")
    public void the_user_only_has_one_item_in_the_cart() {
    }
}
