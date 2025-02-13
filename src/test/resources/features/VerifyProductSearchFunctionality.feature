Feature: Verify Product Search Functionality

  Scenario Outline: Verify user can search for products successfully
    Given user opens the application
    When user searches for product "<product.name>"
    Then verify product listing page is displayed
    And verify the searched product "<product.name>" is displayed

    Examples:
      | product.name   |
      | atta           |
      | cooking oil    |
      | detergents     |
      | curtains       |
