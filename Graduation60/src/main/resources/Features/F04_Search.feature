Feature: User need to search for the products with product name and product SKU

  Scenario Outline: user could search using product name
    Given   user navigate to homepage
    When    user search for products by name "<productName>"
    Then    user will found all products that searched for by name

    Examples:
      | productName|
      | book       |
      | laptop     |
      | nike       |

  Scenario Outline: user could search using product SKU
    Given   user navigate to homepage
    When    user search for products by SKU "<productSKU>"
    Then    user will found all products that searched for by SKU

    Examples:
      | productSKU |
      | SCI_FAITH  |
      | APPLE_CAM  |
      | SF_PRO_11  |