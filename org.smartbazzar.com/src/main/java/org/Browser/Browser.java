package org.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser {
   // public static RemoteWebDriver driver;
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
    
    public static void OpenBrowser() throws MalformedURLException {
        String choice = Browser.fileProperties("Browser");
        String browserstack_Username=Browser.fileProperties("bsUsername");
        String browserstack_AccessKey = Browser.fileProperties("bsAccessKey");
        if (choice.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            act= new Actions(driver);
        } else if (choice.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            act= new Actions(driver);
        } else if (choice.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            act= new Actions(driver);
        }   else if (choice.equalsIgnoreCase("remoteChrome")) {
            String URL = "https://"+browserstack_Username+":"+browserstack_AccessKey+"@hub-cloud.browserstack.com/wd/hub";

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "11");
            caps.setCapability("browser", "Chrome");


            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        }

        else if (choice.equalsIgnoreCase("remoteFirefox")) {
            String URL = "https://"+browserstack_Username+":"+browserstack_AccessKey+"@hub-cloud.browserstack.com/wd/hub";

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Ventura");
            caps.setCapability("browser", "Firefox");


            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        }
        else
        {
            System.out.println("Invalid Browser");
        }

    }
    public static void OpenApplication(String url) throws Exception{
        Thread.sleep(3000);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.className("sgpb-popup-close-button-2")).click();
        driver.findElement(By.linkText("Accept")).click();
    }
    public static void CloseBrowser()
    {
        driver.quit();
    }


}
