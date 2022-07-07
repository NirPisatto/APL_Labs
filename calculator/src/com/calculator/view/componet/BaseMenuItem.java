package com.calculator.view.componet;

import javax.swing.*;

public class BaseMenuItem extends JMenuItem {
    private int menuId = 0;

    public BaseMenuItem(String text, int id){
        this.setText(text);
        this.menuId = id;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
