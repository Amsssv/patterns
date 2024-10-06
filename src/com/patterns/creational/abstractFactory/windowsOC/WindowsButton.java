package com.patterns.creational.abstractFactory.windowsOC;

import com.patterns.creational.abstractFactory.interfaceOC.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
