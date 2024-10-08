package com.patterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger instance;
    private static String message = "Log file has been created  \n" ;

    private ProgramLogger() {}

    public static synchronized ProgramLogger getInstance() {
        if (instance == null) {
            instance = new ProgramLogger();
        }

        return instance;
    }

    public void addlog(String log) {
        message += log +  "\n";
    }

    public void  showLogs() {
        System.out.println(message);
    }
}
