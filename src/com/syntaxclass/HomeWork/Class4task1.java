package com.syntaxclass.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userNameTextBox.sendKeys("Admin");
        WebElement passwordTexBox=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordTexBox.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.cssSelector("input[class= 'button']"));
        loginButton.click();
        WebElement SyntaxLogo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        boolean isloginButtonDisplayed= SyntaxLogo.isDisplayed();
        if (isloginButtonDisplayed){
            System.out.println("Syntax logo is displayed");
        }else{
            System.out.println("Syntax logo is not displayed");
        }
       driver.quit();
    }
}
