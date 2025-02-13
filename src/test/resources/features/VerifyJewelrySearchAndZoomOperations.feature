Feature: Verify Jewelry Product Search and Zoom Functionality

  Scenario: Verify Jewelry Filters and Zoom Operations

    Given user opens application
    When user click on jwellery
    And user selects silver cateogory
    Then verify product listing page is displayed
    When user apply filter for jwellery
    Then verify jwellery filters applied
    When user selects the first product
    Then verify item page is displayed
    When user clicks on the image
    And perform zoom in zoom out operations

