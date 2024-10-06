package com.patterns.creational.abstractFactory.macOC;

import com.patterns.creational.abstractFactory.interfaceOC.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
