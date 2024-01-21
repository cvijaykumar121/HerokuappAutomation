package com.orangehrm.testcases;

import com.orangehrm.base.TestBase;
import com.orangehrm.coreFunctions.ABTesting.ABTestingFunctions;
import org.testng.annotations.Test;

public class ABTestingPageFunctionalities extends TestBase {
    public ABTestingFunctions abTesting = new ABTestingFunctions();
    public boolean testResult = false;

    @Test(priority = 1)
    public void click_on_ABTesting_Link() {
        abTesting.click_on_AB_Testing_link();
    }

    @Test(priority = 2)
    public void validate_ABTesting_Heading() {
        abTesting.validateABTestingHeading();
    }

    @Test(priority = 3)
    public void validate_ABTesting_Content() {
        abTesting.validateABTestingContent();
    }

    @Test(priority = 4)
    public void validate_PoweredBy_Text() {
        abTesting.validate_poweredBy_Text();
    }

    @Test(priority = 5)
    public void validate_Elemental_Selenium_Link() {
        abTesting.validate_elemental_selenium_text();
    }

    @Test(priority = 6)
    public void validate_Elemental_Selenium_Logo() {
        abTesting.validate_Elemental_Selenium_Logo();
    }
}
