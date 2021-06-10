package com.syntaxclass.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameTextBox.sendKeys("Tester", Keys.TAB);
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordTextBox.sendKeys("test", Keys.ENTER);

       TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
         try {
             FileUtils.copyFile(sourceFile, new File("ScreenShots/adminLogin.png"));

         }catch (IOException e){
             e.printStackTrace();
         }
    }

}