package com.mycompany.selenium;

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

public class App {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.firefox.driver", "./geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gruposannicolas.com.ar/");

        driver.findElement(By.linkText("SUCURSALES")).click();

    }

    public static void pausa(long sleeptime) {
        try {
            Thread.sleep(
                    sleeptime);
        } catch (InterruptedException ex) {
        }
    }

}

