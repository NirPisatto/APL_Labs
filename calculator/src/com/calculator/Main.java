package com.calculator;

import com.calculator.controller.MainViewController;
import com.calculator.view.MainView;

public class Main {

    public static void main(String[] args) {
        MainView view = new MainView();
        MainViewController viewController = new MainViewController(view);

        viewController.display();
        viewController.togglePage(0);
    }
}
