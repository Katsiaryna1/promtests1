
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
    WebDriver driver = new ChromeDriver();
    Data data = new Data(driver);
    PageResources page = new PageResources(driver);

    public WebDriverWait wait = new WebDriverWait(driver, 10);


    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
