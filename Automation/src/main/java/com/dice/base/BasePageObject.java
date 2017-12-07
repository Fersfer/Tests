package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 05/12/17.
 */
public class BasePageObject<T> {
    protected  WebDriver driver;
    protected WebDriverWait wait;


    protected  BasePageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 40);


    }

}
