import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class testdropdown {
    private  static String img_CSS ="div[id='draggable' ]";
    private  static String drop_CSS ="div[id='droppable' ]";
   @Test
    public void TestDropAndDown(){
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        WebElement from = driver.findElement(By.cssSelector(img_CSS));
        WebElement to = driver.findElement(By.cssSelector(drop_CSS));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();

    }

}
