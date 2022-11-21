package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class CategoryListTest extends BaseMobileTest {

    /**
     * Validate Hotel option is available on the Category List
     */
    @Description(value = "Category List test")
    @Test()
    public void checkHotelOptionOnCategoryList(){
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();
        log.info("Validate Disneyland map on screen");
        Assert.assertTrue(map.disneylandMapIsDisplayed(), "Disneyland map not displayed");
        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryButtonIsDisplayed(), "Category button not displayed");
        map.clickOnCategoryList();
        log.info("Validate Category list");
        Assert.assertTrue(map.showSelectCategoryDisplayed(), "Category list not displayed");
        log.info("Validate Hotels option");
        Assert.assertTrue(map.hotelsCategoryButtonIsDisplayed(), "Hotels Category is not available");
    }
}
