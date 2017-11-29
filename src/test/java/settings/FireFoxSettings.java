package settings;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 20/10/17.
 */
public class FireFoxSettings {

    protected WebDriver driver;
    protected String userEmail =  "rozetkatest@mailinator.com";
    protected String userPeassword = "Password1";
    @Before
    public void  setUp() throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "./src/test/java/resources/geckodriver");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "./src/test/java/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }

    @After
    public void tearDown(){
        driver.quit();
    }
}

