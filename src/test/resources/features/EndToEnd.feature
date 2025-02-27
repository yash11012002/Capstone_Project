Feature: End-to-End User Login Flow

  Scenario: User successfully logs in to the application
    Given user opens application
    When user navigates to sign-in page
    Then verify user is on sign-in page
    When user enters mobile number as "mobile.number"
    # User will click "Continue" and enter OTP manually for verification
    Then verify user is successfully logged in
    And verify user is on homepage
    When user navigates to groceries section
    And selects a product category
    Then verify product listing page is displayed
    When user adds items to cart
    Then verify items are successfully added to cart
    When user clicks on cart icon
    Then verify cart page is displayed
    And user clicks on place order
    Then verify order review page is displayed






