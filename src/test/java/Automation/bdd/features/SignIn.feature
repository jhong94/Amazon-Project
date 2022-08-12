Feature: Sign in

  @Positive
  Scenario: User successfully signs in
    Given the user is on the Amazon home page
    When the user clicks on the sign in button
    And enters the correct credentials
    Then the user successfully signs in and is redirected back to the home page

  @Negative
  Scenario: User enters incorrect credentials
    Given the user is on the Amazon home page
    When the user clicks on the sign in button
    And enters the incorrect credentials
    Then the user is not able to sign in
