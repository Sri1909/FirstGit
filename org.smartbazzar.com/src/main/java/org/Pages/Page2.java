package org.Pages;

import org.Browser.Browser;
import org.PageObjects.PageObject1;
import org.PageObjects.PageObject2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Page2 extends Browser {
    public static PageObject2 obj2;
    public static void SelectProduct(String Product) throws Exception {

    Thread.sleep(3000);

    List<WebElement> List1= obj2.SelectPdt().findElements(By.xpath(".//li/div/div/div[3]/div[1]/h4/a"));
      for(int i=0; i<List1.size(); i++)
        {
           String fromText = List1.get(i).getText();
             if(fromText.equalsIgnoreCase(Product))
             {
               act.moveToElement(List1.get(i)).click().build().perform();
                 break;
            }
        }
      Thread.sleep(3000);
    }

    public static String VerificationPage2(){

        obj2= new PageObject2();
        return obj2.saveText().getText();
    }
}
