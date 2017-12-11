package com.dice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

     @SuppressWarnings("unchecked")
    protected T getPage(String url) {
        driver.get(url);
        return (T) this;
    }

    protected  void type(String text, By element){
         find(element).sendKeys();
    }
    protected  void click(By element){
        find(element).click();
    }

    private WebElement find(By element) {
        return driver.findElement(element);
    }


}
