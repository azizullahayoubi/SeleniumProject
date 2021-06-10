package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class7Task2 {
    /*
    navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
     */
    static String url="http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement link=driver.findElement(By.xpath("//a[@data-ajax='true']"));
        link.click();
        WebElement getText=driver.findElement(By.xpath("//div[@class='ContactUs']"));
        System.out.println(getText.getText());


    }
}
