Feature: ShoppingCart

  Scenario: Customer add products in his shopping cart
    Given Mike on home page after opening nopCart mobile app
    When Mike click electronics from OUR CATEGORIES list from home page
    And Mike click to Mattress Bedroom product details page
    And Mike click plus button to increase Qty by 2
    Then Mike click add to cart button to add the product in his cart
