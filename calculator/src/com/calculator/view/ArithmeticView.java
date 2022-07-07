package com.calculator.view;

import com.calculator.view.componet.BaseButton;
import com.calculator.view.componet.BaseMainPanel;

import java.awt.*;
import java.util.ArrayList;

public class ArithmeticView extends BaseMainPanel {
    public ArrayList<BaseButton> arithmeticButtons = new ArrayList<BaseButton>();


    public ArithmeticView(){
        initLayout();
        initButtons();
        customStyle();
    }

    private void initButtons(){

        GridBagConstraints grid = new GridBagConstraints();

        arithmeticButtons.add(new BaseButton("C"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(arithmeticButtons.get(0),grid);
        arithmeticButtons.get(0).setValue("Clear");

        arithmeticButtons.add(new BaseButton("+/-"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(arithmeticButtons.get(1),grid);

        arithmeticButtons.add(new BaseButton("%"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(arithmeticButtons.get(2),grid);

        arithmeticButtons.add(new BaseButton("/"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(arithmeticButtons.get(3),grid);

        arithmeticButtons.add(new BaseButton("7"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(arithmeticButtons.get(4),grid);

        arithmeticButtons.add(new BaseButton("8"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(arithmeticButtons.get(5),grid);

        arithmeticButtons.add(new BaseButton("9"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(arithmeticButtons.get(6),grid);

        arithmeticButtons.add(new BaseButton("*"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(arithmeticButtons.get(7),grid);

        arithmeticButtons.add(new BaseButton("4"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(arithmeticButtons.get(8),grid);

        arithmeticButtons.add(new BaseButton("5"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(arithmeticButtons.get(9),grid);

        arithmeticButtons.add(new BaseButton("6"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(arithmeticButtons.get(10),grid);

        arithmeticButtons.add(new BaseButton("-"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(arithmeticButtons.get(11),grid);

        arithmeticButtons.add(new BaseButton("1"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(arithmeticButtons.get(12),grid);

        arithmeticButtons.add(new BaseButton("2"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(arithmeticButtons.get(13),grid);

        arithmeticButtons.add(new BaseButton("3"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(arithmeticButtons.get(14),grid);

        arithmeticButtons.add(new BaseButton("+"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(arithmeticButtons.get(15),grid);

        arithmeticButtons.add(new BaseButton("0"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 2;
        grid.gridx = 0;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(arithmeticButtons.get(16),grid);

        arithmeticButtons.add(new BaseButton("."));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 1;
        grid.gridx = 2;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(arithmeticButtons.get(17),grid);

        arithmeticButtons.add(new BaseButton("="));
        arithmeticButtons.get(18).bgColoer = "#CD4F33";
        arithmeticButtons.get(18).bgHoverColoer = "#B04129";
        arithmeticButtons.get(18).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 1;
        grid.gridx = 3;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(arithmeticButtons.get(18),grid);
    }



    @Override
    public void customStyle() {
        operationLabel.setText("Operation");
    }
}
