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


    }





}
