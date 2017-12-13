package com.dice.pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 06/12/17.
 */
public class ProfilePage extends BasePageObject<ProfilePage> {

    private By editProfileButton = By.id("editProfile");
    private By advancedSearchButton = By.id("advanced-search-link");

    public ProfilePage(WebDriver driver) {

        super(driver);
    }

    public void waitForProfilePageToLoad(){
        waitForVisibilityOf(editProfileButton);
        waitForVisibilityOf(advancedSearchButton, 10);
    }
}


