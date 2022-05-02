package com.company;

public class Employee extends Person{
    public int personal_number;
    public Employee(){
        super.age = 0;
        super.name = "";
        super.gender = "Unknown";

    }
    public Employee(int age_, String name_ ,String gender_){
        super.age = age_;
        super.name = name_;
        super.gender = gender_;
    }
    public void display(){
        System.out.println(super.name +" is an employee.");
    }
}
