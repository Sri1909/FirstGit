#Author
Feature: Checking Functionality of search
 Scenario Outline: User wants to check search functionality of the application
    Given User opens the Browser
    Then User enters the url "https://www.smartbazaar.co.uk/"
    And User enters the '<search>' data
    Then User enters the search Icon or Press Enter
    Then User verifies the '<search>' results
    When User selects the '<desired>' product
   And User verifies the '<desired>' product results
   Then User closes the Browser
 Examples:
   |search|desired|
   |rice| Shree Krishna Maapillai Samba Rice (1kg) |
   |Flowers| Lotus Flower Bud (Single) |