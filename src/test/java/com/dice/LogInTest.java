package com.dice;

import com.dice.base.BaseTest;
import com.dice.base.CsvDataProvider;
import com.dice.pages.LogInPage;
import com.dice.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Map;

/**
 * Created by user on 05/12/17.
 */
public class LogInTest extends BaseTest {

    @Test(priority = 1, groups = {"positive" })
    public void PositiveLogInTest() throws InterruptedException {
        LogInPage logInPage = new LogInPage(driver, log);

        String expectedPageTitle = "Seeker Dashboard - Profile";
        String CorrectProfileName = "Alex Test";

        logInPage.OpenLoginPage();

        logInPage.fillUpEmailAndPassword("as@mailinator.com", "Qwerty123");

        ProfilePage profilePage = logInPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();

        log.info("Verifications");
        String actualTitle = profilePage.getTitle();

        Assert.assertTrue(expectedPageTitle.equals(actualTitle),
                "Page tatle isn`t expected.\nExpected: " + expectedPageTitle + "\nActual: " + actualTitle);

        Assert.assertTrue(profilePage.isCorrectProfileLoaded(CorrectProfileName), "Profile isn`t expected");

    }

    @Test(dataProvider ="CsvDataProvider", dataProviderClass = CsvDataProvider.class, priority = 2, groups = {"negative", "broken" })
    public void negativeLogInTest(Map<String, String> testData) throws InterruptedException {
        String expectedErrorMessage = "Email and/or password incorrect.";
        String testNumber = testData.get("no");
        String email = testData.get("email");
        String password = testData.get("password");
        String description = testData.get("description");

        log.info("Test No #" + testNumber + "for" + description + "Where\nEmail: " + email + "\nPassword: " + password);

        LogInPage logInPage = new LogInPage(driver, log);

        logInPage.OpenLoginPage();

        logInPage.fillUpEmailAndPassword("email", "password");

        logInPage.pushSignInButton();

        String errorMessage = logInPage.getLogInErrorMessage();

        Assert.assertTrue(errorMessage.contains(expectedErrorMessage),
                "Error message is not expected. Expected: " + expectedErrorMessage + "\nActual: " + errorMessage + ".");
    }
}

