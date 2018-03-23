import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TalentsPage extends BasePage {


    public TalentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement myProfileIcon() {
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/a/em"));
    }
    public WebElement MyProfile() {
       return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[1]"));
    }
    public WebElement SignOut() {
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[2]/div"));
   }
    public WebElement Talents() {
        return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/h3"));
    }
    public WebElement New() {
        return driver.findElement(By.xpath("//a[@class='btn btn-primary mr']"));
    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }

}
