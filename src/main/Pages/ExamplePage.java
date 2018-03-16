import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplePage extends BasePage{
    public ExamplePage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement loginEmail(){
        return driver.findElement(By.name("email"));
    }

    public WebElement loginPass(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[2]/input"));
    }


    public WebElement loginButton(){
        return driver.findElement(By.xpath("//*[@id=\"login\"]"));
    }

    public WebElement newButton(){
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a"));
    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
//    public WebElement name(){
//        return driver.findElement();
//    }
}
