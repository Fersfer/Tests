 package com.dice;

import com.dice.base.BaseTest;
import com.dice.pages.LogInPage;
import org.testng.annotations.Test;

/**
 * Created by user on 05/12/17.
 */
public class LogInTest extends BaseTest {

    @Test
    public void PositiveLogInTest(){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.OpenLoginPage();
        logInPage.fillUpEmailAndPassword("as@mailinator.com","Qwerty123");
        ProfilePage profilePage = logInPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();
        test


    }
}

