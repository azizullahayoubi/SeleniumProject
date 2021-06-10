package com.syntaxclass.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php");
        //Switch to the iframe under consideration
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        //to interact with any other element on the the home page we need to swtich back
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
        //switch using webelement
        WebElement iframe = driver.findElement(By.xpath("//iframe[@name='FrameOne']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[@id='btn_inter_example']")).click();
        driver.switchTo().defaultContent();



    }
}
