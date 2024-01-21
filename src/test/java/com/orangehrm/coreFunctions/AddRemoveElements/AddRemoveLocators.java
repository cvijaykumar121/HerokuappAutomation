package com.orangehrm.coreFunctions.AddRemoveElements;

public class AddRemoveLocators {
    public static final String ADD_REMOVE_LINK = "//a[text()='Add/Remove Elements']";
    public static final String ADD_REMOVE_HEADING = "//h3[text()='Add/Remove Elements']";
    public static final String ADD_ELEMENT_BUTTON = "//button[text()='Add Element' and ./parent::div[@class='example']]";
    public static final String DELETE_BUTTON_LIST = "//div[@id='elements']/child::*";
}
