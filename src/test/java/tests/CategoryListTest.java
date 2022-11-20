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
    public void checkHotelOnCategoryList(){
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();
        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");
        map.clickOnCategoryList();
        log.info("Validate Hotels Option");
        Assert.assertTrue(map.HotelsCategoryButtonIsDisplayed(), "Hotels Category is not available");
    }
}
