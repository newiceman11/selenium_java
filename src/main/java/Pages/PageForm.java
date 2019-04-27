package Pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Helpers.Helpers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author juampi
 */
public class PageForm {

    private WebDriver driver;
    private By text_suc;
    private By identify_email;
    private By log_out;
    private By email;
    private By input_name;
    private By input_validate;
    boolean val = false;
    private By dropdownDay;
    private By dropdownMonth;
    private By dropdownYear;
    private By radioMale;
    private By btnSubmit;

    public PageForm(WebDriver driver) {
        this.driver = driver;
        text_suc = By.linkText("Forgot account?");
        identify_email = By.id("identify_email");
        email = By.id("email");
        //log_out = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/a");
        log_out = By.linkText("Log Out");
        input_name = By.name("firstname");
        input_validate = By.id("u_0_r");
        dropdownDay = By.id("day");
        dropdownMonth = By.id("month");
        dropdownYear = By.id("year");
        radioMale = By.id("u_0_a");
        btnSubmit = By.id("u_0_11");
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
            driver.findElement(email).sendKeys("xxx@xxxx.com" + Keys.TAB + "xxxxxxx" + Keys.ENTER);
            PageTime time = new PageTime();
            time.Sleep(2);
            driver.findElement(log_out).click();
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Register() {
        driver.findElement(input_name).sendKeys("Juan Pablo" + Keys.TAB + "Foos" + Keys.TAB + "xxx@xxx.com" + Keys.TAB + "x123x123x");
        PageTime time = new PageTime();
        //time.Sleep(2);
        try{
         WebDriverWait wait = new WebDriverWait(driver, 10);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(input_validate));
        element.sendKeys("xxx@xxx.com");
        }
        catch(Exception e){
        System.out.println("Error de excepcion" +e.getMessage()); 
        }
    }

    public void select(String day, String month, String year) {

        Select SelectDay = new Select(driver.findElement(dropdownDay));
        SelectDay.selectByVisibleText(day);

        Select SelectMonth = new Select(driver.findElement(dropdownMonth));
        SelectMonth.selectByValue(month);

        Select SelectYear = new Select(driver.findElement(dropdownYear));
        SelectYear.selectByValue(year);
    }

    public void RadioButton() {
        WebElement Radio = driver.findElement(radioMale);
        Radio.click();
        driver.findElement(btnSubmit).click();

    }

}
