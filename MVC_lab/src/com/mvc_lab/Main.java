package com.mvc_lab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Temporary database
        ArrayList <PropertyModel> properties = new ArrayList<PropertyModel>();

        MainMenuView mainMenuView = new MainMenuView();
        PropertyView propertyView = new PropertyView();
        PropertyController propertyController = new PropertyController(propertyView,properties);

        while (true){
            mainMenuView.displayMenu();
            if(mainMenuView.getUserInput() == 1){
                propertyView.displayAddHouseFormView();
                propertyController.addHouse();
            }else if(mainMenuView.getUserInput() == 2){
                propertyController.displayListOfHouse();
            }else if(mainMenuView.getUserInput() == 3){
                propertyView.displaySearchUpdateForHouseView();
                propertyController.getPropertyByIdAndUpdate();
            }else{
                System.exit(1);
            }
        }
    }
}
