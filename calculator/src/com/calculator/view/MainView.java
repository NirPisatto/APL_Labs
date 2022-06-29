package com.calculator.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    public JFrame mainFreame = new JFrame();
    public JPanel mainPanel = new JPanel();

    private int currentMenu = 0;



    public MainView(){
        mainFreame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFreame.setResizable(false);
        mainFreame.setSize(550,700);

        mainPanel.setSize(550,700);
        mainPanel.setBackground(Color.decode("#ff12ff"));
    }



    public void display(){
        this.mainFreame.add(mainPanel, BorderLayout.CENTER);
        this.mainPanel.setLayout(new GridLayout(1,1));


        this.mainFreame.setVisible(true);
    }
}
