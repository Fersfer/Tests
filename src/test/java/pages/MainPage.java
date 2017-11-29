package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 23/10/17.
 */
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.name("signin");
    By emailImputLocator = By.name("login");
    By passwordlImputLocator = By.name("password");
    By submitButton = By.name("auth_submit");
    By closeSocialPopUp = By.name("close");
    By userNameLocator = By.name("profile");
    By searshImputLocator = By.name("text");
    By searshButtonLocator = By.name("rz-search-button");

    public void  clickSignInButton(){
        driver.findElement(signInButton).click();
    }

    public void typeEmail(String email){
        WebElement login = driver.findElement(emailImputLocator);
        login.click();
        login.clear();
        login.sendKeys(email);
    }

    public void typePassword (String password){
        WebElement login = driver.findElement(passwordlImputLocator);
        login.click();
        login.clear();
        login.sendKeys(password);
    }
    public void clickSubmitButton (){
        driver.findElement(submitButton).click();
    }

    public void login  (String email, String  password){
        typeEmail(email);
        typePassword(password);
        clickSubmitButton();
        System.out.println("Login OK");
    }

    public void closeSocialPopUp(){
        driver.findElement(closeSocialPopUp).click();
    }

    public void assertUserName(){
        Assert.assertEquals("Wrong user name",driver.findElement(userNameLocator).getText(), "Bill Gates");
        System.out.println("User name is OK");
    }

    public  void   searshMacbook() {
        WebElement input = driver.findElement(searshImputLocator);
        input.click();
        input.clear();
        input.sendKeys("Macbook");
    }

    public ResultPage clickSearshButton(){
        driver.findElement(searshButtonLocator).click();
        return  new ResultPage(driver);

    }

}
