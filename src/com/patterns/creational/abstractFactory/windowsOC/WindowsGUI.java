package com.patterns.creational.abstractFactory.windowsOC;

import com.patterns.creational.abstractFactory.interfaceOC.Button;
import com.patterns.creational.abstractFactory.interfaceOC.Checkbox;
import com.patterns.creational.abstractFactory.interfaceOC.GUI;
import com.patterns.creational.abstractFactory.interfaceOC.Input;

public class WindowsGUI implements GUI {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Input createInput() {
        return new WindowsInput();
    }
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
