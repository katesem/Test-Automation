package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {


    String calc(String x){
        return Double.toString(Math.log(Math.abs(12*Math.sin(Integer.parseInt(x)))));
    }
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kate_s\\Downloads\\chromedriver\\chromedriver.exe"); //define path to the webdriver
        WebDriver driver = new ChromeDriver(); //   Create instance of ChromeDriver interface

      try {
            driver.get("http://suninjuly.github.io/math.html");

             String x = driver.findElement(By.id("input_value")).getText();
             WebElement answer_field = driver.findElement(By.id("answer"));
             answer_field.sendKeys(calc(x));

             WebElement r_checkbox = driver.findElement(By.cssSelector("[for = \"robotCheckbox\""));
             r_checkbox.click();

            WebElement r_radio = driver.findElement(By.cssSelector("[for = \"robotsRule\""));
            r_radio.click();

            WebElement button = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
            button.click();
        }
    }

finally
        {
            TimeUnit.SECONDS.sleep(6);
            driver.quit();
        }
    }
}
