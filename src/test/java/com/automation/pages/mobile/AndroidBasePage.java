package com.automation.pages.mobile;

import com.automation.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class AndroidBasePage {

    AppiumDriver driver;

    public AndroidBasePage() {
        driver = (AppiumDriver) DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void setTimeout(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
    public boolean isElementDisplayed(WebElement element){
        try {
            setTimeout(20);
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }finally {
            setTimeout(60);
        }
    }
    public static String getFormattedDate(String expectedFormat, String date, String currentDateFormat) {
        try {
            SimpleDateFormat currentFormatter = new SimpleDateFormat(currentDateFormat);
            Date dateObject = currentFormatter.parse(date);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateObject);

            SimpleDateFormat expectedFormatter = new SimpleDateFormat(expectedFormat);
            return expectedFormatter.format(calendar.getTime());
        } catch (Exception e) {
            throw new RuntimeException("Invalid date format " + expectedFormat);
        }
    }

}
