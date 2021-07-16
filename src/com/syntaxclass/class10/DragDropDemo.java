package com.syntaxclass.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver1.exe");
        WebDriver driver =new ChromeDriver() ;
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement dragable=driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
       // actions.dragAndDrop(dragable,dropable).perform();
        //driver.switchTo().defaultContent();
        actions.clickAndHold(dragable).moveToElement(dropable).release().build().perform();

    }
}
