package com.syntaxclass.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementComman {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver() ;
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton= driver.findElement(By.cssSelector("input[value='0 - 5']"));
       boolean isAgeRadioBottunisEnabled = ageRadioButton.isEnabled();
       if (!isAgeRadioBottunisEnabled){
           System.out.println("bottun is not enable");
       }else{
           System.out.println("bottun is enable");
       }
        System.out.println(isAgeRadioBottunisEnabled);
       boolean isAgeRadioBottunisdiabled= ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioBottunisdiabled);
       boolean isAgeRadioBottunisselected=  ageRadioButton.isSelected();
        System.out.println("before clicking "+isAgeRadioBottunisselected);
        ageRadioButton.click();
        isAgeRadioBottunisselected=ageRadioButton.isSelected();
        System.out.println("after clicking "+isAgeRadioBottunisselected);

        driver.quit();
    }
}
