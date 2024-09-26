package com.patterns.creational.factory;

public class LightTank extends Tank {

    public LightTank(int power, int damage) {
        super(power, damage);
    }

    @Override
    public void shoot() {
        System.out.println("tank shooting with " + damage + " damage");
    }
}
