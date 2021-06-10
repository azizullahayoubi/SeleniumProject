package com.syntaxclass.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
//  //a[text()='Fashion']
        //   //input [contains(@placeholder,'Email')] element part taxt
        //  //a[contains(text(), 'Create New')] // get tax
        //   //input[@id='calFromDate']/following-sibling::img// advance xpath to go down
        //   //span[text()='& Orders']/preceding-sibling::span// to go up
        //    //input[@id='email']/ancestor::form

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='txt']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();


    }
}
