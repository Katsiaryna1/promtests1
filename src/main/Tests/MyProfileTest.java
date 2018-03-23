import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyProfileTest extends BaseTest {
    @Test
    public void MyProfileTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get(page.data.baseURL);

        Thread.sleep(3000);
        page.examplePage.loginEmail().sendKeys(page.data.email2);

        page.examplePage.loginPass().sendKeys(page.data.NewPass);

        page.examplePage.loginButton().click();
        page.talentsPage.myProfileIcon().click();
        page.talentsPage.MyProfile().click();
        page.myProfilePage.FirstName().clear();
        page.myProfilePage.FirstName().sendKeys(new Faker().name().firstName());
        page.myProfilePage.MiddleName().clear();
        page.myProfilePage.MiddleName().sendKeys(new Faker().name().name());
        page.myProfilePage.LastName().clear();
        page.myProfilePage.LastName().sendKeys(new Faker().name().lastName());
        page.myProfilePage.Address().clear();
        page.myProfilePage.Address().sendKeys(new Faker().address().streetAddressNumber());
        page.myProfilePage.Phone().clear();
        page.myProfilePage.Phone().sendKeys(new Faker().phoneNumber().phoneNumber());
        page.myProfilePage.Email().clear();
        page.myProfilePage.Email().sendKeys(page.data.email2);
        page.myProfilePage.UpdateBtn().click();
        Thread.sleep(3000);
        page.myProfilePage.PasswordChange().click();
        page.myProfilePage.CurPassword().sendKeys(page.data.NewPass);
        page.myProfilePage.NewPassword().sendKeys(page.data.pass);
        page.myProfilePage.ConfirmPassword().sendKeys(page.data.pass);
        page.myProfilePage.PsswdUpdt().click();



     tearDown();

    }

}