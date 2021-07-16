package com.syntaxclass.class10;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalanderDemo1 extends OpenCloseQuitDriver {
    public static void main(String[] args) {
        OpenCloseQuitDriver openCloseQuitDriver=new OpenCloseQuitDriver();

        openCloseQuitDriver.openDriver("https://www.delta.com/");
        WebElement calander= driver.findElement(By.id("input_departureDate_1"));
        calander.click();
        WebElement dMonth= driver.findElement(By.className("dl-datepicker-month-0"));
        String dmonthText=dMonth.getText();

        WebElement nextButton= driver.findElement(By.xpath("//span[text()='Next']"));
        while (!dmonthText.equals("July")) {
            nextButton.click();
            dmonthText=dMonth.getText();
        }
        List<WebElement> dpartDates= driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));

        for (WebElement departDate:dpartDates){
            if(departDate.getText().equals("17")){
                departDate.click();
                break;
            }

            WebElement rMonth= driver.findElement(By.className("dl-datepicker-month-1"));
            String returnMonthText=rMonth.getText();
            while (!returnMonthText.equals("September")){
                nextButton.click();
                returnMonthText=rMonth.getText();
            }
            List<WebElement> returnDates= driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
            for(WebElement returnDate:returnDates){
                if (returnDate.getText().equals("5")){
                    returnDate.click();
                    break;
                }

            }
            WebElement doneButton= driver.findElement(By.className("donebutton")) ;
            doneButton.click();
        }

    }
}
