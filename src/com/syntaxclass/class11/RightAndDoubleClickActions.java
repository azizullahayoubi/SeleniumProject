package com.syntaxclass.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightAndDoubleClickActions {
    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement rightButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);

        action.contextClick(rightButton).perform();

        WebElement editoption = driver.findElement(By.xpath("//span[text()='Edit']"));

       // editoption.click();
        action.click(editoption).perform();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        action.doubleClick(doubleButton).perform();
        System.out.println(alert.getText());
        alert.accept();


    }
}
