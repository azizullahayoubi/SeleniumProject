package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("aziz");
        driver.findElement(By.name("customer.lastName")).sendKeys("lol");
        driver.findElement(By.id("customer.address.street")).sendKeys("Syntax123");
        driver.findElement(By.id("customer.address.city")).sendKeys("Sprinfield");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22152");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("222222222");
        driver.findElement(By.id("customer.ssn")).sendKeys("8889999000");
        driver.findElement(By.id("customer.username")).sendKeys("Tester");
        driver.findElement(By.id("customer.password")).sendKeys("Tester123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Tester123");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
