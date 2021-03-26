package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kate_s\\Downloads\\chromedriver\\chromedriver.exe"); //define path to the webdriver
        WebDriver driver = new ChromeDriver(); //   Create instance of ChromeDriver interface
        
    try {
        driver.get("http://suninjuly.github.io/find_xpath_form");

        WebElement f_name = driver.findElement(By.name("first_name"));
        f_name.sendKeys("Kate");
        WebElement l_name = driver.findElement(By.name("last_name"));
        l_name.sendKeys("Sam");
        WebElement city = driver.findElement(By.cssSelector(".form-control.city"));
        city.sendKeys("Kyiv");
        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Ukraine");

        WebElement button = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        button.click();
    }
    
finally
        {
            TimeUnit.SECONDS.sleep(6);
            driver.quit();
        }
    }
}
