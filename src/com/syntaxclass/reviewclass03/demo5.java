package com.syntaxclass.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class demo5 {
    public static String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();

        List<WebElement> tablerows=driver.findElements(By.id("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        Iterator<WebElement> it=tablerows.iterator();

        for (int i=0; i<tablerows.size(); i++){
            String row=tablerows.get(i).getText();
            System.out.println(row);
            if (row.contains("FamilyAlbum")){
                List <WebElement> checkBoxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkBoxes.get(i-1).click();

            }
        }

    }
    }
