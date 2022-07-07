package com.calculator.view.componet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BaseButton extends JButton {
    private String value;
    private String fontColor = "#ffffff";
    public String bgColoer = "#818181";
    public String bgHoverColoer = "#666666";
    private Font buttonFont = new Font(Font.MONOSPACED,  Font.BOLD, 44);
    public BaseButton(String text){
        this.setText(text);
        this.initStyle();
    }

    public void initStyle(){
        this.setPreferredSize(new Dimension(560/4, 640/5));
        this.setBackground(Color.decode(bgColoer));
        this.setForeground(Color.decode(fontColor));
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setFont(buttonFont);
        this.setOpaque(true);
        this.validate();

        this.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent evt)
            {
                setBackground(Color.decode(bgHoverColoer));
            }
            public void mouseExited(MouseEvent evt)
            {
                setBackground(Color.decode(bgColoer));
            }
        });
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
