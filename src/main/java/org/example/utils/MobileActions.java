package org.example.utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.example.BasePage;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class MobileActions extends BasePage {

    public MobileActions(AppiumDriver driver) {
        super(driver);

    }

    public void scrollDown() {
        double startx = driver.manage().window().getSize().getWidth() * 0.7;
        double endx = driver.manage().window().getSize().getWidth() * 0.5;
        double starty = driver.manage().window().getSize().getHeight() * 0.7;
        double endy = driver.manage().window().getSize().getHeight() * 0.2;


        PointerInput pointerInput = new PointerInput(PointerInput.Kind.TOUCH, "kind");
        Sequence sequence = new Sequence(pointerInput, 1);

        sequence.addAction(pointerInput.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int) startx, (int) starty));
        sequence.addAction(pointerInput.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        sequence.addAction(new Pause(pointerInput, Duration.ofMillis(200)));
        sequence.addAction(pointerInput.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), (int) endx, (int) endy));
        sequence.addAction(pointerInput.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));


        //     driver.perform(Collections.singletonList(sequence));
        //    driver.resetInputState(); //Optional
    }

    public void scrollIntoText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(" + text + "));"));
    }
}
