package com.syntaxclass.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://material-ui.com/components/radio-buttons/");

       List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='gender1']"));

        for (WebElement radioButton:radioButtons){
            String value=radioButton.getAttribute("value");
            if (value.equalsIgnoreCase("female")){
                radioButton.click();
            }else if(!radioButton.isEnabled()){
                System.out.println("radio button is not enabled");

            }

        }

    }
}
