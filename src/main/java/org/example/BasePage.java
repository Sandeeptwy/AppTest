package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.example.page.HomePage;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;
    protected HomePage homePage;


    public boolean isAndroid;
    public boolean isIOS;

    public BasePage(AppiumDriver driver) {
        isAndroid = driver instanceof AndroidDriver;
        isIOS = driver instanceof IOSDriver;
        this.driver = driver;
    }

    public HomePage getHomePage(AppiumDriver driver) {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }


}
