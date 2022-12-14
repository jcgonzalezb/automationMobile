package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
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

    // AndroidElements
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Close\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*tab_icon.*\").descriptionContains(\"Map\")")
    @AndroidFindBy(uiAutomator = "//android.widget.ImageView[contains(@content-desc,\"Map\")]")
    private AndroidElement mapButton;

    /**
     * @author Hans.Marquez
     * Navigate to Login Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        click(dismissPreferenceUpdateButton);
        click(mapButton);
        return new MapScreen(driver);
    }
}
