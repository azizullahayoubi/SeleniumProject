package com.syntaxclass.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class demo3 {
    public static String url="http://the-internet.herokuapp.com/dynamic_loading/1";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        Wait<WebDriver> wait1= new FluentWait<>(driver).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchFieldException.class)
                          .withTimeout(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button")).click();
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(), 'Hello')]")));
        WebElement textis=driver.findElement(By.xpath("//h4[contains(text(), 'Hello')]"));
        String text=textis.getText();
        System.out.println(text);

    }
}
