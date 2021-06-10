package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class5_Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(1000);
        WebElement createAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
        createAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Aziz");
        driver.findElement(By.name("lastname")).sendKeys("Ayoubi");
        driver.findElement(By.name("reg_email__")).sendKeys("aziz@yahoo.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Syntax123");

       WebElement monthDD= driver.findElement(By.id("month"));
        Select select=new Select(monthDD);
        select.selectByVisibleText("Sep");
        Thread.sleep(1000);
        WebElement dayDD= driver.findElement(By.id("day"));
        Select select1=new Select(dayDD);
        select1.selectByVisibleText("1");
        Thread.sleep(1000);
        WebElement yearDD= driver.findElement(By.id("year"));
        Select select2=new Select(yearDD);
        select2.selectByVisibleText("1985");
        Thread.sleep(1000);
        List <WebElement> sexBoxes=  driver.findElements(By.name("sex"));
       for (WebElement sexBox:sexBoxes){
           String sexValue=sexBox.getAttribute("value");
           if (sexValue.equalsIgnoreCase("2")){
               Thread.sleep(1000);
               sexBox.click();
           }
       }
       driver.findElement(By.name("websubmit")).click();
        driver.quit();

    }
}
