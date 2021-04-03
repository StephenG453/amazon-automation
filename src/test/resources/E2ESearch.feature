Feature: test End to End functionality of searching for an item validating it appears in the cart

  Scenario: happy path verification that the user can search for a book and add to the cart
    Given user loads amazon home page
    When user inputs "qa testing for beginners" into the search bar
    And user clicks the search button
    And user is at search results page
    And user clicks first item
    And user is at search results item page
    And user validates price of a new item is "$47.49"
    And user clicks add to cart button
    And user is at shopping cart suggestions page
    And user validates cart subtotal is "$47.49"
    And user clicks proceed to checkout button
    Then sign in page is displayed