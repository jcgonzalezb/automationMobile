package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MoreOptionsScreen;
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

        log.info("Validate Tickets and Passes Button");
        Assert.assertTrue(moreOtherOptions.ticketsButtonIsDisplayed(), "Ticket button not displayed");

    }





}
