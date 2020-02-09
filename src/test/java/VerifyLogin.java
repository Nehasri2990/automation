import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin {

    @Test
    public void testLogin() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        HomePage homepg = new HomePage();
        LoginPage loginpg = new LoginPage();
        homepg.clickSignupBtn(driver);
        Thread.sleep(2000);
        loginpg.enterUsernname(driver,"9643544179");
        loginpg.enterPassword(driver,"NehaSri123");
        loginpg.clickLogin(driver);
        Thread.sleep(2000);
        String actualname = homepg.getNameLeb(driver);
        System.out.println(actualname);
        Assert.assertEquals(actualname, "Neha Srivastava");
        homepg.clickDocLable(driver);
        DoctorsPage doctorpg = new DoctorsPage();
        doctorpg.getDocList(driver, "Dentist");
        doctorpg.clickdropdownlist(driver);

    }
}
