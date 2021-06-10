package com.syntaxclass.reviewclass04;

import com.syntaxclass.POM.testBases.BaseClass;
import com.syntaxclass.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClassDemo extends CommonMethods {

    public static void main(String[] args) {
        BaseClass.setUpWithSpicificUrl("http://demo.guru99.com/test/simple_context_menu.html");


        WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();


        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].backgroundColor='blue'");
        teasrDown();

    }

}
