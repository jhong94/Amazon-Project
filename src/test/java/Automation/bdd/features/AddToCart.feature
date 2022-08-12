Feature: Adding items to cart

  Scenario: Adding three items to cart
    Given a user is browsing on Amazon
    When the user adds three items to cart to purchase later
    Then the user decides to only get one item
    Then the user only has one item in the cart