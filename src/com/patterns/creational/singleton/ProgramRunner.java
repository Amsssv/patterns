package com.patterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger logger = ProgramLogger.getInstance();

        logger.addlog("Hello World");
        logger.addlog("second argument");
        anotherMethod();
        logger.addlog("finishing logging");

        logger.showLogs();
    }

    public static void anotherMethod() {
        ProgramLogger logger = ProgramLogger.getInstance();
        logger.addlog("logging another method");
    }
}
