Feature: Buy item

  Scenario: Buy item in the store
    Given open application
    When user select the item
    And add item to the cart
    And navigate to cart
    Then bag should be in the cart
