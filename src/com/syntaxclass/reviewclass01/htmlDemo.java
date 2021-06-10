package com.syntaxclass.reviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.className("inventory_item_name")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
       WebElement Menu= driver.findElement(By.id("react-burger-menu-btn"));
            Menu.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("ABOUT")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        String title=driver.getTitle();

        if (title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Boom it is correct one");
        }else{
            System.out.println("you have some thing wrong");
        }
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.partialLinkText("LOG")).click();
    }
}
