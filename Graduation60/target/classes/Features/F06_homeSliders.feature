Feature: home sliders

  Scenario: click on nokia lumia slider
    Given user navigate to homepage
    When user click on nokia lumia slider
    Then user should be directed to nokia lumia page


  Scenario: user click on iphone slider
    Given user navigate to homepage
    When user click on iphone slider
    Then user should be directed to: https://demo.nopcommerce.com/iphone-6