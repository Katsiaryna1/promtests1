import org.openqa.selenium.WebDriver;

public class Data {
    private WebDriver driver;

    public Data(WebDriver driver){this.driver = driver;}



    public String baseURL = "http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html";

    public String email = "tupe@mailtrix.net";
    public String pass = "123456";
}
