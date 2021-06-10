package com.syntaxclass.HomeWork;

import com.syntaxclass.class02.WebOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Task3 {
    public static void main(String[] args) throws InterruptedException {
        /*HW 2
HRMS Application Negative Login:
Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("ss");
        WebElement loginButton=driver.findElement(By.cssSelector("input[name='Submit']"));
        loginButton.click();
        WebElement loginText=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        Thread.sleep(2000);
      String text=loginText.getText();
     if (loginText.isDisplayed() && text.equalsIgnoreCase("Password cannot be empty")) {
         System.out.println(text + ": is displayed.");
     }else{
         System.out.println(text+": wrong Text displayed or password text box is not empty.");
     }
      driver.quit();
    }
}
