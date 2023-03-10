package org.PageObjects;

import org.Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject1 extends Browser {

    public PageObject1(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="s")
    WebElement varname;
    public WebElement Textbox(){
       return varname;
    }
   @FindBy(className="aws-search-btn_icon")
   WebElement varclass;
    public WebElement ClickIcon(){
       return varclass;

    }

}
