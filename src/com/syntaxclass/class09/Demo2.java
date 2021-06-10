package com.syntaxclass.class09;

import com.syntaxclass.OpenCloseQuitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        OpenCloseQuitDriver openCloseQuitDriver=new OpenCloseQuitDriver();

        openCloseQuitDriver.openDriver("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        WebElement userName=openCloseQuitDriver.driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement userPassword=openCloseQuitDriver.driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");
        WebElement logInButton=openCloseQuitDriver.driver.findElement(By.id("btnLogin"));
        logInButton.click();
            Thread.sleep(2000);
        WebElement PIM=openCloseQuitDriver.driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        Thread.sleep(2000);
        WebElement addemployee=openCloseQuitDriver.driver.findElement(By.id("menu_pim_addEmployee"));
        addemployee.click();
        Thread.sleep(2000);
        WebElement firstName=openCloseQuitDriver.driver.findElement(By.id("firstName"));
        firstName.sendKeys("aziz");
        WebElement middleName=openCloseQuitDriver.driver.findElement(By.id("middleName"));
        middleName.sendKeys("aziz");
        WebElement LastName=openCloseQuitDriver.driver.findElement(By.id("lastName"));
       LastName.sendKeys("aziz");

       WebElement findEmp=openCloseQuitDriver.driver.findElement(By.id("employeeId"));
       String empId=findEmp.getAttribute("vales");

        WebElement esaveButton=openCloseQuitDriver.driver.findElement(By.id("btnSave"));
        esaveButton.click();
        WebElement employeeList=openCloseQuitDriver.driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeList.click();

        boolean flag=true;
        while (flag){
            List<WebElement> tableRows=openCloseQuitDriver.driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i <tableRows.size() ; i++) {
                String rowText=tableRows.get(i).getText();
                if (rowText.contains(empId)){
                    flag=false;
                   WebElement checkBox= openCloseQuitDriver.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));

                checkBox.click();
                WebElement deleteButton=openCloseQuitDriver.driver.findElement(By.id("btnDelete"));
                deleteButton.click();
                WebElement conformDelet=openCloseQuitDriver.driver.findElement(By.id("dialogDeleteBtn"));
                conformDelet.click();
                break;

                }

            }
            WebElement next=openCloseQuitDriver.driver.findElement(By.linkText("Next"));
            next.click();
        }



    }
}
