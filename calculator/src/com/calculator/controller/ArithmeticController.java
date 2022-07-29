package com.calculator.controller;

import com.calculator.model.ArithmeticModel;
import com.calculator.model.MainViewModel;
import com.calculator.view.ArithmeticView;
import com.calculator.view.componet.BaseButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ArithmeticController extends BaseController {

    private ArithmeticView view;
    private ArithmeticModel model;

    private MainViewController mainController;

    public ArithmeticController(ArithmeticView view, ArithmeticModel model ){
        this.model = model;
        this.view = view;

        this.initAction();
    }

    public ArithmeticController(ArithmeticView view, ArithmeticModel model , MainViewController mainController){
        this.model = model;
        this.view = view;
        this.mainController = mainController;

        this.initAction();
    }

    public String displayValuesAndOperations(ArrayList<String> values, ArrayList<String> operations){
        String result = "";
        for (int i = 0; i < values.size() ; i++) {
            result+=values.get(i);
            if(i != values.size() - 1){
                result+=operations.get(i);
            }
        }
        return result;
    }

//    private double caculate(ArrayList<String> values, ArrayList<String> operations){
//        double result = Double.parseDouble(values.get(0));
//        for (int i = 0; i < operations.size() ; i++) {
//            if(operations.get(i) == "+"){
//                result+=Double.parseDouble(values.get(i + 1));
//            }else if(operations.get(i) == "-"){
//                result-=Double.parseDouble(values.get(i + 1));
//            }else if(operations.get(i) == "*"){
//                result*=Double.parseDouble(values.get(i + 1));
//            }else if(operations.get(i) == "/"){
//                result/=Double.parseDouble(values.get(i + 1));
//            }
//        }
//        return result;
//    }

    private double caculate(String lastValue, String currentValue, String peration){
        double result = Double.parseDouble(lastValue);
        if(peration == "+"){
            result+=Double.parseDouble(currentValue);
        }else if(peration == "-"){
            result-=Double.parseDouble(currentValue);
        }else if(peration == "*"){
            result*=Double.parseDouble(currentValue);
        }else if(peration == "/"){
            result/=Double.parseDouble(currentValue);
        }

        return result;
    }



    @Override
    public void initAction() {
        this.view.arithmeticButtons.forEach((BaseButton baseButton) -> {
            baseButton.addActionListener(this);
            baseButton.addKeyListener(this);
        });
    }

    private void opereation(String keyValue){
        if(model.getNumberKeys().indexOf(keyValue) != -1){
            model.setCurrentValue(model.getCurrentValue() +keyValue);
            view.operationTextField.setText(model.getCurrentValue());
            model.setOnWaitNumber(false);
        }else if(keyValue == "."){
            if(!model.getCurrentValue().contains(".")){
                model.setCurrentValue(model.getCurrentValue() + keyValue);
                view.operationTextField.setText(model.getCurrentValue());
                model.setOnWaitNumber(false);
            }
        }else if(keyValue == "+/-"){
            if (model.getCurrentValue()!=""){
                model.setCurrentValue(String.valueOf(Double.parseDouble(model.getCurrentValue()) * -1));
                view.operationTextField.setText(model.getCurrentValue());
            }
        }else if(model.getOperatorKeys().indexOf(keyValue) != -1){
            if (!model.getOnWaitNumber()){
                if (model.getLastValue() == ""){
                    model.setLastValue(model.getCurrentValue());
                    model.setCurrentValue("");
                    model.setResult(model.getLastValue());
                    model.setOperation(keyValue);
                    view.operationTextField.setText(model.getResult() + model.getOperation()+"__");
                }else{
                    double result = caculate(model.getLastValue(),model.getCurrentValue(),model.getOperation());
                    model.setResult(String.valueOf(result));
                    view.operationTextField.setText(model.getResult());
                    model.setOperation(keyValue);
                    model.setLastValue(model.getResult());
                }
            }else{
                model.setOperation(keyValue);
            }
            model.setCurrentValue("");
            model.setOnWaitNumber(true);
        }else if(keyValue.equalsIgnoreCase("c")){

            model.reset();
            view.operationTextField.setText(model.getResult());
        }else if(keyValue.equalsIgnoreCase("=")){
            if (!model.getOnWaitNumber()){
                double result = caculate(model.getLastValue(),model.getCurrentValue(),model.getOperation());
                model.setResult(String.valueOf(result));
                view.operationTextField.setText(model.getResult());
                model.setOperation(keyValue);
                model.setLastValue(model.getResult());
                model.setCurrentValue("");
                model.setOnWaitNumber(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();
        if (sourceObj instanceof BaseButton) {
            BaseButton src = (BaseButton)sourceObj;
            opereation(src.getText());
        }
//        if (sourceObj instanceof BaseButton) {
//            BaseButton sourceBaseMenuItem = (BaseButton)sourceObj;
//
//
//            if(model.getNumberKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
//                String currentValue =  this.model.getValues().get(model.currentValuesIndex);
//                this.model.getValues().set(model.currentValuesIndex,currentValue+sourceBaseMenuItem.getText());
//                this.view.operationTextField.setText(displayValuesAndOperations(this.model.getValues(),this.model.getOperators()));
//            }else if(model.getOperatorKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
//                if (this.model.getValues().size() != this.model.getOperators().size() && this.model.getValues().get(this.model.currentValuesIndex) != ""){
//                    this.model.getOperators().add(sourceBaseMenuItem.getText());
//                    this.model.currentValuesIndex++;
//                    this.model.getValues().add("");
//                    this.view.operationTextField.setText(displayValuesAndOperations(this.model.getValues(),this.model.getOperators()));
//                }else{
//                    this.model.getOperators().set(this.model.getOperators().size() -1 ,sourceBaseMenuItem.getText());
//                    this.view.operationTextField.setText(displayValuesAndOperations(this.model.getValues(),this.model.getOperators()));
//                }
//            }
//            else if(sourceBaseMenuItem.getText() == "C"){
//                this.model.reset();
//                this.view.operationTextField.setText(model.getValues().get(model.currentValuesIndex));
//                this.view.resultTextField.setText("");
//            }
//            else if(sourceBaseMenuItem.getText() == "="){
//                if (this.model.getValues().get(this.model.getValues().size() - 1) != ""){
//                    this.view.resultTextField.setText(String.valueOf(caculate(this.model.getValues(),this.model.getOperators())));
//                }else{
//                    this.view.resultTextField.setText("ERR");
//                }
//            }
//        }
    }

    @Override
    public JPanel getViewJpanel() {
        return this.view.getInterface();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        String key = String.valueOf(e.getKeyChar());
        opereation(key);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
