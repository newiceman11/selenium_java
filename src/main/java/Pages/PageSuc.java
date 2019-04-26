package Pages;

import java.awt.Color;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author juampi
 */
public class PageSuc {

    private WebDriver driver;
    private By text_suc;

    public PageSuc(WebDriver _driver) {
        this.driver = _driver;
        text_suc = By.linkText("SUCURSALES");
    }

    public void Sucursal() {
        try {
            Assert.assertTrue(driver.findElement(text_suc).getText().contains("SUCURSALES"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        driver.findElement(text_suc).click();
        System.out.println("good");
    }
}
