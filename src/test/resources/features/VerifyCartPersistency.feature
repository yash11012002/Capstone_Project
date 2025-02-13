Feature: Verify User Login, Product Search, and Cart Persistency

  Background:
    Given user opens application
    When user navigates to sign-in page
    Then verify user is on sign-in page
    When user enters mobile number as "mobile.number"
    # User will click "Continue" and enter OTP manually for verification
    Then verify user is successfully logged in
    And verify user is on homepage

  Scenario: Verify User Login and Shopping Flow with Cart Persistency

    When user searches for product "shoe"
    Then verify product listing page is displayed
    When user selects the first product
    Then verify item page is displayed
    When user selects shoe size
    And click on add to cart button
    When user clicks on cart icon
    Then verify cart page is displayed
    When user logout
    Then verify user successfully logged out
    When user navigates to sign-in page
    Then verify user is on sign-in page
    When user enters mobile number as "mobile.number"
    # User will click "Continue" and enter OTP manually for verification
    Then verify user is successfully logged in
    And verify user is on homepage
    Then verify cart persistency

