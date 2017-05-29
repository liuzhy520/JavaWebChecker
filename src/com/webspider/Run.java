package com.webspider;

import com.webspider.view.HomePage;
import com.webspider.skyscanner_hk.HKSpider;

/**
 * Created by wayne on 29/05/2017.
 * program entrance
 */
public class Run {

    public static void main(String args[]) {
        System.out.println("Hello World!");
        new HKSpider().startTask();
        new HomePage();
    }

}
