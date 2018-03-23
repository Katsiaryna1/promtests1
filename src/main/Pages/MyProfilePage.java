import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyProfilePage extends BasePage{

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement FirstName() {

        return driver.findElement(By.name("firstName"));
    }
    public WebElement MiddleName() {

        return driver.findElement(By.name("middleName"));
    }
    public WebElement LastName() {

        return driver.findElement(By.name("lastName"));
    }
    public WebElement Email()
    {
       return driver.findElement(By.name("email"));
    }
    public WebElement Phone() {

        return driver.findElement(By.name("phone"));
    }
    public WebElement Country1() {
       return driver.findElement(By.xpath("//*[@id=\"tabProfile\"]/spinner-container/div[1]/div/div[2]/my-profile/form/div[6]/div/div/div[1]/span"));
    }
    public WebElement Country2(){
        return driver.findElement(By.xpath("//*[@id=\"tabProfile\"]/spinner-container/div[1]/div/div[2]/my-profile/form/div[6]/div/div/input[1]"));
    }
    public WebElement Address() {

        return driver.findElement(By.name("address"));
    }
    public WebElement City() {

        return driver.findElement(By.name("city"));
    }
    public WebElement State() {

        return driver.findElement(By.name("state"));
    }
    public WebElement Zip() {

        return driver.findElement(By.name("zip"));
    }
    public WebElement UpdateBtn() {
       return driver.findElement(By.xpath("//*[@id=\"updateProfile\"]"));
    }

    public WebElement PasswordChange() {
       return driver.findElement(By.xpath("/html/body/app/ui-view/public-area/div/ui-view/my-profile-section/div/section/div/div/div/div[1]/div/div[2]/a[2]"));
    }
    public WebElement CurPassword() {
       return driver.findElement(By.name("currentPassword"));
    }
    public WebElement NewPassword() {
       return driver.findElement(By.name("newPassword"));
    }
    public WebElement ConfirmPassword() {
       return driver.findElement(By.name("confirmPassword"));
    }
    public WebElement PsswdUpdt() {
       return driver.findElement(By.xpath("//form[@id='formPassword']//button[@class='btn btn-primary']"));
    }
//    public WebElement name() {
//       return driver.findElement();
//    }
}