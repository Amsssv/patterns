package com.patterns.creational.abstractFactory.macOC;

import com.patterns.creational.abstractFactory.interfaceOC.Button;
import com.patterns.creational.abstractFactory.interfaceOC.Checkbox;
import com.patterns.creational.abstractFactory.interfaceOC.GUI;
import com.patterns.creational.abstractFactory.interfaceOC.Input;

public class MacGUI implements GUI {

    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public Input createInput() {
        return new MacInput();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
