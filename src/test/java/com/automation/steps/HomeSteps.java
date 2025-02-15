package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps extends BaseSteps{

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user searches for product {string}")
    public void userSearchesForProduct(String arg0) {

    }


}
