package com.automation.steps;

import io.cucumber.java.en.And;
import org.junit.Assert;

public class HomeSteps extends BaseSteps{

    @And("verify user is on homepage")
    public void verifyUserIsOnHomepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

}
