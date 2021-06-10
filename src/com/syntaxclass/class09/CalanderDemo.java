package com.syntaxclass.class09;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalanderDemo  {
    public static void main(String[] args) {
        OpenCloseQuitDriver openCloseQuitDriver=new OpenCloseQuitDriver();

        openCloseQuitDriver.openDriver("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        WebElement userName=openCloseQuitDriver.driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement userPassword=openCloseQuitDriver.driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");
        WebElement logInButton=openCloseQuitDriver.driver.findElement(By.id("btnLogin"));
        logInButton.click();

        WebElement leaveButton=openCloseQuitDriver.driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        WebElement fromCal=openCloseQuitDriver.driver.findElement(By.id("calFromDate"));
        fromCal.click();
        WebElement monthdropDown=openCloseQuitDriver.driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(monthdropDown);
        monthDD.selectByVisibleText("Jul");
        List<WebElement> fromDates=openCloseQuitDriver.driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        System.out.println(fromDates.size());

        for (WebElement fromDate: fromDates) {
            if (fromDate.getText().equals("29")){
                fromDate.click();
                break;
            }
        }


    }
}
