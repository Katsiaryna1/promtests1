import org.openqa.selenium.WebDriver;

public class PageResources {
    public ExamplePage examplePage;
    public Data data;
    public RegistrationPage registrationPage;
    public TalentsPage talentsPage;
    public MyProfilePage myProfilePage;
    public TalentsStrengthPage talentsStrengthPage;

    public PageResources(WebDriver driver){
       examplePage = new ExamplePage(driver);
       data = new Data(driver);
       registrationPage = new RegistrationPage(driver);
       talentsPage = new TalentsPage(driver);
       myProfilePage = new MyProfilePage(driver);
       talentsStrengthPage = new TalentsStrengthPage(driver);
    }



}


