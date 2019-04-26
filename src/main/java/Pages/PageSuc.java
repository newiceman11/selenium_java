package Pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author juampi
 */
public class PageSuc {

    private WebDriver driver;
    private By text_suc;
    private By identify_email;
    private By log_out;
    private By email;
    private By input_name;
    private By input_validate;
    boolean val = false;

    public PageSuc(WebDriver _driver) {
        this.driver = _driver;
        text_suc = By.linkText("Forgot account?");
        identify_email = By.id("identify_email");
        email = By.id("email");
        log_out = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/a");
        input_name= By.name("firstname");
        input_validate= By.id("u_0_r");
      }

    public void Sucursal() {

        try {

            Assert.assertTrue(driver.findElement(text_suc).getText().contains("Forgot account?"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        driver.findElement(text_suc).click();

        try {

            driver.findElement(identify_email).sendKeys("xxx@xxxx.com" + Keys.TAB + Keys.TAB + Keys.RETURN);
            PageTime pause = new PageTime();
            pause.Sleep(1);
            val = true;

            if (val = true) {
                driver.findElement(email).sendKeys("xxx@xxxx.com" + Keys.TAB + "xxxxxxx" + Keys.ENTER);
                pause.Sleep(2);
                driver.findElement(log_out).click();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void Register(){
        driver.findElement(input_name).sendKeys("Juan Pablo" + Keys.TAB + "Foos" + Keys.TAB + "xxx@xxx.com" + Keys.TAB +"x123x123x");
        driver.findElement(input_validate).sendKeys("xxx@xxx.com");
        
       
    }
}
