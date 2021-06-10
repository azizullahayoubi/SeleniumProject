package com.syntaxclass.HomeWork;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class08Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
         */
        OpenCloseQuitDriver closeOpenQuitDriver=new OpenCloseQuitDriver();
       closeOpenQuitDriver.openDriver ("https://the-internet.herokuapp.com/dynamic_controls");
        WebDriverWait wait=new WebDriverWait(closeOpenQuitDriver.driver, 20);
        WebElement checkBox= closeOpenQuitDriver.driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeButton=closeOpenQuitDriver.driver.findElement(By.xpath("//button[@type='button']"));
        removeButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement text=closeOpenQuitDriver.driver.findElement(By.id("message"));
       boolean isDesplyed= text.isDisplayed();
        System.out.println("Text displayed: "+isDesplyed);
        WebElement enable=closeOpenQuitDriver.driver.findElement(By.xpath("//button[text()='Enable']"));
        enable.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text2=closeOpenQuitDriver.driver.findElement(By.xpath("//p[@id='message']"));
        boolean isDesplyed2= text2.isDisplayed();
        System.out.println("Text2 displayed: "+isDesplyed2);
          WebElement textBox=closeOpenQuitDriver.driver.findElement(By.xpath("//input[@type='text']"));
          textBox.sendKeys("Textbox");
          WebElement disableButton=closeOpenQuitDriver.driver.findElement(By.xpath("//button[text()='Disable']"));
          disableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text3=closeOpenQuitDriver.driver.findElement(By.xpath("//p[@id='message']"));
        boolean isDesplyed3= text3.isDisplayed();
        System.out.println("Text2 displayed: "+isDesplyed3);


           closeOpenQuitDriver.quitDriver();




    }
}
