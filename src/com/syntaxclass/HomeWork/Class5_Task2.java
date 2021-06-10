package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class5_Task2 {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement allCatagries=driver.findElement(By.id("gh-cat"));
        Select select=new Select(allCatagries);
        List<WebElement> optiops=select.getOptions();
        for (WebElement option:optiops){
            String text=option.getText();
            System.out.println(text);
         if (text.equalsIgnoreCase("Computers/Tablets & Networking")){
             Thread.sleep(1000);
             option.click();
         }
        }
        driver.findElement(By.id("gh-btn")).click();
        WebElement header=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        boolean isDisplayed=header.isDisplayed();
        if (isDisplayed){
            System.out.println("Header is displayed");
        }else{
            System.out.println("Header did not display");
        }



    }
}
