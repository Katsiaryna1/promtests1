import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TalentsStrengthPage extends BasePage{

    public TalentsStrengthPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement EnterCategotyClick() {
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/div[1]/span/span[1]"));
    }
    public WebElement EnterCategoty() {
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div[1]/input[1]"));
    }
    public WebElement NextBtn() {
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[2]/button[2]"));
    }
    public WebElement Categoryname() {
        return driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span"));
    }
    public WebElement Fname() {
        return driver.findElement(By.name("firstName"));
    }
    public WebElement Lname() {
        return driver.findElement(By.name("lastName"));
    }
    public WebElement ChooseFileBtn() {
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[2]/div[1]/div[1]/div/span/button/span[2]"));
    }

    public WebElement SexRadBtn() {
        return driver.findElement(By.xpath("//*[@id=\"talentForm\"]/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[2]/span"));
    }
    public WebElement Calendar() {
        return driver.findElement(By.name("dateBirth"));
    }
//    public WebElement name() {
//        return driver.findElement();
//    }
//    public WebElement name() {
//        return driver.findElement();
//    }
}
