import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class toolqa {
    public static String first_name = "input[class ='firstname']";
    public static String last_name ="input[id='lname']";
    public static String country_name ="input[name ='country']";
    public static String text_area ="textarea[id = 'subject']";
    public static String summit_button = "input[value = 'Submit']";

@Test
    public void TestToolQA(){
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/html-contact-form/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(first_name)).sendKeys("Neha");
        driver.findElement(By.cssSelector(last_name)).sendKeys("Srivastava");
        driver.findElement(By.cssSelector(country_name)).sendKeys("India");
        driver.findElement(By.cssSelector(text_area)).sendKeys("Dummy text is text that is used in the publishing industry or by web designers to occupy the space which will later be filled with 'real' content. This is required when, for example, the final text is not yet available.");
        driver.findElement(By.cssSelector(summit_button)).click();

    }
}
