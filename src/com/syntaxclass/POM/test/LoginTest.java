package com.syntaxclass.POM.test;

import com.syntaxclass.POM.Pages.LoginPage;
import com.syntaxclass.POM.testBases.BaseClass;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUpWithSpicificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginField.click();

        BaseClass.teasrDown();
    }
}
