package com.company;

public class Executive extends Employee {
    public Executive(int age_, String name_ ,String gender_){
        super.age = age_;
        super.name = name_;
        super.gender = gender_;
    }
    @Override
    public void display(){
        System.out.println(super.name +" is an executive.");
    }
}
