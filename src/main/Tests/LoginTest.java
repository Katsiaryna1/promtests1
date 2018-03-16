import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{


    @Test
    public void logintest() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        driver.get(page.data.baseURL);

        Thread.sleep(3000);
        page.examplePage.loginEmail().sendKeys(page.data.email);

        page.examplePage.loginPass().sendKeys(page.data.pass);

        page.examplePage.loginButton().click();


        Assert.assertTrue(page.examplePage.loginButton().isDisplayed());
        Thread.sleep(3000);


        System.out.println("Test success");


        tearDown();

    }
}
