package com.calculator;

import com.calculator.controller.MainViewController;
import com.calculator.model.MainViewModel;
import com.calculator.view.MainView;

public class Main {

    public static void main(String[] args) {
        MainView view = new MainView();
        MainViewModel model = new MainViewModel();
        MainViewController controller = new MainViewController(view, model);

        controller.display();
    }
}
