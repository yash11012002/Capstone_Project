package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductListingSteps {


    @Then("verify product listing page is displayed")
    public void verifyProductListingPageIsDisplayed() {
    }

    @And("verify the searched product {string} is displayed")
    public void verifyTheSearchedProductIsDisplayed(String productName) {
    }
}
