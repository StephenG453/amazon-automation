Feature: test End to End functionality of searching for an item, adding into the cart, and checking out

  Scenario: End to End happy path verification that the user can search for a book, add to the cart, and checkout
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