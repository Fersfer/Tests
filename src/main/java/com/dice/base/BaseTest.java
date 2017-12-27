package com.dice.base;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.logging.Logger;
import org.testng.annotations.BeforeClass;


/**
 * Created by user on 05/12/17.
 **/

public  class BaseTest{
    protected WebDriver driver;
    protected Logger log;

    @BeforeClass(alwaysRun = true)
    protected void setUpClass(ITestContext ctx){
        String testName = ctx.getCurrentXmlTest().getName();
        log = Logger.getLogger(testName);

    }

        @Parameters({"browser"})
        @BeforeMethod(alwaysRun = true)
        protected void methodSetUp(String browser) {


            log.info("Method set up");
            driver = BrowserFactory.getDriver(browser, log);

        }

        @AfterMethod(alwaysRun = true)
        protected void methodTearDown() {
            driver.quit();
        }
    }


