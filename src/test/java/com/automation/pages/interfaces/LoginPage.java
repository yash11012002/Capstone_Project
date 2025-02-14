package com.automation.pages.interfaces;

public interface LoginPage {
    void openApplication();

    void navigateToSignIn();

    boolean isSignInPageDisplayed();

    void enterPhoneNumber(String configValue);

    boolean isLoginSuccessful();
}
