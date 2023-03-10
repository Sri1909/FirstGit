package org.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static org.Browser.Browser.driver;

public class ScreenshotTestcase1 {
    public static void TakeScreenShot(String name) {
        try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);

            File Src = scrShot.getScreenshotAs(OutputType.FILE);

            String filePath = System.getProperty("user.dir") + "//target//Screenshot//" + name + ".png";
            File Dest = new File(filePath);
            FileUtils.copyFile(Src, Dest);
        } catch (Exception e) {
            System.out.println("Screen Captured");
        }
    }
}
