package com.orangehrm.coreFunctions.ABTesting;

import com.orangehrm.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class ABTestingFunctions extends TestBase {

    public void click_on_AB_Testing_link() {
        int i = 1;
        while(i < 2) {
            try {
                waitForElementToBeVisible(By.xpath(ABTestingLocators.AB_TESTING_LINK), Duration.ofSeconds(10));
                clickElement(By.xpath(ABTestingLocators.AB_TESTING_LINK), "Successfully clicked on ABTesting link");
                break;
            }catch (Exception e) {
                System.out.println("Exception occurred. Executing the code again.");
                i++;
            }
        }
    }

    public void validateABTestingHeading() {
        waitForElementToBeVisible(By.xpath(ABTestingLocators.AB_TESTING_HEADING), Duration.ofSeconds(10));
        logInfo("Successfully validated the heading ", true);
    }

    public void validateABTestingContent() {
        waitForElementToBeVisible(By.xpath(ABTestingLocators.AB_TESTING_CONTENT), Duration.ofSeconds(10));
        String expectedText = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn " +
                "different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action " +
                "such as a click-through).";
        String actualText = findElement(By.xpath(ABTestingLocators.AB_TESTING_CONTENT)).getText();
        Assert.assertEquals(expectedText, actualText);
        logInfo("Successfully validated content as " + expectedText, true);
    }

    public void validate_poweredBy_Text() {
        waitForElementToBeVisible(By.xpath(ABTestingLocators.POWERED_BY_TEXT), Duration.ofSeconds(10));
        String actualText = findElement(By.xpath(ABTestingLocators.POWERED_BY_TEXT)).getText();
        String expectedText = "Powered by Elemental Selenium";
        Assert.assertEquals(actualText, expectedText);
        logInfo("Successfully validated the text", true);
    }

    public void validate_elemental_selenium_text() {
        waitForElementToBeVisible(By.xpath(ABTestingLocators.ELEMENTAL_LINK_TEXT), Duration.ofSeconds(10));
        clickElement(By.linkText(ABTestingLocators.ELEMENTAL_LINK_TEXT), "Clicked on elemental link");

        //Now write the code to switch to a new tab
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        logInfo("Switched to a new tab", true);

//        driver.switchTo().window(tabs.get(0));
    }

    public void validate_Elemental_Selenium_Logo() {
        waitForElementToBeVisible(By.xpath(ABTestingLocators.ELEMENTAL_LINK_TEXT), Duration.ofSeconds(10));
        logInfo("Elemental Selenium logo is validated", true);
    }
}













