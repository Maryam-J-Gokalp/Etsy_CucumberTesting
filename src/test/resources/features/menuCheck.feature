Feature: Check menu with actions

  @wip
  Scenario: User can hover over the menus and see sub elements
    Given user in on the etsy home page
    When user hover over the "Jewelery & Accessories"
    And user hover over the "Clothing & Shoes"
    And user hover over the "Home & Living"
    And user hover over the "Wedding & Party"
    And user hover over the "Toys & Entertainment"
    And user hover over the "Art & Collectibles"
    Then user hover over the "Craft Supplies & Tools"
