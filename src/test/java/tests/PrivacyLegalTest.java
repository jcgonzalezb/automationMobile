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
     * Validate display on screen of complete list of Privacy & Legal options.
     */
    @Description(value = "Privacy & Legal Navigation test")
    @Test()
    public void navigateToPrivacyLegalScreen() {
        log.info("Start Navigation to Dashboard Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();

        log.info("Validate moreOtherOptions button");
        Assert.assertTrue(dashBoard.moreOptionsButtonIsDisplayed(), "More Options button not displayed");

        log.info("Start Navigation to More Options Screen");
        MoreOptionsScreen moreOtherOptions = dashBoard.goToMoreOptionsScreen();
        moreOtherOptions.scrollDownToPrivacyLegal();

        log.info("Validate 'My Profile' option");
        Assert.assertTrue(moreOtherOptions.myProfileButtonIsDisplayed(), "'My Profile' option not displayed");

        log.info("Validate 'Property Rules' option");
        Assert.assertTrue(moreOtherOptions.propertyRulesButtonIsDisplayed(), "'Property Rules' option not displayed");

        log.info("Validate 'Cast Compliment' option");
        Assert.assertTrue(moreOtherOptions.castComplimentButtonIsDisplayed(), "'Cast Compliment' option not displayed");

        log.info("Validate 'Link to Account' option");
        Assert.assertTrue(moreOtherOptions.linkToAccountButtonIsDisplayed(), "'Link to Account' option not displayed");

        log.info("Validate 'Car Locator' option");
        Assert.assertTrue(moreOtherOptions.carLocatorButtonIsDisplayed(), "'Car Locator' option not displayed");

        log.info("Validate 'Help' option");
        Assert.assertTrue(moreOtherOptions.helpButtonIsDisplayed(), "'Help' option not displayed");

        log.info("Validate 'Privacy & Legal' option");
        Assert.assertTrue(moreOtherOptions.privacyLegalButtonIsDisplayed(), "'Privacy & Legal' option not displayed");

        log.info("Start Navigation to Privacy & Legal Screen");
        PrivacyLegalScreen privacyLegalScreen = moreOtherOptions.goToPrivacyLegalScreen();

        log.info("Validate 'Privacy & Legal' option list");
        Assert.assertTrue(privacyLegalScreen.listOfLegalOptionsIsDisplayed(), "'Privacy & Legal' option list not displayed");

        log.info("Validate 'Privacy Policy' option");
        Assert.assertTrue(privacyLegalScreen.privacyPolicyOptionIsDisplayed(), "'Privacy Policy' option not displayed");

        log.info("Validate 'Terms of Use' option");
        Assert.assertTrue(privacyLegalScreen.termsOfUseOptionIsDisplayed(), "'Terms of Use' option not displayed");

        log.info("Validate 'Supplemental Terms and Conditions' option");
        Assert.assertTrue(privacyLegalScreen.supplementalTermsAndConditionsOptionIsDisplayed(), "'Supplemental Terms and Conditions' option not displayed");

        log.info("Validate 'Legal Notices' option");
        Assert.assertTrue(privacyLegalScreen.legalNoticesOptionIsDisplayed(), "'Legal Notices' option not displayed");

        log.info("Validate 'Property Rules' option");
        Assert.assertTrue(privacyLegalScreen.propertyRulesOptionIsDisplayed(), "'Property Rules' option not displayed");

        log.info("Validate 'Electronic Communications Disclosure' option");
        Assert.assertTrue(privacyLegalScreen.electronicCommunicationsDisclosureOptionIsDisplayed(), "'Electronic Communications Disclosure' option not displayed");

        log.info("Validate 'Your California Privacy Rights' option");
        Assert.assertTrue(privacyLegalScreen.yourCaliforniaPrivacyRightsOptionIsDisplayed(), "'Your California Privacy Rights' option not displayed");

        log.info("Validate 'Do Not Sell My Personal Information' option");
        Assert.assertTrue(privacyLegalScreen.doNotSellMyPersonalInformationOptionIsDisplayed(), "'Do Not Sell My Personal Information' option not displayed");

        log.info("Validate 'In-App Maps Subject to Google Terms and Conditions' option");
        Assert.assertTrue(privacyLegalScreen.googleTermsAndConditionsIsDisplayed(), "'In-App Maps Subject to Google Terms and Conditions' option not displayed");

        log.info("Validate 'In-App Maps Subject to Google Privacy Policy' option");
        Assert.assertTrue(privacyLegalScreen.googlePrivacyPolicyIsDisplayed(), "'In-App Maps Subject to Google Privacy Policy' option not displayed");
    }
}
