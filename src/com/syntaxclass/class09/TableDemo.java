package com.syntaxclass.class09;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableDemo {
    public static void main(String[] args) {
        OpenCloseQuitDriver openCloseQuitDriver=new OpenCloseQuitDriver();

        openCloseQuitDriver.openDriver("http://syntaxtechs.com/selenium-practice/table-pagination-demo.php");
        List<WebElement> tableRows=openCloseQuitDriver.driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));

        WebElement nextButton=openCloseQuitDriver.driver.findElement(By.xpath("//a[@class='next_link']"));
         boolean flag=true;
         while (flag){
             for (WebElement  tableRow:tableRows){
                 String rowText=tableRow.getText();
                 if (!rowText.isEmpty()){
                     System.out.println(rowText);
                 }
                   if(rowText.isEmpty()){
                       flag=false;
                   }
                 /*if (rowText.contains("Archy J")){
                     flag=false;
                     System.out.println(rowText);
                     break;
                 }*/
             }
            nextButton.click();
         }
    }
}
