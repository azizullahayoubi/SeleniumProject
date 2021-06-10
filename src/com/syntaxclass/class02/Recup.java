package com.syntaxclass.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        if (title.equalsIgnoreCase("facebook - log In or Sign up")) {
            System.out.println("Title is right");
        }else{
            System.out.println("Title is not right");
        }

    }
}
