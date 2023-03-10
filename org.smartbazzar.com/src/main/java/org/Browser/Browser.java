package org.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;
    public static Actions act;
    public static String fileProperties(String propertiesData)//browser
    {
        String returnData = null;
        try {
            String filelocation = System.getProperty("user.dir") + "//src//main//resources//Configuration//Configure.properties";
            File file = new File(filelocation);
            FileInputStream fileinput = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fileinput);
            returnData = prop.getProperty(propertiesData); //browser
        }
        catch(Exception e)
        {
            System.out.println("Properties" + e);
        }
        return returnData;
    }
    
    public static void OpenBrowser() {
        String choice = Browser.fileProperties("Browser");
        if (choice.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            act= new Actions(driver);
        } else if (choice.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            act= new Actions(driver);
        } else if (choice.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            act= new Actions(driver);
        } else
        {
            System.out.println("Invalid Browser");
        }

    }
    public static void OpenApplication(String url){
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Accept")).click();
    }
    public static void CloseBrowser()
    {
        driver.quit();
    }


}
