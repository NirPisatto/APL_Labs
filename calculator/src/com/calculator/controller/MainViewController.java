package com.calculator.controller;

import com.calculator.model.ArithmeticModel;
import com.calculator.model.MainViewModel;
import com.calculator.model.TrigonometryModel;
import com.calculator.view.ArithmeticView;
import com.calculator.view.MainView;
import com.calculator.view.TrigonometryView;
import com.calculator.view.componet.BaseMenuItem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MainViewController extends BaseController {
    // App config
    static String[] menus = {"Arithmetic","Trigonometry","Bitwise","Money exchange", "Storage converter", "Number system conversion","Binary Arithmetic","Set operation" ,"Exit"};

    // All pages UI
    ArithmeticView arithmeticView = new ArithmeticView();
    ArithmeticModel arithmeticModel = new ArithmeticModel();
    ArithmeticController arithmeticController = new ArithmeticController(arithmeticView, arithmeticModel,this);

    TrigonometryView trigonometryView = new TrigonometryView();
    TrigonometryModel trigonometryModel = new TrigonometryModel();
    TrigonometryController trigonometryController = new TrigonometryController(trigonometryView, trigonometryModel);



    private MainView mainView;
    private MainViewModel mainModel;

    public MainViewController(MainView mainView, MainViewModel mainModel){
        this.mainView = mainView;
        this.mainModel = mainModel;
        this.initAction();

        this.togglePage(mainModel.getCurrentPage());
    }

    public void display(){
        this.mainView.display();
    }

    public void togglePage(int nextPage){
        switch (nextPage){
            case 0:
                System.out.println("Arithmetic");
                replaceMainPanel(arithmeticController.getViewJpanel());
                break;
            case 1:
                System.out.println("Trigonometry");
                replaceMainPanel(trigonometryController.getViewJpanel());
                break;
            case 2:
                System.out.println("Bitwise");
                break;
        }
    }

    private void replaceMainPanel(JPanel nextPanel){
        this.mainView.mainPanel.removeAll();
        this.mainView.mainPanel.add(nextPanel);
        this.mainView.mainPanel.revalidate();
        this.mainView.mainPanel.repaint();
    }

    @Override
    public void initAction(){
        this.mainView.allMenu.forEach((BaseMenuItem baseMenuItem) -> {
            baseMenuItem.addActionListener(this);
        });
        this.mainView.mainFreame.addKeyListener(this.arithmeticController);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();
        if (sourceObj instanceof BaseMenuItem) {
            BaseMenuItem sourceBaseMenuItem = (BaseMenuItem)sourceObj;
            togglePage(sourceBaseMenuItem.getMenuId());
        }
    }

    @Override
    public JPanel getViewJpanel() {
        return null;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
