package com.calculator.controller;

import com.calculator.model.TrigonometryModel;
import com.calculator.view.TrigonometryView;
import com.calculator.view.componet.BaseButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TrigonometryController extends BaseController {


    private TrigonometryView trigonometryView = new TrigonometryView();
    private TrigonometryModel trigonometryModel = new TrigonometryModel();

    public TrigonometryController(TrigonometryView arithmeticView, TrigonometryModel arithmeticModel ){
        this.trigonometryModel = arithmeticModel;
        this.trigonometryView = arithmeticView;

        this.initAction();
    }


    @Override
    public void initAction() {
        this.trigonometryView.TrigonometryButtons.forEach((BaseButton baseButton) -> {
            baseButton.addActionListener(this);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();
        if (sourceObj instanceof BaseButton) {
            BaseButton sourceBaseMenuItem = (BaseButton)sourceObj;


            if(trigonometryModel.getNumberKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
                String currentValue =  this.trigonometryModel.getValue();
                this.trigonometryModel.setValue(currentValue+sourceBaseMenuItem.getText());
                this.trigonometryView.operationTextField.setText(this.trigonometryModel.getValue());


            }else if(trigonometryModel.getOperatorKeys().indexOf(sourceBaseMenuItem.getText()) != -1){
                String currentValue =  this.trigonometryModel.getValue();
                Double value = Double.parseDouble(currentValue);
                if (currentValue.length() > 0){
                    if (sourceBaseMenuItem.getText() == "1/x"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(1/value));
                    }else if (sourceBaseMenuItem.getText() == "X^2"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(Math.pow(value,2)));
                    }else if (sourceBaseMenuItem.getText() == "Sin"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(Math.sin(value)));
                    }else if (sourceBaseMenuItem.getText() == "Cos"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(Math.cos(value)));
                    }else if (sourceBaseMenuItem.getText() == "Tan"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(Math.tan(value)));
                    }else if (sourceBaseMenuItem.getText() == "Cot"){
                        this.trigonometryView.resultTextField.setText(String.valueOf(Math.cosh(value)));
                    }
                }else{
                    this.trigonometryView.resultTextField.setText("ERR");
                }

            }
            else if(sourceBaseMenuItem.getText() == "C"){
                this.trigonometryModel.reset();
                this.trigonometryView.operationTextField.setText(this.trigonometryModel.getValue());
                this.trigonometryView.resultTextField.setText("");
            }
        }
    }

    @Override
    public JPanel getViewJpanel() {
        return trigonometryView.getInterface();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
