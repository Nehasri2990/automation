import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final String UserName_CSS ="input[id ='username']";
    private static final String Password_CSS ="input[id ='password']";
    private static final String Login_CSS ="button[id ='login']";
    private static final String userLebal_XPATH ="//*[@id=\"login_form\"]/div/div[1]/div";
    private static final String passLebal_XPATH ="//*[@id=\"login_form\"]/div/div[1]/div";


    public void enterUsernname(WebDriver driver, String username){
        WebElement userEle = driver.findElement(By.cssSelector(UserName_CSS));
        userEle.sendKeys( username);
    }
    public void enterPassword(WebDriver driver,String password){
        WebElement passEle = driver.findElement(By.cssSelector(Password_CSS));
        passEle.sendKeys(password);
    }
    public void clickLogin(WebDriver driver){
        WebElement login = driver.findElement(By.cssSelector(Login_CSS));
        login.click();
    }
    public String getLoginLebel(WebDriver driver){
        WebElement lebel = driver.findElement(By.cssSelector(Login_CSS));
        return lebel.getText();
    }


}
