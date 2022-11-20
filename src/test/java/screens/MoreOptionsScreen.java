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


    /**
     * @author Juan.Gonzalez
     * Scroll down until the Privacy & Legal button is located.
     */
    public void scrollDownToPrivacyLegal(){
        scrollDown(4);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'Privacy & Legal' Button is displayed on screen, otherwise false.
     */
    public boolean privacyLegalButtonIsDisplayed() {
        return isElementAvailable(privacyLegalButton);
    }

    /**
     * @author Juan.Gonzalez
     * Navigate to Privacy & Legal Screen from More Options Screen.
     */
    public PrivacyLegalScreen goToPrivacyLegalScreen() {
        click(privacyLegalButton);
        return new PrivacyLegalScreen(driver);
    }

}
