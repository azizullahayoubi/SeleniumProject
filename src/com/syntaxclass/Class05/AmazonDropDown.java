package com.syntaxclass.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDropDown {
    public static String url="https://amazon.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement catagorySdd= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(catagorySdd);
      /*  List<WebElement> options= select.getOptions();
       *//* for (WebElement option:options){
            String optionText=option.getText();
            System.out.println(optionText);
        }*/
        boolean ismultiple=select.isMultiple();

        if (!ismultiple) {
            List<WebElement> options = select.getOptions();

            Iterator<WebElement> it = options.iterator();
            while (it.hasNext()){
                WebElement next = it.next();
                String optionText = next.getText();
                System.out.println(optionText);

            }
        }
    }
}
