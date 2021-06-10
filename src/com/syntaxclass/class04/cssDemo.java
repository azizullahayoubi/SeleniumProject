package com.syntaxclass.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
    public static void main(String[] args) {

        ///   input#ctl00_MainContent_username // (#) it stand for id
        /// input[id *='username']// add attribute value
        // input[type^='sub'] // it will take the first attribute value
        // input[id $='password'] /// it will get end text of attribute
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");


    }
}
