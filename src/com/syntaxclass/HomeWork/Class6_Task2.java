package com.syntaxclass.HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6_Task2 {
    /*
    Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php");
        WebElement alertBox1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertBox1.click();
        Alert alert=driver.switchTo().alert();
        System.out.println( alert.getText());
        alert.accept();

        WebElement alertBox2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertBox2.click();
        Alert alert2=driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();

        WebElement alertBox3=driver.findElement(By.xpath("//button[contains(text(), 'Click for Prompt Box')]"));
        alertBox3.click();
        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("Syntax");
        alert3.accept();



    }
}
