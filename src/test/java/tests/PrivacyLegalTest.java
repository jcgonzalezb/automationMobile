package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MoreOptionsScreen;
import screens.PrivacyLegalScreen;
import util.tests.BaseMobileTest;

public class PrivacyLegalTest extends BaseMobileTest {

    /**
     * Validate Privacy & Legal Screen Navigation.
     */
    @Description(value = "Privacy & Legal Navigation test")
    @Test()
    public void navigateToPrivacyLegalScreen() {
        log.info("Start Navigation to Dashboard Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MoreOptionsScreen moreOtherOptions = dashBoard.goToMoreOptionsScreen();
        moreOtherOptions.scrollDownToPrivacyLegal();
        log.info("Validate Privacy & Legal button");
        Assert.assertTrue(moreOtherOptions.privacyLegalButtonIsDisplayed(), "Privacy & Legal button not displayed");
        PrivacyLegalScreen privacyLegalScreen = moreOtherOptions.goToPrivacyLegalScreen();
        log.info("Validate Privacy & Legal option list");
        Assert.assertTrue(privacyLegalScreen.listOfLegalOptionsIsDisplayed(), "Privacy & Legal option list not displayed");
        log.info("Validate Privacy Policy option");
        Assert.assertTrue(privacyLegalScreen.privacyPolicyOptionIsDisplayed(), "Privacy Policy option not displayed");
        log.info("Validate Terms of Use option");
        Assert.assertTrue(privacyLegalScreen.termsOfUseOptionIsDisplayed(), "Terms of Use option not displayed");
        log.info("Validate Supplemental Terms and Conditions option");
        Assert.assertTrue(privacyLegalScreen.supplementalTermsAndConditionsOptionIsDisplayed(), "Supplemental Terms and Conditions option not displayed");
        log.info("Validate Legal Notices option");
        Assert.assertTrue(privacyLegalScreen.legalNoticesOptionIsDisplayed(), "Legal Notices option not displayed");
        log.info("Validate Property Rules option");
        Assert.assertTrue(privacyLegalScreen.propertyRulesOptionIsDisplayed(), "Property Rules option not displayed");
        log.info("Validate Electronic Communications Disclosure option");
        Assert.assertTrue(privacyLegalScreen.electronicCommunicationsDisclosureOptionIsDisplayed(), "Electronic Communications Disclosure option not displayed");











    }





}
