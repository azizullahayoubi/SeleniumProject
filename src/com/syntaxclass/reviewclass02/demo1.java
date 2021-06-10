package com.syntaxclass.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        WebElement redCheckBox= driver.findElement(By.xpath("//input[@type='checkbox'][@value='red']"));

        boolean redCheckBoxIsEnabled= redCheckBox.isEnabled();
        System.out.println("is this check box enable: "+redCheckBoxIsEnabled);
        boolean redCheckBoxIsSelected= redCheckBox.isSelected();
        System.out.println("is this check box enable: "+redCheckBoxIsSelected);

        Thread.sleep(2000);
        redCheckBox.click();
        redCheckBoxIsSelected=redCheckBox.isSelected();
        System.out.println("is this check box enable: "+redCheckBoxIsSelected);

       List <WebElement>checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Number of check boxes "+checkBoxes.size());
        // select yellow, orange and purple.
        for (WebElement checkBox:checkBoxes){
            String checkBoxValue= checkBox.getAttribute("value");
            if (checkBoxValue.equalsIgnoreCase("yellow")){
                checkBox.click();

            }

            if (checkBoxValue.equalsIgnoreCase("Orange")){
                checkBox.click();

            }

            if (checkBoxValue.equalsIgnoreCase("Purple")){
                checkBox.click();

            }

        }

    }
}
