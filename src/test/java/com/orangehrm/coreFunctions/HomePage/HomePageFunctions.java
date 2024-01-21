package com.orangehrm.coreFunctions.HomePage;

import com.orangehrm.base.TestBase;
import org.openqa.selenium.By;

import java.time.Duration;

public class HomePageFunctions extends TestBase {

    public void validateHomePageHeading() {
        waitForElementToBeVisible(By.xpath(HomePageLocators.HOMEPAGE_HEADING), Duration.ofSeconds(30));
        validateText(By.xpath(HomePageLocators.HOMEPAGE_HEADING), "Welcome to the-internet", "Successfully validated the Home Page Heading which is 'Welcome to the-internet'");
    }

    public void validateHomePageSubHeading() {
        waitForElementToBeVisible(By.xpath(HomePageLocators.HOMEPAGE_SUBHEADING), Duration.ofSeconds(30));
        validateText(By.xpath(HomePageLocators.HOMEPAGE_SUBHEADING), "Available Examples", "Successfully validated the Home Page Subheading which is 'Available Examples'");
    }

    public void validateHomePageImage() {
        waitForElementToBeVisible(By.xpath(HomePageLocators.HOMEPAGE_IMAGE), Duration.ofSeconds(30));
        logPass("Image is present in the web page", true);
    }
}
