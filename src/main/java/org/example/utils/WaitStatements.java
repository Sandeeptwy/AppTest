package org.example.utils;

import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitStatements extends BaseTest {

    public static void hardWait(int sec) {

        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void explicitWait(WebElement webElement, int sec) {
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        //  wait.until(ExpectedConditions.visibilityOf(webElement));
    }


}
