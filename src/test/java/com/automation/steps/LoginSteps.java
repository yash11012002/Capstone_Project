package com.automation.steps;

import com.automation.pages.web.WebLoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {


    @Given("user opens application")
    public void user_opens_application() {
       loginPage.openApplication();
    }

    @When("user navigates to sign-in page")
    public void userNavigatesToSignInPage() {
        loginPage.navigateToSignIn();

    }

    @Then("verify user is on sign-in page")
    public void verifyUserIsOnSignInPage() {
        Assert.assertTrue(loginPage.isSignInPageDisplayed());
    }

    @When("user enters mobile number as {string}")
    public void userEntersMobileNumberAs(String phoneNumber) {
        loginPage.enterPhoneNumber(ConfigReader.getConfigValue(phoneNumber));
    }

    @Then("verify user is successfully logged in")
    public void verifyUserIsSuccessfullyLoggedIn() {
       Assert.assertTrue( loginPage.isLoginSuccessful());
    }


}
