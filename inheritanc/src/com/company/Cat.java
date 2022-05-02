package com.company;

public class Cat extends Animal {
    public Cat(String name, int weight){
        super(name,weight);
    }
    @Override
    public void who(){
        System.out.println("Cat class");
        System.out.println("name:"+super.getName());
        System.out.println("weight:"+super.getWeight());
    }
}
