package com.syntaxclass.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);

        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();
       Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        mainPageHandle = it.next();
       String childHandle = it.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);// switching back to main window
        driver.close();

    }
}
