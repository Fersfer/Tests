package com.dice;
import com.dice.base.BaseTest;
import org.testng.annotations.*;

/**
 * Created by user on 05/12/17.
 **/
public  class  FirstTest extends BaseTest{

@Test
public void firstTestMethod () {

    driver.get("http://www.dice.com");
    System.out.println("Dice Opened.Test passed!");
    }
}

