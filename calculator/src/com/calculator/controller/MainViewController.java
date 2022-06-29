package com.calculator.controller;

import com.calculator.view.ArithmeticView;
import com.calculator.view.MainView;

import javax.swing.*;
import java.awt.*;

public class MainViewController {
    // App config
    static String[] menus = {"Arithmetic","Trigonometry","Bitwise","Money exchange", "Storage converter", "Number system conversion","Binary Arithmetic","Set operation" ,"Exit"};

    // All pages UI
    ArithmeticView arithmeticView = new ArithmeticView();


    private int currentPage = 0;
    private MainView mainView = new MainView();

    public MainViewController(MainView mainView){
        this.mainView = mainView;
        this.currentPage = 0;
    }

    public void display(){
        this.mainView.display();
    }

    public void togglePage(int nextPage){
        switch (nextPage){
            case 0:
                System.out.println("Arithmetic");
                this.mainView.mainPanel.removeAll();
                this.mainView.mainPanel.add(arithmeticView.getInterface());
                this.mainView.mainPanel.revalidate();
                break;
            case 1:
                System.out.println("Trigonometry");
                this.mainView.mainPanel.removeAll();
                this.mainView.mainPanel.add(arithmeticView.getInterface());
                this.mainView.mainPanel.revalidate();
                break;
            case 2:
                System.out.println("Bitwise");
                break;
        }
    }

    private void replaceMainPanel(JPanel nextPanel){
        this.mainView.mainPanel = nextPanel;
    }

}
