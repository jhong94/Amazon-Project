Feature: Adding a new address

  @Positive
  Scenario: Add a new address in user account
    Given the user is on the Amazon home page and signed in
    When the user clicks adds a new address
    And enters a valid address
    Then the user has successfully added a new address

  @Negative
  Scenario: Add fake address
    Given the user is on the Amazon home page and signed in
    When the user clicks adds a new address
    And enters an invalid address
    Then the user gets a prompt