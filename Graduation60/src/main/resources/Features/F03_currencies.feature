Feature: select currency

  Scenario: select euro currency
    Given user navigate to homepage
    When user selects euro currency
    Then products should be displayed in euro currency