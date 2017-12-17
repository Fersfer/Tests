package com.dice;

import com.dice.base.BaseTest;
import com.dice.pages.LogInPage;
import com.dice.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 05/12/17.
 */
public class LogInTest extends BaseTest {

    @Test
    public void PositiveLogInTest() throws InterruptedException {
        LogInPage logInPage = new LogInPage(driver);

        String expectedPageTitle = "Seeker Dashboard - Profile";
        String CorrectProfileName = "Alex Test";

        logInPage.OpenLoginPage();

        logInPage.fillUpEmailAndPassword("as@mailinator.com", "Qwerty123");

        ProfilePage profilePage = logInPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();

        System.out.println("Verifications");
        String actualTitle = profilePage.getTitle();

        Assert.assertTrue(expectedPageTitle.equals(actualTitle),
                "Page tatle isn`t expected.\nExpected: " + expectedPageTitle + "\nActual: " + actualTitle);

        Assert.assertTrue(profilePage.isCorrectProfileLoaded(CorrectProfileName), "Profile isn`t expected");


    }
}

