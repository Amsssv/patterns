package com.patterns.creational.factory;

public class MediumTankFactory extends TankFactory {

    @Override
    public Tank createTank(int power, int damage) {
        System.out.println("Medium tank created");
        return new MediumTank(power, damage);
    }
}
