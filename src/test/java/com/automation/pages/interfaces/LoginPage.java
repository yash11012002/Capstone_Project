package com.automation.pages.interfaces;

public interface LoginPage {
    void openApplication();

    void navigateToSignIn();

    boolean isSignInPAgeDisplayed();

    void enterPhoneNumber(String configValue);

    boolean isLoginSuccessful();
}
