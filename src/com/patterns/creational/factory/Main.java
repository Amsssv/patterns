package com.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        TankFactory tankFactory = createTankByClass("medium");
        Tank tank = tankFactory.createTank(200, 800);
        tank.shoot();
    }

    static TankFactory createTankByClass(String className) {
        if (className.equalsIgnoreCase("light")) {
            return new LightTankFactory();
        } else if (className.equalsIgnoreCase("medium")) {
            return new MediumTankFactory();
        } else   {
            throw new RuntimeException("Unsupported class of vehicle: " + className);
        }
    }
}
