package com.automation.steps;

import com.automation.pages.web.WebLoginPage;
import io.cucumber.java.en.Given;

public class LoginSteps {

    WebLoginPage loginPage=new WebLoginPage();
    @Given("user opens application")
    public void user_opens_application() {
       loginPage.openApplication();
    }
//
//    @Then("verify login page is displayed")
//    public void verify_login_page_is_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("user login with valid credentials")
//    public void user_login_with_valid_credentials() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("verify user successfully logged in")
//    public void verify_user_successfully_logged_in() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
