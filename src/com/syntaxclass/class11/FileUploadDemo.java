package com.syntaxclass.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class FileUploadDemo {
    public static String url = "https://the-internet.herokuapp.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        WebElement uploadFile=driver.findElement(By.linkText("File Upload"));
        uploadFile.click();
        WebElement choseFile=driver.findElement(By.id("file-upload"));
        choseFile.sendKeys("C:\\Users\\azizu\\Desktop\\Memory\\textFile.txt");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        driver.navigate().back();
        driver.navigate().back();



       // C:\Users\azizu\Desktop\Memory/textFile.txt

    }
}
