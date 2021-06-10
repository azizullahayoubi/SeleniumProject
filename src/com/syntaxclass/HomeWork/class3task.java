package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3task {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement practicebutton= driver.findElement(By.xpath("//a[ contains ( @id,  'btn_basic_example')] "));
        practicebutton.click();
        Thread.sleep(1000);
        WebElement simpleForm= driver.findElement(By.linkText("Simple Form Demo"));
        simpleForm.click();
        WebElement enterMessageTextBox= driver.findElement(By.id("user-message"));
        enterMessageTextBox.sendKeys("sayntax student");
        Thread.sleep(1000);
        WebElement showMessageButton= driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showMessageButton.click();
        driver.quit();


    }
}
