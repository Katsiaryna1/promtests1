import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TalentsTest extends BaseTest {

    @BeforeTest
    public void Login() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get(page.data.baseURL);

        Thread.sleep(3000);
        page.examplePage.loginEmail().sendKeys(page.data.email2);

        page.examplePage.loginPass().sendKeys(page.data.NewPass);

        page.examplePage.loginButton().click();

    }

    @Test
    public void MyProfileTest() throws InterruptedException {


        tearDown();
    }
}