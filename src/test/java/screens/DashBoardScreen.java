package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Close Takeover\")")
    private AndroidElement dismissWelcome;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Map, Tab, 2of5\")")
    private AndroidElement mapButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"More Options, Tab, 5of5\")")
    private AndroidElement moreOptionsButton;

    /**
     * @author Hans.Marquez
     * Navigate to Map Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * @author Juan.Gonzalez
     * Navigate to More Options Screen from DashBoard Screen.
     */
    public MoreOptionsScreen goToMoreOptionsScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
        click(moreOptionsButton);
        return new MoreOptionsScreen(driver);
    }
}
