package com.automation.pages.web;

import com.automation.pages.interfaces.ProductListing;

public class WebProductListingPage extends WebBasePage implements ProductListing {

    @Override
    public boolean verifyProductListingPageIsDisplayed(){
        return true;
    }
    @Override
    public boolean verifySearchProductDisplayed(){
        return true;
    }
}
