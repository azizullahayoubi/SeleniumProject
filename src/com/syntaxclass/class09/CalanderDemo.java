package com.syntaxclass.class09;

import com.syntaxclass.OpenCloseQuitDriver;
import com.syntaxclass.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalanderDemo  extends OpenCloseQuitDriver {
    public static void main(String[] args) {
        OpenCloseQuitDriver openCloseQuitDriver=new OpenCloseQuitDriver();

        openCloseQuitDriver.openDriver("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement userPassword= driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");
        WebElement logInButton=driver.findElement(By.id("btnLogin"));
        logInButton.click();

        WebElement leaveButton=driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        WebElement fromCal= driver.findElement(By.id("calFromDate"));
        fromCal.click();
        WebElement monthdropDown= driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(monthdropDown);
        monthDD.selectByVisibleText("Jul");
        List<WebElement> fromDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        System.out.println(fromDates.size());

        for (WebElement fromDate: fromDates) {
            if (fromDate.getText().equals("29")){
                fromDate.click();
                break;
            }
        }


    }
}
