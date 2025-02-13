package com.automation.pages.web;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebBasePage {

    static WebDriver driver;

    public WebBasePage(){
        driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
}
