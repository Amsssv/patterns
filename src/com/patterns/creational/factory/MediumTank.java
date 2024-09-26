package com.patterns.creational.factory;

public class MediumTank extends Tank {

    public MediumTank(int power, int damage) {
        super(power, damage);
    }

    @Override
    public void shoot() {
        System.out.println("tank shooting with " + damage + " damage");
    }
}
