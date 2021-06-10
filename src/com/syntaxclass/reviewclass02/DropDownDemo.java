package com.syntaxclass.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        String url = "https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D";
        driver.get(url);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='211154525']"));
        Select select=new Select(dropdown);
        //by index
        select.selectByIndex(2);
        //by value
        select.selectByValue("2657263886");
        //by visibletext
        select.selectByVisibleText("Answer Choice A");
        //loop through all the options that are avialable
        List <WebElement> all_options=select.getOptions();
        System.out.println("all options  :"+ all_options);
        int size=all_options.size();
        System.out.println("the sizs of your list is :" +size);
        for (WebElement option: all_options){
            System.out.println("the text of option is :"+ option.getText());
        }


    }
}
