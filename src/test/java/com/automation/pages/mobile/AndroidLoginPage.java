package com.automation.pages.mobile;

import com.automation.pages.interfaces.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidLoginPage extends AndroidBasePage implements LoginPage {

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
    WebElement accessLocation;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
    WebElement allowNotifications;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
    WebElement allowSMS;

    @FindBy(xpath = "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.jpl.jiomart:id/cv_header\"]/android.view.View/android.view.View/android.view.View[3]")
    WebElement siginIcon;

    @FindBy(xpath = "//android.view.View[@text=\"Mobile number\"]")
    WebElement inputField;

    @FindBy(xpath = "//android.view.View//android.widget.Button")
    WebElement continueBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.jpl.jiomart:id/layout_home_screen\"]/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[1]")
    WebElement loginTitle;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"phoneNumber\"]")
    WebElement enterPhoneNumber;

    @Override
    public void openApplication() {
        if (isElementDisplayed(accessLocation)) {
            accessLocation.click();
            allowNotifications.click();
            allowSMS.click();
        }

    }

    @Override
    public void navigateToSignIn() {
        siginIcon.click();
    }

    @Override
    public boolean isSignInPageDisplayed() {
        return true;
    }

    @Override
    public void enterPhoneNumber(String phoneNumber) {
        inputField.click();
        enterPhoneNumber.sendKeys(phoneNumber);
        continueBtn.click();
    }

    @Override
    public boolean isLoginSuccessful() {
        return loginTitle.isDisplayed();
    }
}
