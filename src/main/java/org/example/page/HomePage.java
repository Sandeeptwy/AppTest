package org.example.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.BasePage;
import org.example.utils.MobileActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends BasePage {

    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/sso_continue")
    WebElement continueBtn;

    @AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/chrome_search_hint_view")
    WebElement search;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    public void clickContinue() {
        continueBtn.click();
    }

    public void scroll() {
       /* MobileActions mobileActions = new MobileActions(driver);
        mobileActions.scrollDown();
        mobileActions.scrollDown();*/
    }

}
