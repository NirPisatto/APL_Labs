package com.mvc_lab;

public class PropertyBase {
    private int id;
    private String model;
    private int roomNumber;
    private int price;

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
