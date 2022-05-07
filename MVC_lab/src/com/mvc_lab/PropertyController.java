package com.mvc_lab;

import java.util.ArrayList;

public class PropertyController {
    private PropertyModel property = new PropertyModel();
    private ArrayList<PropertyModel> properties = new ArrayList<PropertyModel>();
    private PropertyView propertyView = new PropertyView();

    public PropertyController(PropertyView propertyView, ArrayList<PropertyModel> properties){
        this.propertyView = propertyView;
        this.properties = properties;
    }

    public void addHouse(){
        // Add data in to property
        PropertyModel newProperty = new PropertyModel(propertyView.getProperty());
        newProperty.setId(properties.size());
        // Update to array of property model
        properties.add(newProperty);
    }



    public void displayListOfHouse(){
        // Display list of house
        propertyView.displayHouse(properties);
    }

    public void updateHouse(){
        // Update data in to property model
        property.setProperty(propertyView.getProperty());
        properties.get(property.getId()).setProperty(property.getProperty());
    }

    public void getPropertyByIdAndUpdate(){
        boolean founded = false;
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getId() == propertyView.getHouseId()){
                property.setProperty(properties.get(i).getProperty());
                propertyView.setProperty(property);
                founded = true;
                break;
            }
        }


        if (!founded){
            System.out.println("House id [ "+ propertyView.getHouseId() +" ] was not found.");
            System.out.println("--------------------------------");
        }else{
            propertyView.displayUpdateHouseFormView();
            updateHouse();
            System.out.println("--------------------------------");
        }
    }

}
