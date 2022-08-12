Feature: Refining the search process by using the category list

  Scenario Outline: User searches for items within a specific category
    Given the user is on Amazon
    When user selects <Department> and enters <Product Name>
    Then the user clicks on the search button
    Then items from that department are shown in the results page
    Examples:
      |  Department | |  Product Name |
      |  Computers  | |    Keyboard   |
      |  Handmade   | |    Wallets    |