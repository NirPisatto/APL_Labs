package com.calculator.model;

import java.util.ArrayList;

public class ArithmeticModel {
    private ArrayList<String> numberKeys = new ArrayList<String>();
    private ArrayList<String> operatorKeys = new ArrayList<String>();

    private String result = "";
    private String operation = "";
    private String lastValue = "";
    private String currentValue = "";
    private Boolean onWaitNumber = true;

    public Boolean getOnWaitNumber() {
        return onWaitNumber;
    }

    public void setOnWaitNumber(Boolean onWaitNumber) {
        this.onWaitNumber = onWaitNumber;
    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public String getLastValue() {
        return lastValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public void setLastValue(String lastValue) {
        this.lastValue = lastValue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int currentValuesIndex = 0;



    public ArrayList<String> getNumberKeys() {
        return numberKeys;
    }

    public ArrayList<String> getOperatorKeys() { return operatorKeys; }

    public void clear(){
        result = "";
    }

    public void reset(){
        result = "";
        lastValue = "";
        currentValue = "";
        operation = "";
        onWaitNumber = true;
    }

    public ArithmeticModel(){

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
