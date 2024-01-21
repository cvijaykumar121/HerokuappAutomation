package com.orangehrm.testcases;

import com.orangehrm.base.TestBase;
import com.orangehrm.coreFunctions.HomePage.HomePageFunctions;
import org.testng.annotations.Test;

public class HomePageFunctionalities extends TestBase {
    public HomePageFunctions homePageFunctions = new HomePageFunctions();

    @Test(priority = 1)
    public void validatePageHeading() {
        homePageFunctions.validateHomePageHeading();
    }

    @Test(priority = 2)
    public void validatePageSubHeading() {
        homePageFunctions.validateHomePageSubHeading();
    }

    @Test(priority = 3)
    public void validatePageImage() {
        homePageFunctions.validateHomePageImage();
    }
}
