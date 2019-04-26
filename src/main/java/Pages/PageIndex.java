package Pages;
import Helpers.Helpers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import java.lang.*;
import java.util.*;
import org.openqa.selenium.support.ui.Select;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.Dimension;

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
        Suc.Sucursal("SUCURSALES");
    }

    @AfterMethod
    private void TearDown() {
        PageForm pause = new PageForm();
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
