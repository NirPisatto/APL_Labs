package com.company;

public class Lion extends Animal {
    public Lion(String name, int weight){
        super(name,weight);
    }

    @Override
    public void who(){
        System.out.println("Lion class");
        System.out.println("name:"+super.getName());
        System.out.println("weight:"+super.getWeight());
    }
}
