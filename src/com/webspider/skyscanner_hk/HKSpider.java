package com.webspider.skyscanner_hk;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.webspider.base.BaseSpider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.css.sac.CSSException;
import org.w3c.css.sac.CSSParseException;
import org.w3c.css.sac.ErrorHandler;
import org.w3c.dom.html.HTMLElement;
import sun.tools.jconsole.HTMLPane;

import javax.xml.bind.Element;
import java.io.IOException;

/**
 * Created by wayne on 29/05/2017.
 * check information for skyscanner HK
 */
public class HKSpider extends BaseSpider{
    private static String url = "https://www.skyscanner.com.hk/transport/flights/can/mela/170531/airfares-from-guangzhou-to-melbourne-in-may-2017.html?adults=1&children=0&adultsv2=1&childrenv2=&infants=0&cabinclass=economy&rtn=0&preferdirects=false&outboundaltsenabled=false&inboundaltsenabled=false&ref=home#details/10342-1705310900--32439-0-13981-1705312030";


    private void loadPage(){
//        WebClient wc = new WebClient();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement articles = driver.findElement(By.className("article"));
    }

    public void startTask(){
        System.out.print("diunee");
        loadPage();


    }
}
