package com.calculator.controller;

import com.calculator.model.ArithmeticModel;
import com.calculator.view.ArithmeticView;
import com.calculator.view.componet.BaseButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class ArithmeticController extends BaseController {

    private ArithmeticView arithmeticView = new ArithmeticView();
    private ArithmeticModel arithmeticModel = new ArithmeticModel();

    public ArithmeticController(ArithmeticView arithmeticView, ArithmeticModel arithmeticModel ){
        this.arithmeticModel = arithmeticModel;
        this.arithmeticView = arithmeticView;

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

    private double caculate(ArrayList<String> values, ArrayList<String> operations){
        double result = Double.parseDouble(values.get(0));
        for (int i = 0; i < operations.size() ; i++) {
            if(operations.get(i) == "+"){
                result+=Double.parseDouble(values.get(i + 1));
            }else if(operations.get(i) == "-"){
                result-=Double.parseDouble(values.get(i + 1));
            }else if(operations.get(i) == "*"){
                result*=Double.parseDouble(values.get(i + 1));
            }else if(operations.get(i) == "/"){
                result/=Double.parseDouble(values.get(i + 1));
            }
        }
        return result;
    }



    @Override
    public void initAction() {
        this.arithmeticView.arithmeticButtons.forEach((BaseButton baseButton) -> {
            baseButton.addActionListener(this);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();
        if (sourceObj instanceof BaseButton) {
            BaseButton sourceBaseMenuItem = (BaseButton)sourceObj;


            if(arithmeticModel.getNumberKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
                String currentValue =  this.arithmeticModel.getValues().get(arithmeticModel.currentValuesIndex);
                this.arithmeticModel.getValues().set(arithmeticModel.currentValuesIndex,currentValue+sourceBaseMenuItem.getText());
                this.arithmeticView.operationTextField.setText(displayValuesAndOperations(this.arithmeticModel.getValues(),this.arithmeticModel.getOperators()));
            }else if(arithmeticModel.getOperatorKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
                if (this.arithmeticModel.getValues().size() != this.arithmeticModel.getOperators().size() && this.arithmeticModel.getValues().get(this.arithmeticModel.currentValuesIndex) != ""){
                    this.arithmeticModel.getOperators().add(sourceBaseMenuItem.getText());
                    this.arithmeticModel.currentValuesIndex++;
                    this.arithmeticModel.getValues().add("");
                    this.arithmeticView.operationTextField.setText(displayValuesAndOperations(this.arithmeticModel.getValues(),this.arithmeticModel.getOperators()));
                }else{
                    this.arithmeticModel.getOperators().set(this.arithmeticModel.getOperators().size() -1 ,sourceBaseMenuItem.getText());
                    this.arithmeticView.operationTextField.setText(displayValuesAndOperations(this.arithmeticModel.getValues(),this.arithmeticModel.getOperators()));
                }
            }
            else if(sourceBaseMenuItem.getText() == "C"){
                this.arithmeticModel.reset();
                this.arithmeticView.operationTextField.setText(arithmeticModel.getValues().get(arithmeticModel.currentValuesIndex));
                this.arithmeticView.resultTextField.setText("");
            }
            else if(sourceBaseMenuItem.getText() == "="){
                if (this.arithmeticModel.getValues().get(this.arithmeticModel.getValues().size() - 1) != ""){
                    this.arithmeticView.resultTextField.setText(String.valueOf(caculate(this.arithmeticModel.getValues(),this.arithmeticModel.getOperators())));
                }else{
                    this.arithmeticView.resultTextField.setText("ERR");
                }
            }
        }
    }

    @Override
    public JPanel getViewJpanel() {
        return  this.arithmeticView.getInterface();
    }
}
