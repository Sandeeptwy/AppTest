package org.example;

import org.openqa.selenium.OutputType;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ITestListener implements org.testng.ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
        // Capture screenshot logic here

        if (!result.isSuccess()) {
            File screenshotFile = null;// = driver.getScreenshotAs(OutputType.FILE);
            String string = "src/main/resources/screenshots/" + result.getMethod().getMethodName() + ".jpg";

            File DestFile = new File(string);

            try {
                Files.copy(screenshotFile.toPath(), DestFile.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Taking Screenshot");
        }
    }
}
