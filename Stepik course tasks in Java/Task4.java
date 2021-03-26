package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kate_s\\Downloads\\chromedriver\\chromedriver.exe"); //define path to the webdriver
        WebDriver driver = new ChromeDriver(); //   Create instance of ChromeDriver interface

    try {
        driver.get("http://suninjuly.github.io/selects1.html");

        int num1 = Integer.parseInt(driver.findElement(By.id("num1")).getText());
        int num2 = Integer.parseInt(driver.findElement(By.id("num2")).getText());

        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
        dropdown.selectByValue(String.valueOf((num1 + num2)));

        WebElement button = driver.findElement(By.cssSelector("[type = \"submit\"]"));
        button.click();
    }

finally
        {
            TimeUnit.SECONDS.sleep(6);
            driver.quit();
        }
    }
}
