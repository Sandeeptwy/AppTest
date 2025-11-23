package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.time.Duration;

public class BaseTest {

    protected AppiumDriver driver;
    AppiumDriverLocalService service;
    public BasePage basePage;

    @Parameters({"url", "browser"})
    @BeforeTest
    public void preReq() throws MalformedURLException {
        startAppium();

        UiAutomator2Options options = new UiAutomator2Options()
                .setAutomationName("uiAutomator2")
                .setPlatformName("Android")
                .setUdid("d520b9a9")
                .setAppPackage("in.amazon.mShop.android.shopping")
                .setAppActivity("com.amazon.mShop.home.HomeActivity");

        if (service.isRunning()) {
            System.out.println("Appium Server started on: " + service.getUrl());
        } else {
            System.err.println("Failed to start Appium server.");
        }

        driver = new AndroidDriver(service.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        basePage = new BasePage(driver);
    }

    public void startAppium() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder().usingAnyFreePort()
                .withAppiumJS(new File("C:\\Users\\Sandeep\\AppData\\Roaming\\npm\\node_modules\\appium\\index.js"))
                .withIPAddress("127.0.0.1")
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));

        service = AppiumDriverLocalService.buildService(builder);
        service.start();

    }

    @AfterMethod
    public void afterMethod(ITestResult iTestResult) throws IOException {

        if (!iTestResult.isSuccess()) {
            File screenshotFile = driver.getScreenshotAs(OutputType.FILE);
            String string = "src/main/resources/screenshots/" + iTestResult.getMethod().getMethodName() + ".jpg";

            File DestFile = new File(string);

            Files.copy(screenshotFile.toPath(), DestFile.toPath());

            System.out.println("Taking Screenshot");
        }

    }

    @AfterTest
    public void after() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null && service.isRunning()) {
            service.stop();
        }
    }

}
