package com.patterns.creational.abstractFactory.macOC;

import com.patterns.creational.abstractFactory.interfaceOC.Input;

public class MacInput implements Input {

    @Override
    public void paint() {
        System.out.println("Mac input");
    }
}
