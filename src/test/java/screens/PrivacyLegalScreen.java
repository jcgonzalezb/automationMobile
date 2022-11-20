package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class PrivacyLegalScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Juan.Gonzalez
     */
    public PrivacyLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/privacy_and_legal_elements\")")
    private AndroidElement privacyAndLegalElementsList;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy Policy\")")
    private AndroidElement privacyPolicyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Terms of Use\")")
    private AndroidElement termsOfUseButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsButton;


    /**
     * @author Juan.Gonzalez
     * return true if a list of legal options ment is displayed on screen, otherwise false.
     */
    public boolean listOfLegalOptionsIsDisplayed() {
        return isElementAvailable(privacyAndLegalElementsList);
    }











}
