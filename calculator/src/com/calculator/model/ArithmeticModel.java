package com.calculator.model;

import java.util.ArrayList;

public class ArithmeticModel {
    private ArrayList<String> numberKeys = new ArrayList<String>();
    private ArrayList<String> operatorKeys = new ArrayList<String>();

    private ArrayList<String> values = new ArrayList<String>();
    private ArrayList<String> operators = new ArrayList<String>();

    public int currentValuesIndex = 0;

    public ArrayList<String> getOperators() {
        return operators;
    }
    public ArrayList<String> getValues() {
        return values;
    }

    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
    }

    public void getValues(ArrayList<String> values) {
        this.values = values;
    }

    public ArrayList<String> getNumberKeys() {
        return numberKeys;
    }

    public ArrayList<String> getOperatorKeys() { return operatorKeys; }

    public void reset(){
        values.removeAll(values);
        values.add("");

        currentValuesIndex = 0;

        operators.removeAll(operators);
    }

    public ArithmeticModel(){

        // init values
        values.add("");

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
        operatorKeys.add("+");
        operatorKeys.add("-");
        operatorKeys.add("*");
        operatorKeys.add("/");
    }
}
