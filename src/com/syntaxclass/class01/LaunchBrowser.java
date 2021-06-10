package com.syntaxclass.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();// to print url
        System.out.println(url);
        System.out.println(driver.getCurrentUrl());

        String title = driver.getTitle();// getting title of the page
        System.out.println(title);
        driver.quit();
//
//        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https:\\www.amazon.com");
    }
}
