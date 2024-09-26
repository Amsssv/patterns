package com.patterns.creational.factory;

public abstract class Tank {
    protected int power;
    protected int damage;

    protected Tank(int power, int damage) {
        this.power = power;
        this.damage = damage;
    }

    public void shoot() { }
}
