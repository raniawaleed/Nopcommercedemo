@smoke
Feature:F04_Search|user could find the product using search
  Scenario Outline:  user could search using product name
    Given user go to search box
    When user enter the product "<name>"
    And click on search button
    Then each result contains the search word "<name>"
    And URL will change

    Examples:
      |name|
      |book|
      |laptop|
      |nike|

  Scenario Outline:  user could search for product using sku
    Given user go to search box
    When user enter the product "<sku>"
    And click on search button
    And click on the product in search result
    Then sku shown in this page contains the "<sku>" that you are using in search
    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|