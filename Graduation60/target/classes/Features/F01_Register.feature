Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "ali"
    And user enters last name "Hussam"
    And user enter date of birth
    And user enter email "tesfsdfst@example.com" field
    And user fills Password fields "251198"
    And user fills confirm Password fields "251198"
    And user clicks on register button
    Then success message is displayed