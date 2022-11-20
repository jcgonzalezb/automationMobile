package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class MoreOptionsScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Juan.Gonzalez
     */
    public MoreOptionsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Privacy & Legal button\")")
    private AndroidElement privacyLegalButton;

    public void scrollDownToPrivacyLegal(){
        scrollDown(4);
    }

    public boolean privacyLegalButtonIsDisplayed() {
        return isElementAvailable(privacyLegalButton);
    }

}
