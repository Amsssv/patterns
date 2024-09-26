package com.patterns.creational.factory;

public class LightTankFactory extends TankFactory {

    @Override
    public Tank createTank(int power, int damage) {
        System.out.println("Light tank created");
        return new LightTank(power, damage);
    }
}
