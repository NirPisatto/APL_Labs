package com.calculator.view;

import com.calculator.view.componet.BaseButton;
import com.calculator.view.componet.BaseMainPanel;

import java.awt.*;
import java.util.ArrayList;

public class TrigonometryView extends BaseMainPanel {
    public ArrayList<BaseButton> TrigonometryButtons = new ArrayList<BaseButton>();
    public TrigonometryView(){
        initLayout();
        initButtons();
        customStyle();
    }

    private void initButtons(){

        GridBagConstraints grid = new GridBagConstraints();

        TrigonometryButtons.add(new BaseButton("C"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(0),grid);
        TrigonometryButtons.get(0).setValue("Clear");

        TrigonometryButtons.add(new BaseButton("+/-"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(1),grid);

        TrigonometryButtons.add(new BaseButton("1/x"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(2),grid);

        TrigonometryButtons.add(new BaseButton("X^2"));
        TrigonometryButtons.get(3).bgColoer = "#CD4F33";
        TrigonometryButtons.get(3).bgHoverColoer = "#B04129";
        TrigonometryButtons.get(3).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 0;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(3),grid);

        TrigonometryButtons.add(new BaseButton("7"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(4),grid);

        TrigonometryButtons.add(new BaseButton("8"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(5),grid);

        TrigonometryButtons.add(new BaseButton("9"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(6),grid);

        TrigonometryButtons.add(new BaseButton("Sin"));
        TrigonometryButtons.get(7).bgColoer = "#CD4F33";
        TrigonometryButtons.get(7).bgHoverColoer = "#B04129";
        TrigonometryButtons.get(7).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 1;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(7),grid);

        TrigonometryButtons.add(new BaseButton("4"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(8),grid);

        TrigonometryButtons.add(new BaseButton("5"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(9),grid);

        TrigonometryButtons.add(new BaseButton("6"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(10),grid);

        TrigonometryButtons.add(new BaseButton("Cos"));
        TrigonometryButtons.get(11).bgColoer = "#CD4F33";
        TrigonometryButtons.get(11).bgHoverColoer = "#B04129";
        TrigonometryButtons.get(11).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 2;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(11),grid);

        TrigonometryButtons.add(new BaseButton("1"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 0;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(12),grid);

        TrigonometryButtons.add(new BaseButton("2"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 1;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(13),grid);

        TrigonometryButtons.add(new BaseButton("3"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 2;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(14),grid);

        TrigonometryButtons.add(new BaseButton("Tan"));
        TrigonometryButtons.get(15).bgColoer = "#CD4F33";
        TrigonometryButtons.get(15).bgHoverColoer = "#B04129";
        TrigonometryButtons.get(15).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridx = 3;
        grid.gridy = 3;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(15),grid);

        TrigonometryButtons.add(new BaseButton("0"));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 2;
        grid.gridx = 0;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(16),grid);

        TrigonometryButtons.add(new BaseButton("."));
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 1;
        grid.gridx = 2;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(17),grid);

        TrigonometryButtons.add(new BaseButton("Cot"));
        TrigonometryButtons.get(18).bgColoer = "#CD4F33";
        TrigonometryButtons.get(18).bgHoverColoer = "#B04129";
        TrigonometryButtons.get(18).initStyle();
        grid.fill = GridBagConstraints.BOTH;
        grid.gridwidth = 1;
        grid.gridx = 3;
        grid.gridy = 4;
        this.currentKeyboardPanel.add(TrigonometryButtons.get(18),grid);
    }

    @Override
    public void customStyle() {
        this.operationLabel.setText("Value");
    }
}
