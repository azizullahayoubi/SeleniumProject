package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Syntax");
        driver.findElement(By.name("lastname")).sendKeys("lolol");
        driver.findElement(By.name("reg_email__")).sendKeys("22299988877");
        driver.findElement(By.id("password_step_input")).sendKeys("Syntax123");
        driver.findElement(By.name("websubmit")).click();
        driver.close();
        driver.quit();

    }

}
