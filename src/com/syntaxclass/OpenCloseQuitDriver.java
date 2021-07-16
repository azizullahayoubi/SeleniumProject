package com.syntaxclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseQuitDriver {
        public static WebDriver driver;
    public void openDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void quitDriver() {
        driver.quit();
    }

    public void closeDriver(){
        driver.close();
    }
}
