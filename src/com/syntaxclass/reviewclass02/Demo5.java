package com.syntaxclass.reviewclass02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();



        driver.findElement(By.xpath("//input[@name='confirmation']")).click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
        String alertText=alert1.getText();
        Thread.sleep(2000);
        System.out.println("it is confirmation alert : "+alertText);
        alert1.accept();
        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Thread.sleep(2000);
        Alert alert2=driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Hello");
        Thread.sleep(2000);
        alert2.accept();

    }
}
