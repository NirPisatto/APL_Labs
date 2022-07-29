package com.calculator.view;

import com.calculator.view.componet.BaseMenuItem;

import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

public class MainView {
    static String[] menus = {"Arithmetic","Trigonometry","Bitwise","Money exchange", "Storage converter", "Number system conversion","Binary Arithmetic","Set operation" ,"Exit"};
    public JFrame mainFreame = new JFrame();
    public JPanel mainPanel = new JPanel();

    public JMenuBar mainMenuBar = new JMenuBar();
    public JMenu mainMenu = new JMenu("Menus");
    public ArrayList<BaseMenuItem> allMenu = new ArrayList<BaseMenuItem>();


    public MainView(){
        mainFreame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFreame.setResizable(false);
        mainFreame.setSize(550,900);
        mainFreame.setFocusable(true);
        mainFreame.requestFocus();
        mainFreame.requestFocusInWindow();

        mainPanel.setSize(550,900);
        mainPanel.setBackground(Color.decode("#ff12ff"));

        this.initMenu();
    }


    public void display(){
        this.mainFreame.add(mainPanel, BorderLayout.CENTER);
        this.mainPanel.setLayout(new GridLayout(1,1));
        this.mainFreame.setVisible(true);
    }

    private void initMenu(){
        for (int i = 0; i < menus.length; i++) {
            allMenu.add(new BaseMenuItem(menus[i],i));
            this.mainMenu.add(allMenu.get(i));
        }
        this.mainMenuBar.add(mainMenu);
        this.mainFreame.setJMenuBar(mainMenuBar);
    }
}
