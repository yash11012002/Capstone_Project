package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductListingSteps extends BaseSteps {


    @Then("verify product listing page is displayed")
    public void verifyProductListingPageIsDisplayed() {
        Assert.assertTrue(productListing.verifyProductListingPageIsDisplayed());
    }

    @And("verify the searched product {string} is displayed")
    public void verifyTheSearchedProductIsDisplayed(String productName) {
        Assert.assertTrue(productListing.verifySearchProductDisplayed(productName));
    }
}
