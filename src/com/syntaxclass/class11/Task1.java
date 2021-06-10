package com.syntaxclass.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static String url = "https://aa.com/homePage.do";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //select depart date picker
        WebElement clickOnDepartDatePicker = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
        clickOnDepartDatePicker.click();
        //pick 20th of May from calender
        WebElement selectDepartDay = driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='20']"));
        selectDepartDay.click();
        //select return day picker
        WebElement clickOnReturnDatePicker = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
        clickOnReturnDatePicker.click();
        //pick 20th of May from calender
        WebElement selectReturnDay = driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='22']"));
        selectReturnDay.click();
        WebElement destinationTo = driver.findElement(By.xpath("//input[@name='destinationAirport']"));
        destinationTo.sendKeys("LAX");
        WebElement selectSearchBttn = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
        selectSearchBttn.click();
        Thread.sleep(10000);
        driver.quit();
    }

}
