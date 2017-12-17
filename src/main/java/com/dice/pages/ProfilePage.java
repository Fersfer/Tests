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
    private By profileContactsNameText = By.xpath("//h1[@class='profile-contact-name']");

    public ProfilePage(WebDriver driver) {

        super(driver);
    }

    public void waitForProfilePageToLoad(){
        System.out.println("waiting For Profile Page To Load");
        waitForVisibilityOf(editProfileButton);
        waitForVisibilityOf(advancedSearchButton, 10);
    }

    public boolean isCorrectProfileLoaded(String correctProfileName){
        if(getText(profileContactsNameText).equals(correctProfileName)){
            return  true;
        }
        return false;

    }
}


