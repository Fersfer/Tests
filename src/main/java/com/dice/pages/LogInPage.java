package com.dice.pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 05/12/17.
 */

    public  class LogInPage extends BasePageObject<LogInPage> {
        private static  final String URL = "https://www.dice.com/dashboard/login";

        private By emailField = By.id("email");
        private By passwordField = By.id("password");
        private By signInButton = By.xpath("//buton[@type='submit']");

    public LogInPage(WebDriver driver){

            super( driver);
        }
        public void OpenLoginPage(){
            getPage(URL);
        }

        public  void    fillUpEmailAndPassword(String email, String password){
            type(email, emailField);
            type(password, passwordField);
        }

        public ProfilePage pushSignInButton() {
            click (signInButton);
            return  new ProfilePage(driver);

        }
        
    }
