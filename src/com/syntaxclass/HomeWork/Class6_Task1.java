package com.syntaxclass.HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6_Task1 {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php");
        driver.switchTo().frame(0);
        WebElement platformlogo= driver.findElement(By.xpath("//h3 [(text()='Welcome to Syntax Automation ')]"));
        boolean isdisplayed=platformlogo.isDisplayed();
        System.out.println(isdisplayed);
        String text=platformlogo.getText();
        if (isdisplayed  && text.equalsIgnoreCase("WELCOME TO SYNTAX AUTOMATION TESTING PLATFORM")){
            System.out.println(text+" is displayed");
        }else {
            System.out.println(text+" did not displayed");
        }
        Thread.sleep(2000);
       driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement iFrame=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);
        WebElement enrollButton=driver.findElement(By.xpath("//a[@class='enroll-btn']"));
       boolean isEnabled= enrollButton.isEnabled();
        System.out.println(isEnabled);
        if (isEnabled){
            System.out.println("Enroll Button is enable");
        }else {
            System.out.println("Enroll Button is not enable");
        }

    }
}
