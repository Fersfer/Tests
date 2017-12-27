package com.dice.pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;


/**
 * Created by user on 05/12/17.
 */

    public  class LogInPage extends BasePageObject<LogInPage> {
        private static  final String URL = "https://www.dice.com/dashboard/login";

        private By emailField = By.id("email");
        private By passwordField = By.xpath("//input[@id='password']");
        private By signInButton = By.xpath("//button[@type='submit']");
        private By errorMessage = By.xpath("//span[@data-automation-id='login-failure-help-message']");

    public LogInPage(WebDriver driver, Logger log){

        super( driver, log);
        }
        public void OpenLoginPage(){
            getPage(URL);
        }

        public  void    fillUpEmailAndPassword(String email, String password){
            log.info("Filling up email and password");
            type(email, emailField);
            type(password, passwordField);
        }

        public ProfilePage pushSignInButton() {
            log.info("clicking on sign in button");
            click (signInButton);
            return  new ProfilePage(driver, log);

        }

        public String getLogInErrorMessage() {
            waitForVisibilityOf(errorMessage, 10);
            return getText(errorMessage);
        }
        
    }
