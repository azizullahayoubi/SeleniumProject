package com.syntaxclass.reviewclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Demo4 {
    public static String url="https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        List<WebElement> rows =driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rows.size());

        for (WebElement row:rows){
            System.out.println(row.getText());
        }
        List<WebElement> headerrows =driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(rows.size());

        for (WebElement row:headerrows){
            System.out.println(row.getText());
        }

    }

}
