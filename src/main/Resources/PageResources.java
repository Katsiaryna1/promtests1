import org.openqa.selenium.WebDriver;

public class PageResources {
    public ExamplePage examplePage;
    public Data data;
    public RegistrationPage registrationPage;

    public PageResources(WebDriver driver){
       examplePage = new ExamplePage(driver);
       data = new Data(driver);
       registrationPage = new RegistrationPage(driver);
    }



}


