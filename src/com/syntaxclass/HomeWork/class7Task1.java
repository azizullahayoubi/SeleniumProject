package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class7Task1 {
    /*
    Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
     */
    static String url="https://demoqa.com/browser-windows";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String mainPageWindowHandle= driver.getWindowHandle();

        WebElement newTab=driver.findElement(By.id("tabButton"));
        WebElement newWindow= driver.findElement(By.id("windowButton"));
        WebElement newWindowMessage= driver.findElement(By.id("messageWindowButton"));

        newTab.click();
        newWindow.click();
        newWindowMessage.click();

        Set <String> allWindowsHandle= driver.getWindowHandles();
        System.out.println(allWindowsHandle.size());
        System.out.println(allWindowsHandle);

        Iterator <String> it = allWindowsHandle.iterator();
        while (it.hasNext()){
            String handle= it.next();
            if (handle.equals(mainPageWindowHandle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle()+" Title displayed");

            }else {
                System.out.println("Title did not displayed");
            }
        }
        driver.switchTo().window(mainPageWindowHandle);


    }
}
