package com.syntaxclass.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetLinkFromEbay {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver =new ChromeDriver() ;
            driver.get("http://ebay.com");
           List<WebElement> allLinks= driver.findElements(By.tagName("a"));
            System.out.println(allLinks.size());

            for (WebElement link:allLinks){
               String fulllink= link.getAttribute("href");
               String linkText= link.getText();
               // System.out.println(linkText);
                if (!linkText.isEmpty()){
                    System.out.println(linkText+"        "+fulllink);

                }

            }

    }
}
