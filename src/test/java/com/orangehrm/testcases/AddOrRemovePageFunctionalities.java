package com.orangehrm.testcases;

import com.orangehrm.base.TestBase;
import com.orangehrm.coreFunctions.AddRemoveElements.AddRemoveFunctions;
import org.testng.annotations.Test;

public class AddOrRemovePageFunctionalities extends TestBase {
    public AddRemoveFunctions addRemoveFunctions = new AddRemoveFunctions();

    @Test(priority = 1)
    public void click_on_add_remove_link() {
        addRemoveFunctions.click_on_Add_Remove_Link();
    }

    @Test(priority = 2)
    public void validate_page_title() {
        addRemoveFunctions.validate_Heading();
    }

    @Test(priority = 3)
    public void validate_delete_button_added_when_clicked_on_add_button() {
        addRemoveFunctions.validate_delete_button_added_when_clicked_on_add_button(5);
    }

    @Test(priority = 4)
    public void validate_when_clicked_on_any_delete_button_removes_one_delete_button() {
        addRemoveFunctions.validate_when_clicked_on_any_delete_button_removes_one_delete_button();
    }
}
