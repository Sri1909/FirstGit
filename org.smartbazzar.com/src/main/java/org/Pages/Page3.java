package org.Pages;

import org.PageObjects.PageObject1;
import org.PageObjects.PageObject3;
import org.openqa.selenium.By;
import org.Browser.Browser;


public class Page3 extends Browser{
    public static PageObject3 obj3;
    public static String VerificationPage3() throws Exception{
        Thread.sleep(2000);
        obj3=new PageObject3();
        return obj3.getText3().getText();
    }
}
