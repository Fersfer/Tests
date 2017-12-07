package com.dice;

import com.dice.base.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by user on 05/12/17.
 */
public class SecondTest extends BaseTest{
    @Test
    public void SecondTestMethod(){
        driver.get("http://www.google.com");
        System.out.println("Google Opened.Test passed!");
    }

}
