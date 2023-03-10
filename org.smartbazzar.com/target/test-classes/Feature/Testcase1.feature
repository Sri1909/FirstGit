#Author
  Feature: Checking Title of the Application.
    Scenario: User wants to check whether application is working or not.
      Given User opens the Browser
      Then User enters the url "https://www.smartbazaar.co.uk/"
      And User verifies the title of the application
      Then User closes the Browser