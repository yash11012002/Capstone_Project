package com.automation.pages.mobile;

import com.automation.pages.interfaces.HomePage;

public class AndroidHomePage extends AndroidBasePage implements HomePage {

    @Override
    public boolean isHomePageDisplayed() {
        return true;
    }
    @Override
    public void userSearchProductName(String productName){

    }


}
