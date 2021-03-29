package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {

    public static String calc(String x){
        return Double.toString(Math.log(Math.abs(12*Math.sin(Integer.parseInt(x)))));
    }
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kate_s\\Downloads\\chromedriver\\chromedriver.exe"); //define path to the webdriver
        WebDriver driver = new ChromeDriver(); //   Create instance of ChromeDriver interface

        try {
            driver.get("http://suninjuly.github.io/file_input.html");

          WebElement f_name = driver.findElement(By.xpath("//input[@name = \"firstname\"]"));
          f_name.sendKeys("Kate");

          WebElement l_name = driver.findElement(By.xpath("//input[@name = \"lastname\"]"));
          l_name.sendKeys("Sem");

          WebElement email = driver.findElement(By.xpath("//input[@name = \"email\"]"));
          email.sendKeys("kate@gmail.com");

            WebElement upload_file = driver.findElement(By.xpath("//input[@type = \"file\"]"));
            
            upload_file.sendKeys("C:\\Users\\kate_s\\Desktop\\t.txt");


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
