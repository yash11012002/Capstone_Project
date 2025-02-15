package com.automation.pages.mobile;

import com.automation.pages.interfaces.ProductListing;

public class AndroidProductListingPage extends AndroidBasePage implements ProductListing {

    @Override
    public boolean verifyProductListingPageIsDisplayed(){
        return true;
    }
    @Override
    public boolean verifySearchProductDisplayed(){
        return true;
    }
}
