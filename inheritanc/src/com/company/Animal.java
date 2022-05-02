package com.company;

public class Animal {
    private String name;
    private int weight;

    public Animal(){
        this.name = "";
        this.weight = 0;
    }

    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }

    public void who(){
        System.out.println("Animal class");
        System.out.println("name:"+name);
        System.out.println("weight:"+weight);
    }
}
