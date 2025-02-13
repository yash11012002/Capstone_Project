package com.automation.pages.mobile;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    static WebDriver driver;

    public BasePage(){
        driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
}
