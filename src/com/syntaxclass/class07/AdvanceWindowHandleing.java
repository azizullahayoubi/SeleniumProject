package com.syntaxclass.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandleing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php");

        String mainPageWindowHandle= driver.getWindowHandle();
        WebElement istagramButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement istagramAndFacebooButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        istagramButton.click();
        facebookButton.click();
        istagramAndFacebooButton.click();
       Set<String> allWindowsHandles= driver.getWindowHandles();
        System.out.println(allWindowsHandles.size());
        System.out.println(allWindowsHandles);
        Iterator <String> it =allWindowsHandles.iterator();
        while (it.hasNext()){
          String handle= it.next();

          if (handle.equals(mainPageWindowHandle)) {
              driver.switchTo().window(handle);
              System.out.println(driver.getTitle());
              driver.close();
          }
        }
         driver.switchTo().window(mainPageWindowHandle);
        istagramButton.click();
}}
