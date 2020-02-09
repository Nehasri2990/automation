import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demo {

    private  static String textBox_CSS = "input[id = 'fname']";
    private  static String button_CSS ="button[id = 'idOfButton']";
    private  static String radio_CSS ="input[id ='female']";
    private  static String check1_CSS ="input[class ='Automation']";
    private  static String check2_CSS ="input[class ='Performance']";
    private  static String dropdown_CSS ="option[id='performance']";
    private  static String button1_CSS ="button[id ='dblClkBtn']";
    private  static String link_CSS ="//div[@class='col-md-12']//a";
    private  static String img_CSS ="img[id='sourceImage']";
    private  static String drop_CSS ="div[id='targetDiv']";
    @Test
    public void testGoogle()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(textBox_CSS)).sendKeys("Neha Srivastava");
        driver.findElement(By.cssSelector(button_CSS)).click();
        driver.findElement(By.cssSelector(radio_CSS)).click();
        driver.findElement(By.cssSelector(check1_CSS)).click();
        driver.findElement(By.cssSelector(check2_CSS)).click();
        driver.findElement(By.cssSelector(dropdown_CSS)).click();
        WebElement dbl = driver.findElement(By.cssSelector(button1_CSS));
        Actions actions= new Actions(driver);
        actions.doubleClick(dbl).build().perform();


    }


}