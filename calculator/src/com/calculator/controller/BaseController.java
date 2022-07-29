package com.calculator.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public abstract class BaseController implements ActionListener , KeyListener {

    public abstract void initAction();

    public abstract void actionPerformed(ActionEvent e);

    public abstract JPanel getViewJpanel();

}
