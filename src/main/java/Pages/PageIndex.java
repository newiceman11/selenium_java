package Pages;
import Helpers.Helpers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;

/**
 *
 * @author juampi
 */
public class PageIndex {

    private WebDriver driver;
    private By Link;

    public PageIndex () {

        Link = By.linkText("SUCURSALES");
    }

    @BeforeMethod
    private void SetUp() {
        System.setProperty("webdriver.firefox.driver", "./geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.gruposannicolas.com.ar/");
    }

    @Test
    private void TestGsn() {
        PageSuc Suc = new PageSuc(driver);
        Suc.Sucursal();
        
    }

    @AfterMethod
    private void TearDown() {
        PageTime pause = new PageTime();   
        pause.Sleep(4);
        driver.quit();
        System.out.println("success");
    }

    public void Test() {
        this.SetUp();
        this.TestGsn();
        this.TearDown();
    }

}
