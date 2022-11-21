package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.BuyTicketsReserveDiningScreen;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AddPlansOptionTest extends BaseMobileTest {

    /**
     * Validate Check Dining Availability option is available on the Category List
     */
    @Description(value = "Check Dining Availability test")
    @Test()
    public void checkDiningAvailability(){
        log.info("Start Navigation to Dashboard Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();

        log.info("Start Navigation to Buy Tickets Reserve Dining Screen");
        BuyTicketsReserveDiningScreen buyTicketsReserveDiningScreen = dashBoard.goToBuyTicketsReserveDiningScreen();

        log.info("Validate Check Dining Availability button");
        Assert.assertTrue(buyTicketsReserveDiningScreen.checkDiningAvailabilityIsDisplayed(), "Check Dining Availability button not displayed");
    }
}
