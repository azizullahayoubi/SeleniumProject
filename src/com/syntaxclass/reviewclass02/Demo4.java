package com.syntaxclass.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php");

        WebElement multiDD=driver.findElement(By.name("States"));
        Select select=new Select(multiDD);

        boolean ismultDD=select.isMultiple();
        System.out.println("is the drop down multiple"+ismultDD);
        // select california and ohio

        select.selectByValue("California");
        Thread.sleep(2000);
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.deselectAll();



    }
}
