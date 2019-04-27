package Pages;

import Helpers.Helpers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author juampi
 */
public class PageIndex {

    private WebDriver driver;

    public PageIndex() {

    }

    @BeforeMethod
    private void SetUp() {

        System.setProperty("webdriver.firefox.driver", "./geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
    }

    @Ignore
    @Test
    private void TestGsn() {
        PageForm Suc = new PageForm(driver);
        Suc.Sucursal();
    }

    @Test
    private void TestRegister() {
        PageForm Suc = new PageForm(driver);
        Suc.Register();

    }

    @Ignore
    @Test
    private void TestForm() {
        PageForm Suc = new PageForm(driver);
        Suc.select("3", "11", "1982");
    }

    @Test
    private void TestButton() {
        PageForm Suc = new PageForm(driver);
        Suc.RadioButton();

    }

    @AfterMethod
    private void TearDown() {
        PageTime pause = new PageTime();
        pause.Sleep(5);
        driver.quit();
        System.out.println("success");
    }

    public void Test() {
        try{this.SetUp();} catch(Exception e){System.out.println(e.getMessage());}
        
        try{this.TestGsn();} catch(Exception e){System.out.println(e.getMessage());}
        
        try{this.TestRegister();} catch(Exception e){System.out.println(e.getMessage());}
        
        try{this.TestForm();} catch(Exception e){System.out.println(e.getMessage());}
        
        try{ this.TestButton();} catch(Exception e){System.out.println(e.getMessage());}
       
        try{this.TearDown();}catch(Exception e){System.out.println(e.getMessage());}
        
    }
}
