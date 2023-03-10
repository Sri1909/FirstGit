package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject3 extends Browser {
    public PageObject3()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//nav[@class='woocommerce-breadcrumb']")
    WebElement xpath1;
    public WebElement getText3(){
        return xpath1;
    }
}
