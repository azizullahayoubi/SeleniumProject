package com.syntaxclass.seleliniumAndGitReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver1.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/table-pagination-demo.php");
        driver.manage().window().maximize();
    }
}
