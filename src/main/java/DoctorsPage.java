import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoctorsPage {

    private static final String Docser_XPATH = "//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input";
    private static final String Dplist_XPATH ="//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]";

    public void getDocList(WebDriver driver,String doctype){
        WebElement doclist = driver.findElement(By.xpath(Docser_XPATH));
        doclist.sendKeys(doctype);
    }
    public void clickdropdownlist(WebDriver driver){
        WebElement droplist = driver.findElement(By.xpath(Dplist_XPATH));
        droplist.click();
    }
}
