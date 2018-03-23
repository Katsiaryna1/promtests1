import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.awt.event.KeyEvent.VK_V;

public class TalentStrengthTest extends BaseTest {
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
    public void CreateNewTalent() throws InterruptedException, AWTException {
        page.talentsPage.Talents().isDisplayed();
        page.talentsPage.New().click();
        Thread.sleep(3000);
        page.talentsStrengthPage.EnterCategotyClick().click();
        page.talentsStrengthPage.EnterCategoty().sendKeys("Comedy");
        page.talentsStrengthPage.EnterCategoty().sendKeys(Keys.ENTER);
        Thread.sleep(1500);
        page.talentsStrengthPage.NextBtn().click();
        page.talentsStrengthPage.Fname().sendKeys(new Faker().name().firstName());
        page.talentsStrengthPage.Lname().sendKeys(new Faker().name().lastName());
        page.talentsStrengthPage.ChooseFileBtn().click();
        // create object of the Robot class
        Robot robot = new Robot();
        StringSelection stSelection = new StringSelection("/Users/Sergey/Desktop/PHOTO1.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stSelection, null);
        robot.setAutoDelay(2000);

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
//Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
//Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);


//Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(8000);
        page.talentsStrengthPage.SexRadBtn().click();
        page.talentsStrengthPage.Calendar().click();
        //  tearDown();
    }

}
