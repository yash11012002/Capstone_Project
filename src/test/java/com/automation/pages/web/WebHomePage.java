package com.automation.pages.web;

import com.automation.pages.interfaces.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebHomePage extends WebBasePage implements HomePage {

    @FindBy(xpath = "//img[@alt='JioMart']")
    WebElement jioMartText;

    @Override
    public boolean isHomePageDisplayed() {
        return isElementPresent(jioMartText);
    }

    @Override
    public void userSearchProductName(String productName){

    }
}
