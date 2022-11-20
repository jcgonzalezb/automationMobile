package tests;

import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
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




    }





}
