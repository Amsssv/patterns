package com.patterns.creational.abstractFactory;

import com.patterns.creational.abstractFactory.interfaceOC.GUI;
import com.patterns.creational.abstractFactory.macOC.MacGUI;
import com.patterns.creational.abstractFactory.windowsOC.WindowsGUI;

public class Main {
    public static void main(String[] args) {
        Application app = getApplication();
        app.paint();
    }

    private static Application getApplication() {
        GUI currentGUI;

        String ocName =  System.getProperty("os.name").toLowerCase();

        if (ocName.contains("windows")) {
            currentGUI = new WindowsGUI();
        } else if (ocName.contains("mac")) {
            currentGUI = new MacGUI();
        }else   {
            throw new RuntimeException("Unsupported operating system");
        }

        return new Application(currentGUI);
    }
}
