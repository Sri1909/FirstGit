package org.Pages;

import io.cucumber.java.an.E;
import org.Browser.Browser;
import org.PageObjects.PageObject1;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Page1 extends Browser {

    public static PageObject1 obj1;
    public static String GetBrowserTitle()
    {
        return driver.getTitle();
    }
    public static void Seachdata(String Searchdata){
       obj1= new PageObject1();
       obj1.Textbox().sendKeys(Searchdata);
    }
    public static void Enterdata() throws Exception {

        obj1.ClickIcon().submit();
        Thread.sleep(2000);
    }

}
