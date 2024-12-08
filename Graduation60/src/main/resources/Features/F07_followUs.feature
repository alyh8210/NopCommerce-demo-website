Feature: users could open followUs links

  Scenario user opens facebook link
    Given user navigate to homepage
    When user opens facebook link
    Then facebook is opened in new tab

  Scenario 2: user opens twitter link
    Given user navigate to homepage
    When user opens twitter link
    Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario 3: user opens rss link
    Given user navigate to homepage
    When user opens rss link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab


  Scenario 4: user opens youtube link
    Given user navigate to homepage
    When user opens twitter link
    Then "https://twitter.com/nopCommerce" is opened in new tab


