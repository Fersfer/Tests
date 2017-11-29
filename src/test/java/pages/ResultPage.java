package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 24/10/17.
 */
public class ResultPage {
    private WebDriver driver;
    public ResultPage(WebDriver driver){
        this.driver = driver;
    }

    By addToBascetLocator = By.xpath(".//*[@id='block_with_search']/div/div[2]/div[1]/div/div/div/div/div[5]/div/div/form/span/button");
    By itemNameLocator = By.cssSelector(".cart-i-title>a");
    By beforeDeleteItemLocator = By.name("before_delete");
    By deleteLocator = By.cssSelector(".sprite-side.novisited.cart-i-delete-link");
    By afterDeleteLocator = By.cssSelector(".empty-cart-title.inline.sprite-side");



    public void addToBascetFirstResult(){
        driver.findElement(addToBascetLocator).click();
        System.out.println("Click add to basket");
    }

    public void assertItemName() {
        System.out.println(driver.findElement(itemNameLocator).getText());
        Assert.assertEquals("No items", "Ноутбук Apple MacBook Pro Retina 15\" (MJLQ2UA/A)", driver.findElement(itemNameLocator).getText());
        System.out.println("Assertion OK");
    }

    public void deleteItem(){
        driver.findElement(beforeDeleteItemLocator).click();
        driver.findElement(deleteLocator).click();
    }

    public void assertDeleteItem(){
        System.out.println(driver.findElement(afterDeleteLocator).getText());

    }


    }


