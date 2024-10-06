package com.patterns.creational.abstractFactory.windowsOC;

import com.patterns.creational.abstractFactory.interfaceOC.Input;

public class WindowsInput implements Input {

    @Override
    public void paint() {
        System.out.println("Windows input");
    }
}
