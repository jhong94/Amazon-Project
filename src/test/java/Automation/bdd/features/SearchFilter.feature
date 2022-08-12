Feature: As a user, I should be able to filter my search results based on price

  @Positive
    Scenario: filters the search results based on price
    Given     user is on Amazon homepage
    When      user searches for "toothpicks"
    And       user clicks on sort by and selects price: low to high
    Then      user should see the cheapest toothpicks