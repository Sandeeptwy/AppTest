import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.example.BaseTest;
import org.example.ITestListener;
import org.example.utils.WaitStatements;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListener.class)
public class HomePageTest extends BaseTest {

    @Test
    public void searchProduct() {

        basePage.getHomePage(driver).clickContinue();
        basePage.getHomePage(driver).scroll();

    }
}
