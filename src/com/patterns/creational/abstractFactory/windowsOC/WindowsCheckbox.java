package com.patterns.creational.abstractFactory.windowsOC;

import com.patterns.creational.abstractFactory.interfaceOC.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("This is Windows Checkbox");
    }
}
