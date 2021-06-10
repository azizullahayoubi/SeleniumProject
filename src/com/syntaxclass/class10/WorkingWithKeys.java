package com.syntaxclass.class10;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver() ;
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement usernameTextBox=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameTextBox.sendKeys("Tester", Keys.TAB);
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordTextBox.sendKeys("test",Keys.ENTER);

    }
}
