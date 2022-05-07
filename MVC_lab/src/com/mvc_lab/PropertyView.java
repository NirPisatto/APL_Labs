package com.mvc_lab;

import java.util.ArrayList;
import java.util.Scanner;

public class PropertyView {
    private Scanner scanner = new Scanner(System.in);
    private PropertyBase property = new PropertyBase();
    private int houseId = 0;

    public void displayAddHouseFormView(){
        System.out.println("----------Add house----------");
        System.out.print("Room number: ");
        property.setRoomNumber(scanner.nextInt());
        System.out.print("Price: ");
        property.setPrice(scanner.nextInt());
        System.out.print("Model: ");
        scanner.nextLine();
        property.setModel(scanner.nextLine());
        System.out.println("\nNew house has been added.");
        System.out.println("-----------------------------");
    }

    public void displayHouse(ArrayList<PropertyModel> properties){
        System.out.println("--------------List of house---------------");
        System.out.println("ID\t\tModel\t\tRoom\t\tPrice");
        if (properties.size() <= 0) System.out.println("No data");

        for (int i = 0; i < properties.size(); i++) {
            property = properties.get(i).getProperty();
            System.out.println(property.getId()+"\t\t"+property.getModel()+"\t\t"+property.getRoomNumber()+"\t\t"+property.getPrice());
        }

        System.out.println("------------------------------------------");
    }

    public void displayUpdateHouseFormView(){
        displaySingleHouse();
        property.setModel(scanner.nextLine());
        System.out.print("Model: ");
        property.setModel(scanner.nextLine());
        System.out.print("Room number: ");
        property.setRoomNumber(scanner.nextInt());
        System.out.print("Price: ");
        property.setPrice(scanner.nextInt());
    }

    public void displaySearchUpdateForHouseView(){
        System.out.println("----------Update house----------");
        System.out.print("Input house ID: ");
        houseId = scanner.nextInt();
    }

    private void displaySingleHouse(){
        System.out.println("House ID  : "+property.getId());
        System.out.println("Model     : "+property.getModel());
        System.out.println("Room      : "+property.getRoomNumber());
        System.out.println("Price     : "+property.getPrice());
    }

    public void setProperty(PropertyBase property) {
        this.property = property;
    }

    public PropertyBase getProperty(){
        return property;
    }

    public int getHouseId() {
        return houseId;
    }
}
