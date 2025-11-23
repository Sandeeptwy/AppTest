package org.example.utils;

import org.example.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitStatements extends BaseTest {

    public static void hardWait1(int sec) throws InterruptedException {

        Thread.sleep(sec * 1000L);
    }

    public void explicitWait(WebElement webElement, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }


}
