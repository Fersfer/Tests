package com.dice.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Logger;

/**
 * Created by user on 26/12/17.
 */
public class BrowserFactory {

    public static WebDriver getDriver(String browser, Logger log){
        WebDriver driver;
        log.info("Starting"  +   browser  +  "driver");
                switch (browser){
                    case "chrome":
                        System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver");
                        driver = new ChromeDriver();
                        break;

                    case "firefox":
                        System.setProperty("webdriver.gecko.driver", "./src/test/java/geckodriver");
                        driver = new FirefoxDriver();
                        break;

                    default:
                        System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver");
                        driver = new ChromeDriver();
                        break;
                }
        driver.manage().window().maximize();
        return driver;

    }
}
