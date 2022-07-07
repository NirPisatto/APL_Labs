package com.calculator.model;

import java.util.ArrayList;

public class TrigonometryModel {
    private ArrayList<String> numberKeys = new ArrayList<String>();
    private ArrayList<String> operatorKeys = new ArrayList<String>();

    private String value = "";



    public TrigonometryModel(){

        // init num keys
        numberKeys.add("0");
        numberKeys.add("1");
        numberKeys.add("2");
        numberKeys.add("3");
        numberKeys.add("4");
        numberKeys.add("5");
        numberKeys.add("6");
        numberKeys.add("7");
        numberKeys.add("8");
        numberKeys.add("9");

        // init operator keys
        operatorKeys.add("1/x");
        operatorKeys.add("X^2");
        operatorKeys.add("Sin");
        operatorKeys.add("Cos");
        operatorKeys.add("Tan");
        operatorKeys.add("Cot");

    }

    public ArrayList<String> getNumberKeys() {
        return numberKeys;
    }

    public ArrayList<String> getOperatorKeys() {
        return operatorKeys;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void reset(){
        this.value = "";
    }
}
