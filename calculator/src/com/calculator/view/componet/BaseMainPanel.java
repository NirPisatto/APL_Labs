package com.calculator.view.componet;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class BaseMainPanel {
    private String fontColor = "#ffffff";
    private String bgColoer = "#323232";
    private Border borderStyle = BorderFactory.createEmptyBorder();
    private Font textFieldFont  = new Font(Font.MONOSPACED,  Font.BOLD, 34);
    private Font labelFontFont = new Font(Font.MONOSPACED,  Font.BOLD, 14);

    public JPanel currentMainPanel = new JPanel();
    public JPanel currentDisplayPanel = new JPanel();
    public JPanel currentKeyboardPanel = new JPanel();

    public JPanel operationPanel = new JPanel();
    public JLabel operationLabel = new JLabel("Operation");
    public JTextField operationTextField = new JTextField();

    public JPanel resultPanel =new JPanel();
    public JLabel resultLabel = new JLabel("Result");
    public JTextField resultTextField = new JTextField();

    private void initDisplayPanel(){
        currentDisplayPanel.setBackground(Color.decode(bgColoer));
        currentDisplayPanel.setPreferredSize(new Dimension( 550, 200 ));
        currentDisplayPanel.setLayout(new BoxLayout(currentDisplayPanel, BoxLayout.Y_AXIS));
        currentDisplayPanel.setBackground(Color.red);

        operationPanel.setLayout(new GridBagLayout());
        operationPanel.setPreferredSize(new Dimension( 550,100 ));
        operationPanel.setBackground(Color.decode(bgColoer));

        resultPanel.setLayout(new GridBagLayout());
        resultPanel.setPreferredSize(new Dimension( 550,100 ));
        resultPanel.setBackground(Color.decode(bgColoer));

        GridBagConstraints c = new GridBagConstraints();

        setDisplayLabelStyle(operationLabel);
        setDisplayLabelStyle(resultLabel);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        operationPanel.add(operationLabel,c);
        resultPanel.add(resultLabel,c);

        setDisplayTextInputStyle(operationTextField);
        setDisplayTextInputStyle(resultTextField);
        resultTextField.disable();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        operationPanel.add(operationTextField,c);
        resultPanel.add(resultTextField,c);

        currentDisplayPanel.add(operationPanel);
        currentDisplayPanel.add(resultPanel);
    }

    private void setDisplayLabelStyle(JLabel label){
        label.setBackground(Color.decode(bgColoer));
        label.setForeground(Color.decode(fontColor));
        label.setFont(labelFontFont);
    }

    private void setDisplayTextInputStyle(JTextField textField){
        textField.setBackground(Color.decode(bgColoer));
        textField.setForeground(Color.decode(fontColor));
        textField.setBorder(borderStyle);
        textField.setFont(textFieldFont);
        textField.setPreferredSize(new Dimension( 530,75 ));
        textField.setCaretColor(Color.decode(fontColor));
    }

    private void initKeyboardPanel(){
        currentKeyboardPanel.setLayout(new GridBagLayout());
        currentKeyboardPanel.setBackground(Color.decode("#D0D0D0"));
//        currentKeyboardPanel.setPreferredSize(new Dimension( 550, 700 ));
    }

    public void initLayout(){
        System.out.println("Layout inited.");
        // init
        this.initDisplayPanel();
        this.initKeyboardPanel();

//        this.currentMainPanel.setSize(550,900);
        this.currentMainPanel.setBackground(Color.decode("#ffffff"));
//        this.currentMainPanel.setLayout(new BoxLayout(currentMainPanel, BoxLayout.Y_AXIS));


        // Add in to main panel
        this.currentMainPanel.add(currentDisplayPanel);
        this.currentMainPanel.add(currentKeyboardPanel);
    }

    public JPanel getInterface(){
        return currentMainPanel;
    }

    public abstract void customStyle();
}
