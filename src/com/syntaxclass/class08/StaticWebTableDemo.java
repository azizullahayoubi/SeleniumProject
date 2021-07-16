package com.syntaxclass.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class StaticWebTableDemo {
    static String url="http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       List<WebElement> rowData= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> it = rowData.iterator();
        while (it.hasNext()){
            WebElement row = it.next();
            String rowText= row.getText();
            System.out.println(rowText);
        }

      List <WebElement> colsData =  driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(colsData.size());
        for (WebElement col:colsData){
            String colText=col.getText();
            System.out.println(colText);
        }
    }
}
