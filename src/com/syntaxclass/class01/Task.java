package com.syntaxclass.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url + " " + title);
        driver.quit();

    }
}
