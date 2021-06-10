package com.syntaxclass.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        String url=driver1.getCurrentUrl();
        driver1.get(url);


//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver =new ChromeDriver();
//        driver.get("http://facebook.com");
//        driver.navigate().to("http://google.com");
//        Thread.sleep(1000);// for time delay
//        driver.navigate().back();// go back
//        Thread.sleep(1000);
//        driver.navigate().forward();// go foreword
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        //driver.quit();// will quit the whole browser
//        driver.close();// will close the current tab
    }
}
