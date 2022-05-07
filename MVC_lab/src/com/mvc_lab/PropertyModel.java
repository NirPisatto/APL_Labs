package com.mvc_lab;

public class PropertyModel extends PropertyBase{

    public PropertyModel(){ }
    public PropertyModel(PropertyBase propertyBase){
        setProperty(propertyBase);
    }

    public void setProperty(PropertyBase propertyBase){
        super.setId(propertyBase.getId());
        super.setModel(propertyBase.getModel());
        super.setPrice(propertyBase.getPrice());
        super.setRoomNumber(propertyBase.getRoomNumber());
    }

    public PropertyBase getProperty(){
        PropertyBase propertyBase = new PropertyBase();
        propertyBase.setId(super.getId());
        propertyBase.setModel(super.getModel());
        propertyBase.setRoomNumber(super.getRoomNumber());
        propertyBase.setPrice(super.getPrice());
        return propertyBase;
    }
}
