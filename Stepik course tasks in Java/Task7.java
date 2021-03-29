package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import java.util.concurrent.TimeUnit;


public class Main {

    public static String calc(String x){
        return Double.toString(Math.log(Math.abs(12*Math.sin(Integer.parseInt(x)))));
    }
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kate_s\\Downloads\\chromedriver\\chromedriver.exe"); //define path to the webdriver
        WebDriver driver = new ChromeDriver(); //   Create instance of ChromeDriver interface

        try {
            driver.get("http://suninjuly.github.io/alert_accept.html");

            WebElement button = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
            button.click();
            driver.switchTo().alert().accept();

            String x = driver.findElement(By.xpath("//span[@id = \"input_value\"]")).getText();
            WebElement answer_field = driver.findElement(By.xpath("//input[@id = \"answer\"]"));
            answer_field.sendKeys(calc(x));

            WebElement b_submit = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
            b_submit.click();
        }

finally
        {
            TimeUnit.SECONDS.sleep(6);
            driver.quit();
        }
    }
}
