package com.syntaxclass.POM.Pages;

import com.syntaxclass.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement userNameField= driver.findElement(By.id("txtUsername"));
    public WebElement passwordField= driver.findElement(By.id("txtPassword"));
    public WebElement loginField= driver.findElement(By.id("btnLogin"));

}
