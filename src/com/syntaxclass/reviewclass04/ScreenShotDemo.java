package com.syntaxclass.reviewclass04;

import com.syntaxclass.POM.testBases.BaseClass;
import com.syntaxclass.utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo extends CommonMethods {
    public static void main(String[] args) {
        BaseClass.setUpWithSpicificUrl("http://demo.guru99.com/test/simple_context_menu.html");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,new File("New folder/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
