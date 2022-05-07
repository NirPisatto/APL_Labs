package com.mvc_lab;

import java.util.Scanner;

public class MainMenuView {
    private int userInput = 0;

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Property management:");
        System.out.println("1.Add house");
        System.out.println("2.Display list of houses");
        System.out.println("3.Update house");
        System.out.println("4.Exit");
        System.out.print("> ");
        userInput = scanner.nextInt();
    }

    public int getUserInput() {
        return userInput;
    }
}
