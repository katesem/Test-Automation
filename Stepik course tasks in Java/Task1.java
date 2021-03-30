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
    try
        {
        driver.get("http://suninjuly.github.io/huge_form.html");
        List<WebElement> elements = driver.findElements(By.tagName("input"));

        for (WebElement element : elements) {
            element.sendKeys("Answer");
        }

        WebElement button = driver.findElement(By.cssSelector("button.btn"));
        button.click();
       }

finally
        {
            TimeUnit.SECONDS.sleep(6);
            driver.quit();
        }
    }
}
