package com.webspider;

import com.webspider.view.HomePage;
import com.webspider.skyscanner_hk.HKSpider;

import javax.swing.*;

/**
 * Created by wayne on 29/05/2017.
 * program entrance
 */
public class Run {

    public static void main(String args[]) {
        System.out.println("Hello World!");
        new HKSpider().startTask();
        JFrame homePage = new JFrame("diu nee");
        homePage.setContentPane(new HomePage().getContent());
        homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homePage.pack();
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
    }

}
