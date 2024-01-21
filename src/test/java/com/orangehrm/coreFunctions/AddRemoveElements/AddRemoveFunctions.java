package com.orangehrm.coreFunctions.AddRemoveElements;

import com.orangehrm.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddRemoveFunctions extends TestBase {
    List<WebElement> deleteButtons;

    public void click_on_Add_Remove_Link() {
        waitForElementToBeVisible(By.xpath(AddRemoveLocators.ADD_REMOVE_HEADING), Duration.ofSeconds(10));
        clickElement(By.xpath(AddRemoveLocators.ADD_REMOVE_LINK), "Clicked on Add/Remove Link");
    }

    public void validate_Heading() {
        waitForElementToBeVisible(By.xpath(AddRemoveLocators.ADD_REMOVE_HEADING), Duration.ofSeconds(10));
        String expectedTitle = "Add/Remove Elements";
        String actualTitle = findElement(By.xpath(AddRemoveLocators.ADD_REMOVE_HEADING)).getText();

        Assert.assertEquals(expectedTitle, actualTitle);
        logPass("Successfully validated the page title", true);
    }

    private void click_add_element_button() {
        waitForElementToBeVisible(By.xpath(AddRemoveLocators.ADD_ELEMENT_BUTTON), Duration.ofSeconds(10));
        clickElement(By.xpath(AddRemoveLocators.ADD_ELEMENT_BUTTON), "Clicked on Add button");
    }

    public void validate_delete_button_added_when_clicked_on_add_button(int numberOfTimesAddButtonClick) {
        try {
            for (int i = 1; i <= numberOfTimesAddButtonClick; i++) {
                click_add_element_button();
                logInfo("Clicked add button " + i + " times", true);
                deleteButtons = findElements(By.xpath(AddRemoveLocators.DELETE_BUTTON_LIST));
                Assert.assertEquals(i, deleteButtons.size());
            }
            logInfo("PASSED: Number of add clicks and number of delete buttons match.", true);
        } catch (AssertionError e) {
            logInfo("Number of clicks and number of delete buttons do not match", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void validate_when_clicked_on_any_delete_button_removes_one_delete_button() {
        deleteButtons = findElements(By.xpath(AddRemoveLocators.DELETE_BUTTON_LIST));
        int size = deleteButtons.size();
        try {
            Random random = new Random();

            // Generating a random integer within the range [1, 10]
            int minRange = 0;

            for(int i=1; i<=size; i++) {
                deleteButtons.get(random.nextInt(size - minRange + 1) + minRange).click();
                size--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
