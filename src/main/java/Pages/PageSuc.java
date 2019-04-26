package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author juampi
 */
public class PageSuc {

    private WebDriver driver;

    public PageSuc(WebDriver driver) {
        this.driver = driver;
    }

    public void Sucursal(String var) {
        driver.findElement(By.linkText(var)).click();
    }
}
