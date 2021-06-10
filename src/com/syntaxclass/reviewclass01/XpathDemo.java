package com.syntaxclass.reviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://bbc.com");
        Thread.sleep(2000);
        //click on sign in
        driver.findElement(By.xpath("//a[@id='idcta-link']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains  (@href,'age?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with (@id ,'day')]")).sendKeys("01");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with (@id ,'month')]")).sendKeys("09");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with (@id ,'year')]")).sendKeys("1982");
        Thread.sleep(2000);
        driver.findElement(By.xpath("button button--full-width")).click();

    }
}
