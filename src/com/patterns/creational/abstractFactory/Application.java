package com.patterns.creational.abstractFactory;

import com.patterns.creational.abstractFactory.interfaceOC.Button;
import com.patterns.creational.abstractFactory.interfaceOC.Checkbox;
import com.patterns.creational.abstractFactory.interfaceOC.GUI;
import com.patterns.creational.abstractFactory.interfaceOC.Input;

public class Application {
    private Button button;
    private Checkbox checkbox;
    private Input input;

    public Application(GUI GUIOC) {
        this.button = GUIOC.createButton();
        this.checkbox = GUIOC.createCheckbox();
        this.input = GUIOC.createInput();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        input.paint();
    }
}
