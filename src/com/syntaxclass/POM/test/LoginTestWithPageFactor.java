package com.syntaxclass.POM.test;

import com.syntaxclass.POM.Pages.DashboardPagew;
import com.syntaxclass.POM.Pages.LoginPageWithPageFactory;
import com.syntaxclass.POM.testBases.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactor {
    public static void main(String[] args)  {
        BaseClass.setUpWithSpicificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();
        loginPageWithPageFactory.userNameTextbox.sendKeys("Admin");
        loginPageWithPageFactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
       File sourceFile= ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,new File("Screenshots/HARMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
         DashboardPagew dashboardPagew=new DashboardPagew();
      String welcomeText=  dashboardPagew.welcomeAdmin.getText();
        System.out.println(welcomeText);

        BaseClass.teasrDown();

    }
}
