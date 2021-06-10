package com.syntaxclass.POM.Pages;

import com.syntaxclass.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPagew extends CommonMethods {

    @FindBy (id="welcome")
    public WebElement welcomeAdmin;
    public DashboardPagew(){
        PageFactory.initElements(driver,this);
    }
}
