import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static final String Signup_CSS ="a[name ='Practo login']";
    private static final String Nemelable_XPATH = ".//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[3]/div[3]/span/span[1]";
    private static final String Doclable_XPATH ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a/div[1]";

    public void clickSignupBtn(WebDriver driver){
        WebElement signbtn = driver.findElement(By.cssSelector(Signup_CSS));
        signbtn.click();
    }
    public String getNameLeb(WebDriver driver){
        WebElement nameleb = driver.findElement(By.xpath(Nemelable_XPATH));
        return nameleb.getText();
    }
    public void clickDocLable(WebDriver driver){
        WebElement doclab = driver.findElement(By.xpath(Doclable_XPATH));
        doclab.click();
    }

}
