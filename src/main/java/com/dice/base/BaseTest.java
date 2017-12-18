package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by user on 05/12/17.
 **/

public  class BaseTest{
    protected WebDriver driver;

        @BeforeMethod
        protected void methodSetUp() {
            System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }

        @AfterMethod
        protected void methodTearDown() {
            driver.quit();
        }
    }


