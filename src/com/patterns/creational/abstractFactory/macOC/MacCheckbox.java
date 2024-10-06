package com.patterns.creational.abstractFactory.macOC;

import com.patterns.creational.abstractFactory.interfaceOC.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("This is Mac Checkbox");
    }
}
