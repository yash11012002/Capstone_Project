Feature: Verify User Location and Product Selection

  Scenario: Verify user selects delivery location and views mobile listings
    Given user opens application
    When user clicks on delivery location
    And clicks on enter pincode link
    When user enters pincode
    Then verify city is displayed correctly
    And user clicks on apply button
    When user searches for product "cellPhone"
    Then verify product listing page is displayed
    When user applies selected filters
    Then verify filters are applied correctly
    When user selects the first product
    Then verify item page is displayed
    And verify delivery address change is reflected

