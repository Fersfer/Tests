package tests;

import org.junit.Test;
import pages.MainPage;
import pages.ResultPage;
import settings.FireFoxSettings;

/**
 * Created by user on 20/10/17.
 */
public class RozetkaTest extends FireFoxSettings {

    @Test
    public void searchMacbook() throws IllegalAccessException, InterruptedException {
        MainPage mainpage = new MainPage(driver);
        mainpage.clickSignInButton();
        mainpage.login(userEmail, userPeassword);
        Thread.sleep(3000);
        mainpage.assertUserName();
        mainpage.closeSocialPopUp();
        mainpage.searshMacbook();
        ResultPage resultpage = mainpage.clickSearshButton();
        resultpage.addToBascetFirstResult();
        resultpage.assertItemName();
        resultpage.deleteItem();
        resultpage.assertDeleteItem();
    }
}
