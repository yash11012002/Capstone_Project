package com.automation.pages.web;

import com.automation.pages.interfaces.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebLoginPage extends WebBasePage implements LoginPage {

    @FindBy(id = "sign_in_text")
    WebElement signInBtn;

    @FindBy(xpath = "//div[@class='j-text j-text-heading-xs']")
    WebElement signInText;

    @FindBy(id = "phoneNumber")
    WebElement phoneNumber;

    @FindBy(xpath = "//span[@id='user_initial']")
    WebElement userLogo;

    @FindBy(xpath = " //button[@class='j-button j-button-size__medium primary j-button-flex']")
    WebElement continueBtn;

    @Override
    public void openApplication(){
        driver.get("https://www.jiomart.com/");
    }

    @Override
    public void navigateToSignIn() {
        signInBtn.click();
    }

    @Override
    public boolean isSignInPAgeDisplayed() {
        return isElementPresent(signInText);
    }

    @Override
    public void enterPhoneNumber(String configValue) {
        phoneNumber.sendKeys(configValue);
        continueBtn.click();
    }

    @Override
    public boolean isLoginSuccessful() {
        pause(20000);
        return isElementPresent(userLogo);
    }
}
