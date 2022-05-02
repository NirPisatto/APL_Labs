package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Lion lion = new Lion("Leo",40);
        // Cat cat = new Cat("Lyly",30);
        // lion.who();
        // cat.who();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Executive> executives = new ArrayList<Executive>();
        for (int i = 0; i < 5; i++) {
            employees.add(new Employee(10,"name"+i,"Male"));
            executives.add(new Executive(11,"name"+i,"Female"));
        }

        for (int i = 0; i < 5; i++) {
            employees.get(i).display();
        }
        for (int i = 0; i < 5; i++) {
            executives.get(i).display();
        }
        
        
        
        

    }
}
