package com.syntaxclass.POM.Pages;

import com.syntaxclass.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userNameTextbox;

    @FindBy(xpath = "//input[@id='txtPassword']")
   public WebElement passwordTextBox;

   @ FindBy(css="input#btnLogin")
    public WebElement loginBtn;

    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
