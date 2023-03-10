package org.example;

import org.Browser.Browser;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;

public class Sample {
    public static void main(String[] args) throws Exception
    {
        Browser.OpenBrowser();
        Browser.OpenApplication("https://www.smartbazaar.co.uk/");
        Page1.GetBrowserTitle();
        Page1.Seachdata("Flowers");
        Page1.Enterdata();
        System.out.println(Page2.VerificationPage2());
        Page2.SelectProduct("LOTUS FLOWER");
       System.out.println(Page3.VerificationPage3());
        //Browser.CloseBrowser();*/
    }
}
