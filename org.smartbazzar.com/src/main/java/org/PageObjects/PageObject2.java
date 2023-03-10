package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject2 extends Browser {

    public PageObject2()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//ul[@class='products columns-5']")
    WebElement varpath;
    public WebElement SelectPdt(){
        return varpath;
    }
    @FindBy(xpath="//nav[@class='woocommerce-breadcrumb']")
    WebElement xpath1;

    public WebElement saveText(){
        return xpath1;
    }
}
