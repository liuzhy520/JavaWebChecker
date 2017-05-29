package com.webspider.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wayne on 29/05/2017.
 *
 */
public class HomePage {
    private JPanel homePanel;
    private JButton button1;

    public HomePage() {
        initViews();
        setViews();
    }

    private void initViews(){
        homePanel.setPreferredSize(new Dimension(800, 600));

    }

    private void setViews(){
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "diunee");
            }
        });
    }

    public JPanel getContent(){
        return homePanel;
    }
}
